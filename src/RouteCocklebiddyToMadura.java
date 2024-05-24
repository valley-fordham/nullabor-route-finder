import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteCocklebiddyToMadura implements Route {

    private final Stop start = new Stop(88, StopType.BAY, StopDirection.SOUTH);
    private final Stop destination = new Stop(0, StopType.BAY, StopDirection.NORTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteCocklebiddyToMadura() {
        stops.add(destination);

        stops.add(new Stop(2, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(5.7, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(10, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(12, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(14, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(16.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(23.5, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(28, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(36, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(36.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(39, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(43, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(46, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(48.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(53.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(61, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(71.5, StopType.BAY, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(77.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(80, StopType.OFFROAD_BAY, StopDirection.NORTH));

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
