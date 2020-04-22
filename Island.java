import java.util.*;

public class Island {

    public int numIslands(char[][] grid) {
        int count = 0;
        if(grid.length==0 || grid[0].length == 0) return count;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i< visited.length;i++){
            for(int j=0; j< visited[0].length; j++){
                visited[i][j] = false;
            }
        }
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[0].length;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(grid, visited, i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || i>= grid.length || j <0 || j>=grid[0].length || grid[i][j] == '0' || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i,j+1);
        dfs(grid, visited, i,j-1);
        dfs(grid, visited, i+1,j);
        dfs(grid, visited, i-1,j);
    }
}