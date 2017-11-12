import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class DoubleCompare
{
	public static void main(String[] args)
	{
		final double ERRORE = 0.01;
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		System.out.println("Inserisci due numeri in virgola mobile: ");
		System.out.println("Primo numero: ");
		double a = in.nextDouble();
		System.out.println("Primo numero: ");
		double b = in.nextDouble();
		if(Math.abs(a-b)<ERRORE)
		{
			System.out.println("I due numeri sono approssimativamente UGUALI!!!");
		}
		else
		{
			System.out.println("I due numeri sono diversi");
		}
		in.close();
	}	
}
