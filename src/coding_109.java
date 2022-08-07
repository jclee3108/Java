import java.util.HashSet;

/*
순위	당첨 내용
1	6개  번호가 모두 일치
2	5개  번호가 일치
3	4개  번호가 일치
4	3개  번호가 일치
5	2개  번호가 일치
6(낙첨)	그 외
*/

class Solution_109 {
	public int [] solution(int[] lottos, int[] win_nums) {

		HashSet<Integer> lotto_num = new HashSet<>();
		HashSet<Integer> win_num = new HashSet<>();
		
		int zero_cnt = 0 ;
		for(int l : lottos) {
			
			if(l != 0) {
				lotto_num.add(l);	
			}else {
				zero_cnt += 1;
			}
		}
		
		for(int l : win_nums) {
			if(l != 0) {
				win_num.add(l);	
			}
		}
		
		lotto_num.retainAll(win_num);  
		
//		result[0] = lotto_num.size();
//		result[1] = lotto_num.size() + zero_cnt;
		
		int max_cnt = lotto_num.size() + zero_cnt; 
		int min_cnt = lotto_num.size(); 
		

		
		int[] answer = {0,0};
		answer[0] = ranking(max_cnt);
		answer[1] = ranking(min_cnt);
		
		
        return answer;
    }
	
	public static int ranking(int cnt) {
		
		if(cnt == 6) {
			return 1;
		}else if (cnt == 5) {
			return 2;
		}else if (cnt == 4) {
			return 3;
		}else if (cnt == 3) {
			return 4; 
		}else if (cnt == 2) {
			return 5; 
		}else {
			return 6;
		}
	}
	
}



public class coding_109 {

	public static void main(String[] args) {
		Solution_109 sol = new Solution_109();
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
//		[3,5]
//		int [] lottos = {0, 0, 0, 0, 0, 0};
//		int [] 	win_nums = {38, 19, 20, 40, 15, 25};
//		[1,6]
//		int [] lottos = {45, 4, 35, 20, 3, 9};
//		int [] 	win_nums = {20, 9, 3, 45, 4, 35};
//		[1,1]
		
		System.out.println(sol.solution(lottos, win_nums));

	}

}
