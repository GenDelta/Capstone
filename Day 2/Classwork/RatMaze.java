public class RatMaze {
    public static void main(String[] args) {
        int [][]maze = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };

        boolean [][]visited = new boolean[maze.length][maze.length];

        solve(maze, 0, 0, "", visited);
    }

    public static void solve(int maze[][], int r, int c, String path, boolean visited[][]) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length ||
            maze[r][c] == 0 || visited[r][c]) {
            return;
        }

        visited[r][c] = true;

        solve(maze, r-1, c, path + "U", visited); 
        solve(maze, r+1, c, path + "D", visited); 
        solve(maze, r, c-1, path + "L", visited); 
        solve(maze, r, c+1, path + "R", visited); 

        visited[r][c] = false;
    }
}
