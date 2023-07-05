package com.controlStatement;
import java.util.Scanner;
public class ControlStatement {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the mark");
int mark=sc.nextInt();

if(mark>=35) {
if(mark>=50){
if(mark>90) {
	System.out.println("THE RESULT IS:PASS");
            }else if ((mark>85 && mark>=100))
               {
                 System.out.println("GRADE:A");	
               }
            else if ((mark>70 || mark<=85)) 
               {
               System.out.println("GRADE:B");	
                }
             else {
	            System.out.println("GRADE:C");
                  }
            }
            else if (mark<60 && mark>=35) 
                  {
	                System.out.println("GRADE:E");
                  }
            else {
	
	            System.out.println("THE RESULT IS FAIL");
                }
            }
}
}