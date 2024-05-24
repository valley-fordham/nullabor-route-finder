A (hastily made) tool to help find optimal routes while travelling across the Nullarbor, based on provided parameters.

- Each route is defined as in implementation of the 'Route' interface.
- Routes are a list of stops, where the distance from the goal is provided as a constructor parameter to the stop
- Actual Algorithm lives in the the RouteFinder class
- Provide values for the 4 static 'application parameters' at the top of the RouteFinder class to configure the algorithm

Algorithm is simple:
1. Look for any stop as far as possible from the goal that is within the defined leg 1 tolerance value
2. Look for an OFFROAD BAY or BAY stop within the defined leg 2 tolerance from the first stop.
3. If a leg 2 stop cannot be found, mark the leg 1 stop as an invalid leg 1 stop (excluding it from the algorithm) and try again
4. If the combination of a leg 1 and leg 2 stop exceeds the defined total allowable distance for the day, mark the combination as invalid (excluding it from the algorithm) and try again
