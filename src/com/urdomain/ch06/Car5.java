package com.urdomain.ch06;

public class Car5 {		//return��
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;												//���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;	// false�� ����
		}															//���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;		//true�� ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -=1;											//���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ带 ���� ����
			} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return;		//�޼ҵ� ���� ����
			}
		}
	}
	
}
