import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteMundrabillaToWABorder implements Route {

    private final Stop start = new Stop(75, StopType.BAY, StopDirection.NORTH);
    private final Stop destination = new Stop(0, StopType.BAY, StopDirection.SOUTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteMundrabillaToWABorder() {
        stops.add(destination);

        stops.add(new Stop(8, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(11, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(14, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(15.5, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(17.5, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(28, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(31, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(36.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(39.5, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(44.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(46.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(51.5, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(59.5, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(60, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(71, StopType.BAY, StopDirection.SOUTH));

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
