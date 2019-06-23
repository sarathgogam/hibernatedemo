package com.cn.pn.mn;

import java.util.Scanner;

public class Global {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("enter your string:");
       String str= sc.nextLine();
       for(int i=0;i<str.length();i++){
    	   for(int j=0;j<str.length();j++){
    		   if(i==j){
    			   System.out.print(str.charAt(i));
    		   }
    		   else{
    			   System.out.print("-");
    		   }
    		  
    	   }
    	   System.out.println();
       }

	}

}
