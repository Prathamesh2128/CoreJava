package com.tester;
import com.cdac.core.Box;
import java.util.Scanner;

class TestBox
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Box Dimension: Width, Depth, Height ");
		
		Box b1;
		//var b1 ref type var : class type of the ref.: Memory alloated on stack : 4/8/16 byetes as per JVM
		// System.out.println(b1); It gave error : error: variable b1 might not have been initialized
        b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.getBoxDetails());
		System.out.println("Computed Volume is : "+b1.getComputedVolume());
		
		sc.close();
	}
}