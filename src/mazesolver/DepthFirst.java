package mazesolver;

import java.util.List;

public class DepthFirst {
    public static boolean searchPath(int[][] maze, int x, int y, List<Integer> path) {
        if (x < 0 || x >= maze[0].length || y < 0 || y >= maze.length) {
            // Current position is outside the maze bounds
            return false;
        }

        if (maze[y][x] == 9) {
            // Destination reached
            path.add(x);
            path.add(y);
            return true;
        }

        if (maze[y][x] == 0) {
            // Mark current position as visited
            maze[y][x] = 2;

            // Explore neighboring positions recursively
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] direction : directions) {
                int dx = direction[0];
                int dy = direction[1];
                if (searchPath(maze, x + dx, y + dy, path)) {
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
        }

        return false;
    }
}
