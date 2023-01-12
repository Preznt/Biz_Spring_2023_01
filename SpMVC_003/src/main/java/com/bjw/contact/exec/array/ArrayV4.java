package com.bjw.contact.exec.array;

public class ArrayV4 {
	public static void main(String[] args) {
		
		/**
		 * 1 부터 100 까지 중의 임의 숫자 1개를 만들어라
		 */
		int rndNumber = (int)(Math.random() *100) + 1;
		
		/**
		 * 정수형 배열 nums 를 만들고 요소 개수를 10개로 초기화 한후 
		 * 각각의 요소에 정수 1~100까지 중 임의 수를 생성하여 저장
		 */
		int[] nums= new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() *100) + 1;
//			System.out.println(nums[i]);
		}
		/**
		 * nums 배열에 담긴 모든 요소를 화면에 출력하고
		 * 요소의 값을 덧셈하여 결과를 출력
		 */
		int sum = 0;
		for(int i= 0; i < nums.length; i++) {
			// %d\t 숫자 1개를 출력하고 tab(8칸의 빈칸)을 출력하라
			System.out.printf("%d\t", nums[i]);
			sum += nums[i];
		}
		System.out.print("\n"); // println()
		System.out.println(sum);

//		for(int i= 0; i < nums.length; i++) {
//			sum += nums[i];
//		}
//		System.out.printf("합계 : %d", sum);
		
		/**
		 * 배열에 저장된 요소중에 짝수만 출력하고
		 * 짝수들을 합산하여 출력
		 */
		
		int evenSum = 0;
		for(int i= 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.printf("%d\t", nums[i]);	
				evenSum += nums[i];
			}
		}
		
		System.out.printf("\n%d\n",evenSum);
	}
}
