package com.urdomain.test;

public class loading {
	
	//�ʵ�
	int load;
	
	
	//������

	
	//�޼ҵ�
	int loading() {
		return load;
	}
	
	void loadOn() {
		System.out.println("�ý��� ������ Ȯ���մϴ�.");
	}
	
	void nowloading() {
		for(int i=0; i<=100; i+=25) {
			load = i;
			System.out.println("�ε���...  " + load + "%");
		}
		
	}
	
	
}
