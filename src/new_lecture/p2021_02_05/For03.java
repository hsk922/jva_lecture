package new_lecture.p2021_02_05;

public class For03 {

	public static void main(String[] args) {
// 1 ~ 100까지 홀수, 짝수의 합을 구하는 프로그램을 작성 하세요?
		
		int odd = 0, even = 0;
		
		// 홀수의 합
		for(int i=1; i<=100; i=i+2)  // i+=2
			odd += i;
		
		// 짝수의 합 // 반복문 안에 있는 i가 '지역변수'이기 때문에 위에 문구가 돌아가고나면 사라지기떄문에 밑에 i를 다르게 초기화 해도 작용됨.  
		for(int i=0; i<=100; i+=2)
			even += i;
		
		System.out.println("1~100 홀수의 합:"+ odd);
		System.out.println("1~100 짝수의 합:"+ even);		
	}

}
