package new_lecture.p2021_02_18;

public class MultiExceptionHandling {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;
		int[] intArray = { 1, 2, 3 };
//      intArray[0]=1, intArray[1]=2, intArray[2]=3
		try {
//			int arrayValue = intArray[4];   // 예외발생
//			System.out.println(arrayValue);

			// 두수의 나눗셈을 구함
			int result = value / div;		// 예외발생
			System.out.println(result);

			// 배열의 특정 값을 저장
          int arrayValue = intArray[4];		// 예외발생
		  System.out.println( arrayValue );	    
		  //위에서 예외가 발생해서 아래 예외만 처리됨, catch로 넘어가지 않음
		  //아래 catch 위치가 바뀌어도 상관없이 catch를 찾아감
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		
	}	
}
