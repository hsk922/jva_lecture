package com.urdomain.test;

public class Lotto {

	public static void main(String[] args) {
				
		int[] arr = new int[6];
		
		System.out.println("** �̹� �� �ζ� ��õ ��ȣ **");
		System.out.println("------------------------");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45) + 1;// int  �� �ִ� ������ (Math.random()*45) + 1�� �������̱⋚��
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {	
					i--;
					break;
					}
				}
			}
		for(int i=0; i<arr.length; i++) {    //���� for�� ����� ����
			System.out.print(" " + arr[i] + " ");
		}
		
		
		System.out.println();
		System.out.println("------------------------");
		//�ζ� ��ȣ�� ����� �迭 ����
		//�� �迭�� ��ȣ �Է� ( for�� �ʼ� ���)
		//�迭���� ��� (for�� �ʼ� ���)
		
		//�ߺ��˻� �ʿ�
		
		
		 int a = (int) 3.14;
		 System.out.println(a);
	}

}
