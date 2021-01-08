package com.urdomain.test;

public class Asteriskteacher {

		public String changeIdWithAsterisk (String id) {
			
			char[] idCharArray = id.toCharArray();
			
		//	for(char idChar : idCharArray) {
		//		System.out.println(idChar);
		//	}		
			
			if(id.length() >= 1 && id.length() < 3) {
				//	pass
			} else if (id.length() == 3) {
				//	1
				idCharArray[1] = '*';
			} else if (id.length() == 4 || id.length() == 5) {
				//	1,2				
				idCharArray[1] = '*';
				idCharArray[2] = '*';
			} else if (id.length() == 6 || id.length() == 7 ) {
				//	3,4
				idCharArray[3] = '*';
				idCharArray[4] = '*';			
			} else if (id.length() >= 8 && id.length() <= 10) {
				//	4,5			
				idCharArray[4] = '*';
				idCharArray[5] = '*';
			} else {	 //	(id.length() >= 11 && id.length() <= 20)
				// 6,7,8
				idCharArray[6] = '*';
				idCharArray[7] = '*';
				idCharArray[8] = '*';
			}		
		//	String idNew = String.valueOf(idCharArray);
		//	System.out.println(idNew);
			
			return String.valueOf(idCharArray);
		}

}
//	Test13 test13 = new Test13();
////			
//			String idNew = test13.changeIdWithAsterisk(id);