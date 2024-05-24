import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteNorsemanToBalladonia implements Route {

    private final Stop start = new Stop(185, StopType.OFFROAD, StopDirection.SOUTH);
    private final Stop destination = new Stop(0.0, StopType.BAY, StopDirection.NORTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteNorsemanToBalladonia() {
        stops.add(destination);
        stops.add(new Stop(9.2, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(26, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(32.6, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(36.8, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(38.2, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(43.1, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(48.2, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(49.3, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(56.6, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(62.6, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(79.8, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(85.3, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(86.6, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(93.9, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(100.3, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(105.0, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(108.5, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(112, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(115, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(120.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(124, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(133, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(136.7, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(140, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(145, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(148, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(148.5, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(154, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(158.8, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(164.1, StopType.OFFROAD_BAY, StopDirection.NORTH));
        stops.add(new Stop(166.3, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(167.3, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(168.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(171, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(180, StopType.BAY, StopDirection.SOUTH));
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
