package Graph.Problems;

import java.util.ArrayList;

public class PrerequisiteTasks {
    
    //Solution: https://www.youtube.com/watch?v=iaaObeAEgxI. The solution in this video exceeded the allocated time in both leetcode and geekforgeeks. 
    //I optimised it this the following code and it worked perfectly
    //Question: https://leetcode.com/problems/course-schedule/ and https://practice.geeksforgeeks.org/problems/prerequisite-tasks/1
    public static boolean isPossible(int N, int[][] prerequisites) {
        // Array of arrays
        ArrayList<Integer>[] adj = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList();
        }
        for (int[] pre : prerequisites) {
            adj[pre[0]].add(pre[1]);
        }
        boolean[] visited = new boolean[N];
        boolean[] onpath = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!visited[i] && dfs(adj, visited, onpath, i)){
                return false;
            } 
        }
        return true;
    }

    static boolean  dfs(ArrayList<Integer>[] adj, boolean[] visited, boolean[] onpath, int i){
        if(visited[i]){
            return false;
        }
        onpath[i] = visited[i] = true;

        for (int ad: adj[i]) {
            if(onpath[ad] || dfs(adj, visited, onpath, ad)){
                return true;
            }
        }
        return onpath[i] = false;
    }

    public static void main(String[] args) throws Exception {
        int N = 4;
        int[][] prerequisites = { { 1, 0 }, {0,1}};

        System.out.println(isPossible(N, prerequisites));
    }
}
