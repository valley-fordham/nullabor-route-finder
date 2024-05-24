import java.util.*;

public class RouteFinder {

    public static final double LEG_ONE_TOLERANCE = 21.0d; // select maximum distance for the daily leg 1 walk
    public static final double LEG_TWO_TOLERANCE = 17.0d; // select maximum distance for the daily leg 2 walk
    public static final double TOTAL_TOLERANCE = 35.0d; // select maximum distance allowed to be travelled for a day (two legs)

    private static final Route route = new RouteBalladoniaToCaiguna(); // select the route implementation
    
    public static void main(String[] args) throws Exception {

        Stop currentStop = route.getStartLocation();

        List<Stop> stops = route.getRoute();

        List<Stop> unacceptableFirstStops = new ArrayList<>();
        Map<Stop, List<Stop>> unacceptableStopCombinations = new HashMap<>();

        int dayCount = 1;

        System.out.println("\n" + route.getClass().getSimpleName());
        System.out.println("Start: " + String.format("%.1f", (currentStop.distanceFromGoal())) + " / " + currentStop + "\n");

        while (true) {

            Stop firstStop = getNextStop(currentStop, stops, DayLeg.ONE, unacceptableFirstStops);
            if (firstStop == null) {
                System.out.println("Completed route");
                break;
            } else {
                try {
                    //System.out.println("Potential stop found: " + firstStop);
                    List<Stop> unacceptableStops = (unacceptableStopCombinations.get(firstStop) == null ? new ArrayList<>() : unacceptableStopCombinations.get(firstStop));;
                    Stop goalStop = getNextStop(firstStop, stops, DayLeg.TWO, unacceptableStops);

                    if (currentStop.distanceFromGoal() - goalStop.distanceFromGoal() > TOTAL_TOLERANCE) {
                        //System.out.println("Combination exceeds maximum daily walk distance. " + currentStop + " && " + goalStop);
                        List<Stop> badList = unacceptableStopCombinations.get(firstStop);
                        if (badList != null) {
                            badList.add(goalStop);
                        } else {
                            badList = new ArrayList<>();
                            badList.add(goalStop);
                            unacceptableStopCombinations.put(firstStop, badList);
                        }
                        continue;
                    }

                    System.out.println("Day " + dayCount);
                    dayCount++;
                    if (currentStop.distanceFromGoal() - goalStop.distanceFromGoal() <= LEG_ONE_TOLERANCE) {
                        System.out.println("Leg One: " + String.format("%.1f", (currentStop.distanceFromGoal() - goalStop.distanceFromGoal())) + " / " + goalStop );
                        System.out.println("Leg Two: N/A\n");
                    } else {
                        System.out.println("Leg One: " + String.format("%.1f", (currentStop.distanceFromGoal() - firstStop.distanceFromGoal())) + " / " + firstStop);
                        System.out.println("Leg Two: " + String.format("%.1f", (firstStop.distanceFromGoal() - goalStop.distanceFromGoal())) + " / " + goalStop + "\n");
                    }
                    currentStop = goalStop;
                    unacceptableFirstStops.clear();
                } catch (Exception e) {
                    // This combination didn't work. Remove the DayLeg.ONE node and try again
                    //System.out.println("Stop not found for Leg Two, Leg One potential stop unacceptable.");
                    unacceptableFirstStops.add(firstStop);
                }
            }
        }
    }
    
    public static Stop getNextStop(Stop currentStop, List<Stop> stops, DayLeg dayLeg, List<Stop> badStops) throws Exception {
        // assume we have already arrived
        if (currentStop == null) {
            return null;
        }

        // Set the tolerance for this stop calculation based on the leg
        final double tolerance = dayLeg.equals(DayLeg.ONE) ? LEG_ONE_TOLERANCE : LEG_TWO_TOLERANCE;

        int currentStopIndex = 0;
        while (currentStopIndex < stops.size()) {
            if (stops.get(currentStopIndex).equals(currentStop)) {
                break;
            }
            currentStopIndex++;
        }

        // we can't look any further for the next stop
        if (currentStopIndex == 0) {
            return null;
        }

        Stop validStop = null;
        int nextStopIndex = 1;

        // check if the next stop is within the tolerance for this leg of the day's journey
        while (currentStop.distanceFromGoal() - stops.get(currentStopIndex - nextStopIndex).distanceFromGoal() <= tolerance ) {
            Stop nextStop = stops.get(currentStopIndex - nextStopIndex);

            // we can't look any further for the next step
            if (nextStop == null) {
                break;
            }
            nextStopIndex++;

            // For Leg One, any type of park is OK, but for Leg two we need an offroad-bay or a bay
            if (!badStops.contains(nextStop)) {
                if ((dayLeg.equals(DayLeg.ONE))) {
                    validStop = nextStop;
                } else if (dayLeg.equals(DayLeg.TWO) && nextStop.type() != StopType.OFFROAD) {
                    validStop = nextStop;
                }
            }

            // we can't look any further for the another step
            if (currentStopIndex - nextStopIndex < 0) {
                break;
            }
        }

        if (validStop == null) {
            throw new Exception("Unable to find a valid stop from:" + currentStop + " for day leg:" + dayLeg);
        }

        return validStop;
    }
}
