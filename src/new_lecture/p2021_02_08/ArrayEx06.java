package new_lecture.p2021_02_08;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 향상된 for문, 확장 for문
// 형식 :  for( 변수 : 순차적인 자료구조(배열, 컬렉션) ){
//		           실행 문자;
//	      }
		
		int[] score = { 95, 71, 84, 93, 87 }; 	//값이 정해진 경우.
		
		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];		//sum = sum + score[i];
//		}
		
		// 확장 for문
		for(int s : score) {		// score 자리는 순차적인 자료구조가 들어감, ex) 배열, 컬렉션...  (본문에서는 배열인 score가 들어감.)
			sum += s;				//	윗줄 int부분은 뒤에 자료구조가 복합형으로 List가 들어갈 경우, object가 들어가야한다.
		}
		System.out.println("총점:"+ sum);
		
		double avg = (double)sum / score.length;
		System.out.println("평균:" + avg);
		
	}

}
