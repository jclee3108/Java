import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution_53 {
	public int answer = 0;
    public boolean[] visit;
    
    public int solution(int k, int[][] dungeons) {
        
    	visit = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    	
    	
    }

    public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }
}





public class coding_53 {
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		Solution_53 sol = new Solution_53();
		System.out.println(sol.solution(k, dungeons));
	}
}
