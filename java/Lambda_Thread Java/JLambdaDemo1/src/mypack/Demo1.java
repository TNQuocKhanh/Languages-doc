package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int num=0;
		for(int i=0;i<10;i++)
		{
			System.out.print("numbers["+(i+1)+"]: ");
			num=sc.nextInt();
			numbers.add(num);
		}
		numbers.forEach( 
				(n) -> { System.out.println(n); } );
	}

}
