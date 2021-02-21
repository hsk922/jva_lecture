package com.urdomain.test;

import java.util.Scanner;

public class Computer {
	//�ʵ�
	String windowsVersion = "Windows 7 Professional K";
	String processor = "Intel(R) i5-4460 CPU @ 3.20GHz";
	String ram = "12.0GB";
	String systemType = "64bit";
	
	int load;  //�ε��Լ��κ�.
	
	//------------------------------------------------------------------------------------------
	//					�ý������� ���
	public void sysinfo() throws InterruptedException {
		System.out.println("==================================");
		System.out.println("������ ����: " + windowsVersion);
		System.out.println("                                  ");
		System.out.println("���μ���: " + processor);
		System.out.println("                                  ");
		System.out.println("��: " + ram);
		System.out.println("                                  ");
		System.out.println("�ý��� ����: " + systemType);
		System.out.println("==================================");
		System.out.println();										//������ ���� ���� �޽��� ����ϰų� , �������� ���� Ű �Է¹޴� ��� �߰�. (ex�ƹ�Ű�� ���� �� �������� ���ϴ�. )
		Thread.sleep(3000); //3�� ���
	}
	
	// ��¸� �ϴ� �Լ�
	
	// 
	
	//------------------------------------------------------------------------------------------
	//				����ȭ��
	public void powerOn() throws InterruptedException {
		System.out.println();	
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("              ASRock              ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("==================================");
		System.out.println();	
		System.out.println();				// �ð� ������ �ΰ� ����ϵ���.
		Thread.sleep(1500); //1.5�� ���
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("               ����                ");
		System.out.println("                ����               ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("         Winows�� �����ϴ� ��         ");
		System.out.println("       Microsoft Coperation       ");
		System.out.println("==================================");
		System.out.println();	
		System.out.println();				// �ð� ������ �ΰ� ����ϵ���.
		Thread.sleep(1500); //1�� ���
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("              (�α���)              ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("          Administrator           ");
		System.out.println("                                  ");
		System.out.println("=================================="); 
		System.out.println();	
		System.out.println();	
	}
	//------------------------------------------------------------------------------------------
	public void powerOff() throws InterruptedException {
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("          �ý����� �����մϴ�.          ");
		System.out.println("==================================");
		System.out.println();	
		System.out.println();	
		Thread.sleep(1500); //1.5�� ���
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("==================================");
		System.out.println();	
		System.out.println();	
	}
	//------------------------------------------------------------------------------------------
	public static String winPw() {
		
		return "abcd1234";
	}
	//------------------------------------------------------------------------------------------
	public void ee(String str) {
		ee(str);				
	}
	//------------------------------------------------------------------------------------------
	public void ee(int a) {
		ee(a);
	}
	//------------------------------------------------------------------------------------------
	public void ee(double w) {
		ee(w);
	}
	//------------------------------------------------------------------------------------------
	//powerOff�� pwCheck�ϴ� �Լ��� ����� �����ϵ���
	//------------------------------------------------------------------------------------------
	public void winlogin(String pw) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int j=0;
		while (true) {
			System.out.print("      ��ȣ : ");
			pw = scanner.nextLine(); // ��ȣ �Է½� ������ �ڸ� �� ��� �κ� �ƽ��׸�ó���� ��� ����
			//System.out.println("==================================");// �Է¶� �ؿ� �� ���� ����ϰ� ����.
			if(pw.equals(winPw()) )  {
				System.out.println("");
				System.out.println("==================================");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("             ȯ���մϴ�.             ");
				System.out.println("          Administrator��.        ");
				System.out.println("==================================");
				System.out.println();	
				System.out.println();	
				Thread.sleep(1500); //1.5�� ���
				runs();
				break;
			} else{
				System.out.println();	
				System.out.println("==================================");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("        ��ȣ�� ��ġ���� �ʽ��ϴ�.        ");
				System.out.println("==================================");
				System.out.println();	
				System.out.println();	
				j++;
			}if(j==3) {
				System.out.println();	
				System.out.println("==================================");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("       ��ȣ�� 3ȸ ���� Ʋ�Ƚ��ϴ�.       ");
				System.out.println("        �ý����� ���� �����մϴ�.        ");
				System.out.println("==================================");
				System.out.println();	
				System.out.println();	
				Thread.sleep(1500); //1.5�� ���
				powerOff();
				break;
			}		
			scanner.close();
		}
	}

//	getKeyDoit(String str) {
//		ppp("asdfasd");
//		nowloading();
//		powerOn();
//	
//	} // �����ε�
//	getKeyDoit() {
//		ppp("asdfasd");
//		nowloading������();
//		powerOff(int a);
//	
//	}	
//	
//	getKey() {
//		
//		swh
//		case:
//			getKeyDoit() 
//		case:
//			getKeyDoit(Str) 
//		case:
//			getKeyDoit(1) 	
//		case:
//			getKeyDoit(1) 	
//		case:
//			getKeyDoit(1) 				
//			
//	}
	
	//------------------------------------------------------------------------------------------
	//				���θ޴�
	void runs() throws Exception {
		
		boolean run = true;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {					//EnterŰ�� �ԷµǸ� 13�� 10�� �ԷµǹǷ� ���ܽ�Ŵ.
				System.out.println("");
				System.out.println("==================================");
				System.out.println("                                  ");
				System.out.println("        ���Ͻô� ����� �Է��ϼ���        ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println(" 1.�ý��� ���� | 2.(�̱���)| 3.�ý��� ����" );	//�޴� ����
				System.out.println(" 4.�ý��� �����                      ");
				System.out.println("==================================");
				System.out.println("");
				System.out.print("�Է�: ");
				System.out.println("");
			}
			
			keyCode = System.in.read();			//Ű������ Ű �ڵ带 ����
			//1=49, 2=50, 3=51, 4=52, 5=53, 6=54, 7=55, 8=56, 9=57
			
			if (keyCode == 49) { //1�� �о��� ���
				System.out.println("�ý��� ������ Ȯ���մϴ�.");
				try {
					Thread.sleep(1000); //1�� ���
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//loadOn();
				loading();
				sysinfo();
				
			} else if (keyCode == 50) { //2�� �о��� ���
				//���� ȣ�� (�޴� �̱��� )
				loading();
				System.out.println("���� �߰������� �޴��Դϴ�.");
				Thread.sleep(1000);
			} else if (keyCode == 51) { //3�� �о��� ���
				run = false;
				System.out.println("�ý����� �����մϴ�.");
				Thread.sleep(1000); //1�� ���
				loading();
				powerOff();
			} else if (keyCode == 52) { //4�� �о��� ���
				run = false;
				System.out.println("�ý����� ������մϴ�.");
				Thread.sleep(1000); //1�� ���
				loading();
				powerOn();
				
			}
		}
	}
	//------------------------------------------------------------------------------------------
	//				�ε��� ǥ�úκ� �Լ�
	int load1() {
		return load;
	}
	
//	void loadOn() {
//		System.out.println("�ý��� ������ Ȯ���մϴ�.");		//�޴� ��Ʈ�� �޶� ���x 
//	}
	
	public void loading() throws InterruptedException {
		for(int i=25; i<=100; i+=25) {
			load = i;
			System.out.println("�ε���...  " + load + "%");
				Thread.sleep(1000); //1�� ���
		}
		
	}
	
	
	
	//------------------------------------------------------------------------------------------
	
//	static String Asterisk1() {	
//		char[] pwnew = new char[winPw().length()];
//
//				for(int i=0;i<pwnew.length;i++){ 
//				pwnew[i]=(winPw().charAt(i));
//				}
//				if(pwnew.length>=1 && pwnew.length<=3) {
//				
//				} else if(pwnew.length>=4 && pwnew.length<7){
//					pwnew[3]= '*';
//					pwnew[4]= '*';
//				} else {
//					pwnew[3]= '*';
//					pwnew[4]= '*';
//					pwnew[5]= '*';
//				}	
//					String pwnew2 = String.valueOf(pwnew); 
//		return pwnew2;
//	}
	
	
	
	
	
	
}
