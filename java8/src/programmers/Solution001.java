package programmers;

import java.util.Arrays;

public class Solution001 extends Exam001{
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
	/*	int idx = 0;
		for(int[] command : commands) {
			int[] temp = Arrays.copyOfRange(array, (command[0]-1),command[1]);
			Arrays.sort(temp);
			answer[idx] = temp[command[2]-1];
			idx++;
		}
		*/
		for(int i=0; i<commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.parallelSort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;

		
		
	}

}
