package new_lecture.p2021_02_05;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 난수 발생 공식
// 난수 = (정수화) (Math.random() * (상한값-하한값 + 1)) + 하한값;		
// 과제
		
// Math클래스는 생성자를 제공하지 않기 때문에 직접 생성자를 생성하면 오류가 발생함. api참고
// Math m = new Math();  << 오류
		
		
// 난수 발생
// 0.0 <= Math.random() < 1.0

		System.out.println("PI="+Math.PI); // PI값(정적필드)
		System.out.println(Math.random()); // 난수 발생 
		
// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random() * 6 ) + 1; //1 ~ 6
		
		if(num == 1) {
			System.out.println("1번");
		}else if(num == 2) {
			System.out.println("2번");
		}else if(num == 3) {
			System.out.println("3번");
		}else if(num == 4) {
			System.out.println("4번");
		}else if(num == 5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}	
		
		System.out.println("1 ~ 45 사이의 난수 발생");
		int r = (int) (Math.random() * 45) + 1;
		System.out.println("난수:"+ r);
		
	}

}





