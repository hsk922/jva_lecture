package com.urdomain.ch11;

public class ExitExample {

	public static void main(String[] args) {
		
		System.setSecurityManager(new SecurityManager() {
			//보안 관리자 설정
			@Override
			public void checkExit(int status) {
				if(status!=5) {
					throw new SecurityException();
				}
			}
		});
		
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			} catch(SecurityException e) {} 
		}

	}

}
