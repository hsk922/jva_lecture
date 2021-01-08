package com.urdomain.test;

import java.util.Scanner;

public class Computer {
	//필드
	String windowsVersion = "Windows 7 Professional K";
	String processor = "Intel(R) i5-4460 CPU @ 3.20GHz";
	String ram = "12.0GB";
	String systemType = "64bit";
	
	int load;  //로딩함수부분.
	
	//------------------------------------------------------------------------------------------
	//					시스템정보 출력
	public void sysinfo() throws InterruptedException {
		System.out.println("==================================");
		System.out.println("윈도우 버전: " + windowsVersion);
		System.out.println("                                  ");
		System.out.println("프로세서: " + processor);
		System.out.println("                                  ");
		System.out.println("램: " + ram);
		System.out.println("                                  ");
		System.out.println("시스템 종류: " + systemType);
		System.out.println("==================================");
		System.out.println();										//몇초후 메인 복귀 메시지 출력하거나 , 메인으로 가는 키 입력받는 기능 추가. (ex아무키나 누를 시 메인으로 갑니다. )
		Thread.sleep(3000); //3초 대기
	}
	
	// 출력만 하는 함수
	
	// 
	
	//------------------------------------------------------------------------------------------
	//				부팅화면
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
		System.out.println();				// 시간 지연을 두고 출력하도록.
		Thread.sleep(1500); //1.5초 대기
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("               ㅁㅁ                ");
		System.out.println("                ㅁㅁ               ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("         Winows를 시작하는 중         ");
		System.out.println("       Microsoft Coperation       ");
		System.out.println("==================================");
		System.out.println();	
		System.out.println();				// 시간 지연을 두고 출력하도록.
		Thread.sleep(1500); //1초 대기
		System.out.println();	
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("              (로그인)              ");
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
		System.out.println("          시스템을 종료합니다.          ");
		System.out.println("==================================");
		System.out.println();	
		System.out.println();	
		Thread.sleep(1500); //1.5초 대기
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
	//powerOff면 pwCheck하는 함수를 만들고 검토하도록
	//------------------------------------------------------------------------------------------
	public void winlogin(String pw) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int j=0;
		while (true) {
			System.out.print("      암호 : ");
			pw = scanner.nextLine(); // 암호 입력시 마지막 자리 외 모든 부분 아스테릭처리로 출력 원함
			//System.out.println("==================================");// 입력란 밑에 를 같이 출력하고 싶음.
			if(pw.equals(winPw()) )  {
				System.out.println("");
				System.out.println("==================================");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("             환영합니다.             ");
				System.out.println("          Administrator님.        ");
				System.out.println("==================================");
				System.out.println();	
				System.out.println();	
				Thread.sleep(1500); //1.5초 대기
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
				System.out.println("        암호가 일치하지 않습니다.        ");
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
				System.out.println("       암호를 3회 연속 틀렸습니다.       ");
				System.out.println("        시스템을 강제 종료합니다.        ");
				System.out.println("==================================");
				System.out.println();	
				System.out.println();	
				Thread.sleep(1500); //1.5초 대기
				powerOff();
				break;
			}		

		}
	}

//	getKeyDoit(String str) {
//		ppp("asdfasd");
//		nowloading();
//		powerOn();
//	
//	} // 오버로드
//	getKeyDoit() {
//		ppp("asdfasd");
//		nowloadingㅁㄴㅇ();
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
	//				메인메뉴
	void runs() throws Exception {
		
		boolean run = true;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {					//Enter키가 입력되면 13과 10이 입력되므로 제외시킴.
				System.out.println("");
				System.out.println("==================================");
				System.out.println("                                  ");
				System.out.println("        원하시는 기능을 입력하세요        ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println("                                  ");
				System.out.println(" 1.시스템 정보 | 2.(미구현)| 3.시스템 종료" );	//메뉴 생성
				System.out.println(" 4.시스템 재시작                      ");
				System.out.println("==================================");
				System.out.println("");
				System.out.print("입력: ");
				System.out.println("");
			}
			
			keyCode = System.in.read();			//키보드의 키 코드를 읽음
			//1=49, 2=50, 3=51, 4=52, 5=53, 6=54, 7=55, 8=56, 9=57
			
			if (keyCode == 49) { //1을 읽었을 경우
				System.out.println("시스템 정보를 확인합니다.");
				try {
					Thread.sleep(1000); //1초 대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//loadOn();
				loading();
				sysinfo();
				
			} else if (keyCode == 50) { //2를 읽었을 경우
				//계산기 호출 (메뉴 미구현 )
				loading();
				System.out.println("추후 추가예정인 메뉴입니다.");
				Thread.sleep(1000);
			} else if (keyCode == 51) { //3을 읽었을 경우
				run = false;
				System.out.println("시스템을 종료합니다.");
				Thread.sleep(1000); //1초 대기
				loading();
				powerOff();
			} else if (keyCode == 52) { //4을 읽었을 경우
				run = false;
				System.out.println("시스템을 재시작합니다.");
				Thread.sleep(1000); //1초 대기
				loading();
				powerOn();
				
			}
		}

	}
	//------------------------------------------------------------------------------------------
	//				로딩중 표시부분 함수
	int load1() {
		return load;
	}
	
//	void loadOn() {
//		System.out.println("시스템 정보를 확인합니다.");		//메뉴 멘트가 달라서 사용x 
//	}
	
	public void loading() throws InterruptedException {
		for(int i=25; i<=100; i+=25) {
			load = i;
			System.out.println("로딩중...  " + load + "%");
				Thread.sleep(1000); //1초 대기
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
