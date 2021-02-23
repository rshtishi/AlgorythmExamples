package com.github.rshtishi.recursion;

public class CanSum {
	
	public static boolean compute(int num, int[] values) {
		if(num==0) {
			return true;
		}
		if(num<0) {
			return false;
		}
		for(int value:values) {
			int tmp = num - value;
			if(compute(tmp,values)==true) {
				return true;
			}
		}
		return false;
	}

}
