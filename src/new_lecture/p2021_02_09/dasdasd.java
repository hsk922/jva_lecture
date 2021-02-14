package new_lecture.p2021_02_09;

import java.util.Arrays;

public class dasdasd {

	public static void main(String[] args) {
		int i;
		
		int[][] arrNo = new int[3][5]; // 멤버배열의 틀
        for(i=0;i<3;i++) {
            arrNo[i][0] = i+1;
        }
		System.out.println(Arrays.toString(arrNo));
		
	}

}
