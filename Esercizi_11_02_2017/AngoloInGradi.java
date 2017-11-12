import java.util.Scanner;
import java.lang.Math;

public class AngoloInGradi{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire angolo in gradi: ");
		double a = in.nextDouble();
		double a_n=a%360;
		double a_rad= a_n/180;
		double sin_a= Math.sin(a_rad*Math.PI);
		double tan_a= Math.tan(a_rad*Math.PI);
		double cos_a= Math.cos(a_rad*Math.PI);
		System.out.print("Angolo in radianti: ");
		System.out.format("%.2f", a_rad);
      	System.out.println("π rad");
      	System.out.print("Seno: ");
		System.out.format("%.2f", sin_a);
		System.out.println();
		System.out.print("Coseno: ");
		System.out.format("%.2f", cos_a);
		System.out.println();
		System.out.print("Tangente: ");
		System.out.format("%.2f", tan_a);
		System.out.println();
}
