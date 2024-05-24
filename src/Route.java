import java.util.List;

public interface Route {

    Stop getStartLocation();
    Stop getDestinationLocation();

    List<Stop> getRoute();
}
