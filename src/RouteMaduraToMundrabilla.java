import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteMaduraToMundrabilla implements Route {

    private final Stop start = new Stop(113, StopType.BAY, StopDirection.NORTH);
    private final Stop destination = new Stop(0, StopType.BAY, StopDirection.NORTH);


    private final ArrayList<Stop> stops = new ArrayList<>();

    public RouteMaduraToMundrabilla() {
        stops.add(destination);

        stops.add(new Stop(9.5, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(14, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(18.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(25.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(26, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(31, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(39.5, StopType.BAY, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(42.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(53.5, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(57.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(66.5, StopType.OFFROAD_BAY, StopDirection.SOUTH));
        stops.add(new Stop(72, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(73, StopType.BAY, StopDirection.SOUTH));
        stops.add(new Stop(74, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(82, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(88, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(92, StopType.BAY, StopDirection.NORTH));
        stops.add(new Stop(98.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(99.5, StopType.OFFROAD, StopDirection.SOUTH));
        stops.add(new Stop(100, StopType.OFFROAD, StopDirection.SOUTH_NORTH));
        stops.add(new Stop(107.5, StopType.OFFROAD, StopDirection.NORTH));
        stops.add(new Stop(109.5, StopType.OFFROAD, StopDirection.NORTH));

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
