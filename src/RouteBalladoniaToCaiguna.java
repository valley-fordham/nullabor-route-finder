import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteBalladoniaToCaiguna implements Route {

    private final Stop start = new Stop(141.2, StopType.BAY, StopDirection.SOUTH);
    //private final Stop start = new Stop(175.8, StopType.BAY, StopDirection.NORTH);
    private final Stop destination = new Stop(0, StopType.BAY, StopDirection.NORTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteBalladoniaToCaiguna() {
        stops.add(destination);

        stops.add(new Stop(3.6, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(4.7, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(9.2, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(14.7, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(19, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(30, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(34.2, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(37.4, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(37.6, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(40.8, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(42.9, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(44.1, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(46, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(47.8, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(49.8, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(50.7, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(61, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(62.4, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(64.2, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(69.2, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(71, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(75.1, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(76.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(78.8, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(80.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(81.2, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(86, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(92, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(93.5, StopType.BAY, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(96.8, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(98.2, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(99, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(100.3, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(101, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(101.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(102.4, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(104.2, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(104.8, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(110.3, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(113.8, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(115.2, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(118.4, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(120.6, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(127.4, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(135.0, StopType.OFFROAD, StopDirection.NORTH));
//        stops.add(new Stop(141.2, StopType.BAY, StopDirection.SOUTH));
//        stops.add(new Stop(157.9, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
//        stops.add(new Stop(159.2, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
//        stops.add(new Stop(161, StopType.BAY, StopDirection.SOUTH));
//        stops.add(new Stop(170.5, StopType.BAY, StopDirection.NORTH));

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
