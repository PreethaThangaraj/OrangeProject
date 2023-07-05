package com.controlStatement;

public class LoopTest {

	public static void main(String[] args) {
	/*	int [] num = {1,3,4,6,7,9};
		for(int i =0;i<num.length;i++)
		{
			System.out.print(num[i]);
		}

	}*/
		for(int i=1;i<=10;) {
			if(i==2||i==5||i==8) {
				i++;
				continue;
			}
			System.out.print(i);
			i++;
			}
		}

}
