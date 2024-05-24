import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteCaigunaToCocklebiddy implements Route {

    private final Stop start = new Stop(63.5, StopType.BAY, StopDirection.SOUTH);
    private final Stop destination = new Stop(0, StopType.BAY, StopDirection.NORTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteCaigunaToCocklebiddy() {
        stops.add(destination);

        stops.add(new Stop(7, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(11.5, StopType.BAY, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(20.7, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(21.2, StopType. OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(25, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(26.1, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(29.5, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(34.5, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(38.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(43.2, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(53.5, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(54, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(55.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(58.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(61.5, StopType.OFFROAD, StopDirection.SOUTH_NORTH));

        stops.add(start);
    }

    @Override
    public Stop getStartLocation() {
        return start;
    }

    @Override
    public Stop getDestinationLocation() {
        return destination;
    }

    @Override
    public List<Stop> getRoute() {
        return Collections.unmodifiableList(stops);
    }
}
