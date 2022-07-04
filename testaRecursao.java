import java.io.*;
import java.util.Scanner;

class testaRecursao{
	public static void main(String Args[]) throws IOException{
		Scanner in = new Scanner(System.in);
        int a, b;

		do{
			System.out.print("Type a number:");
			a = in.nextInt();

			System.out.print("Type another number:");
			b = in.nextInt();

			if (Recursao.EhMenor(a,b))
				System.out.println(a + " is smaller than " + b);
			else
				System.out.println(a + " is not smaller than " + b);
		}while (a!=0);
	}
}