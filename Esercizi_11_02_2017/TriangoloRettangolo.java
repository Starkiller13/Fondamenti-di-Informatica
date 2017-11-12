import java.util.Scanner;
import java.lang.Math;

public class TriangoloRettangolo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire valore del cateto 1: ");
		double a = in.nextDouble();
		System.out.println("Inserire valore del cateto 2: ");
		double b = in.nextDouble();
		double ipo = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		double ipor = ipo;
		double perimetro= a+b+ipo;
		double area = (a*b)/2;
		double angolo_rad1 = Math.acos(a/ipo);
		double angolo1= Math.toDegrees(angolo_rad1);
		double angolo2= 90.00 - angolo1;
		System.out.print("Ipotenusa: ");
		System.out.format("%.2f", ipo);
      	System.out.println("cm");
		System.out.println("Area: ");
		System.out.format("%.2f", area);
      	System.out.println("cm2");
		System.out.println("Perimetro: ");
		System.out.format("%.2f", perimetro);
      	System.out.println("cm");
		System.out.println("Angolo 1: ");
		System.out.format("%.2f", angolo1);
      	System.out.println("°");
      	System.out.println("Angolo 2: ");
		System.out.format("%.2f", angolo2);
      	System.out.println("°");
		in.close();
	}
}
