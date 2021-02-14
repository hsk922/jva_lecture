package new_lecture.p2021_02_05;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for문
//	    for(초기값; 조건식; 증감식){
//	       	반복 실행할 문장;
//	    }
//				
// 사랑해요 메세지를 10번 출력 하세요?
//        		        i++, ++i, i=i+1, i+=1
	int i;	//c언어의경우 무조건 바깥에서 초기화시켜야함.
	for(i=1; i<11; ++i) 	// {}를 쓰는게 원칙이지만, 안의 내용이 한 줄일 경우 생략가능.
		System.out.println(i + " 사랑해요");	
		System.out.println("for문의 적용을 받지 않고 출력됨");
		
  }
}
