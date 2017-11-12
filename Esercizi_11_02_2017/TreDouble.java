import java.util.Scanner;
import java.util.LOCALE;

public class TreDouble{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci tre numeri a virgola mobile separati da uno spazio: ");
		String a = in.next();
		String b = in.next();
		String c = in.next();
		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		double c1 = Double.parseDouble(c);
		double somma = a1+b1+c1;
		System.out.println ("Ecco la somma: "  + a + " " + b + " " + c + " = "+ somma);
		in.close();
	}
}
