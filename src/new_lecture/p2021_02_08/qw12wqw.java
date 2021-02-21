package new_lecture.p2021_02_08;

import java.util.Scanner;

public class qw12wqw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt(); 
	    int b = sc.nextInt();
	    
	    int aa = 0;
	    int bb = 0;
	    
	    
	    if(a<24 && b<60) {
	    	aa = a-1;
	    	bb = b+15;
	    }
	    if(a==0 && a<24) {
	    	aa=23;
	    } 
	    
		System.out.println(aa);
		System.out.println(bb);
		sc.close();
	}

}
