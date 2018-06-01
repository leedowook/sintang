package d0531;

import java.util.Arrays;
import java.util.Collections;

public class arraym {
	public static void main(String[] args) {
		/*int[] score= {100,90,60};*/
		String[] score= {"하하하ㅏ하","가나다","마다낟"};//한글 모음이나 자음 한글자만 들어가면 그게 더 낮음
		//한글 내림차순의 순서는 1.가<~~~<하
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		System.out.println();
		/*Arrays.sort(score);//내읾차순
*/		Arrays.sort(score,Collections.reverseOrder());//오름차순 내림차순을 거꾸로함
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
	}
}
