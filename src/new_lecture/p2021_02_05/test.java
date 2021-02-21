package new_lecture.p2021_02_05;
import java.util.Arrays;
import java.util.Scanner;

public class test {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int b2 = (int)(Math.log10(b)+1);
	        int[] arr = new int[b2];
	        System.out.println(b2);
	        System.out.println(b2/100);
	        for(int i=b2; i>0; i--) {
	        	arr[b2-1] = i;
	        }
	        System.out.println(Arrays.toString(arr));
	        
	        sc.close();
    }
}