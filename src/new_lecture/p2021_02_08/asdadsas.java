package new_lecture.p2021_02_08;

public class asdadsas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] aaa = {true, true, false };
		boolean[] bbb = new boolean[5];
		
		for(int i=0; i<aaa.length; i++) {
			bbb[i] = aaa[i];		// 배열 복사 
		}
		
		for(boolean i : bbb) {
			System.out.print(i+"\t");
		}
		
	}

}
