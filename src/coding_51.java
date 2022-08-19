
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution_51 {
	 public int[] solution(int[] prices) {
		 
	        int[] answer = {};
	        // 큐 생성 
            Queue<Integer> pricesQue = new LinkedList<>();
            ArrayList<Integer> answerArrayList = new ArrayList<>();

            for(int price : prices)
            {
            	// 배열데이터를 큐에 넣기
                pricesQue.offer(price);
            }

            int price = 0;
            int time = 0;
            
            while(!pricesQue.isEmpty()) // 큐가 다 없어질때까지 
            {
                time=0;
                price = pricesQue.peek(); // 큐의 먼저 들어온 데이터 넣기 (0,1,2,3,4 ...)
                pricesQue.poll(); // 큐의 데이터 삭제 (선입선출)


                //마지막 가격이면 바로 종료
                if(pricesQue.isEmpty()) // 마지막이면 0으로 셋팅 (다 삭제 됨)
                {
                    answerArrayList.add(0);
                    break;
                }

                Iterator<Integer> iterator = pricesQue.iterator();
                int camparePrices=0;
                while(iterator.hasNext())
                {
                    time++;
                    camparePrices = iterator.next();
                    if(price > camparePrices)
                    {
                        break;
                    }
                }
                answerArrayList.add(time);
            }
            // arrayList -> array 로 변경
            answer = new int[answerArrayList.size()];
            for ( int i=0; i<answerArrayList.size(); i++)
            {
                answer[i] = answerArrayList.get(i);
            }


            return answer;
	}
}





public class coding_51 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		Solution_51 sol = new Solution_51();
		System.out.println(sol.solution(prices));
	}
}
