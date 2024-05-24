import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteWABorderToNullarborRoadhouse implements Route {

    private final Stop start = new Stop(175, StopType.BAY, StopDirection.SOUTH);
    private final Stop destination = new Stop(0, StopType.BAY, StopDirection.NORTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteWABorderToNullarborRoadhouse() {
        stops.add(destination);

        stops.add(new Stop(17, StopType.OFFROAD, StopDirection.SOUTH)); // need data
        stops.add(new Stop(26, StopType.BAY, StopDirection.SOUTH)); // need data
        stops.add(new Stop(37.5, StopType.BAY, StopDirection.SOUTH)); // need data
        stops.add(new Stop(41.5, StopType.OFFROAD, StopDirection.SOUTH)); // need data
        stops.add(new Stop(45.5, StopType.OFFROAD, StopDirection.SOUTH)); // need data
        stops.add(new Stop(47, StopType.OFFROAD, StopDirection.SOUTH)); // need data
        stops.add(new Stop(53, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(60, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(65, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(66, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(68, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(74.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(77, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(82, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(88, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(90, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(93, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(95, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(97, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(101, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(102, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(108, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(110, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(111, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(114, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(115, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(117, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(120, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(121, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(125.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(128, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(132, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(139, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(143, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(147, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(150, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(151, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(156, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(158, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(159, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(163, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(166, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(168, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(173, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(174, StopType.OFFROAD, StopDirection.SOUTH));

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
