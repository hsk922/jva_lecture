package com.urdomain.test;

public class Lotto {

	public static void main(String[] args) {
				
		int[] arr = new int[6];
		
		System.out.println("** 이번 주 로또 추천 번호 **");
		System.out.println("------------------------");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45) + 1;// int  형 주는 이유는 (Math.random()*45) + 1이 더블형이기떄문
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {	
					i--;
					break;
					}
				}
			}
		for(int i=0; i<arr.length; i++) {    //향상된 for문 사용이 편함
			System.out.print(" " + arr[i] + " ");
		}
		
		
		System.out.println();
		System.out.println("------------------------");
		//로또 번호가 저장될 배열 선언
		//그 배열에 번호 입력 ( for문 필수 사용)
		//배열내용 출력 (for문 필수 사용)
		
		//중복검사 필요
		
		
		 int a = (int) 3.14;
		 System.out.println(a);
	}

}
