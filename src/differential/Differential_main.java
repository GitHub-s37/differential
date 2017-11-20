package differential;

import java.util.Scanner;

public class Differential_main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a> ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h> ");
		double h = Double.parseDouble(scan.next());

		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getDx());
		System.out.println("f(x)=x^2のx="+a+"における微分係数の相対誤差は"+dlib.gosa());
	}
}
