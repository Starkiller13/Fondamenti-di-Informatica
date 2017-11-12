import java.util.Scanner;
import java.lang.Math;

public class Cerchio1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire valore del raggio: ");
		double r = in.nextDouble();
		double area = Math.PI*Math.pow(r,2);
		double perimetro = 2*Math.PI*r;
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		in.close();
	}
}
