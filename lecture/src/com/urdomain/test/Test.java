package com.urdomain.test;

import java.util.*;

	class Test{
		 public static void delay(int temp){
		  try { Thread.sleep(temp); } catch (Exception e) { System.out.println("������ �Լ� ����\n����:"+e); }
		 }
		 public static void main(String[] args)
		 {

		  int delaytime = 0;
		  delaytime = 1000; 

		  for(int i = 1 ; i <= 3; i ++)
		  {
		   System.out.print(i+"\t");
		   delay(delaytime);
		  }
		  System.out.println();
		 }
		}
		
		
	
