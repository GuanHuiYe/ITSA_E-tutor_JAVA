package ���j_Recursionc;

import java.util.*;

public class C_RU08_��_�u�O�y {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.printf("%.2f\n", GetAns(Double.parseDouble(sc.nextLine())));
		}
	}

	public static double GetAns(Double height) {		
		return height +(height/2.0<1?0:(height/2.0)+GetAns(height/2.0));
	}

}
