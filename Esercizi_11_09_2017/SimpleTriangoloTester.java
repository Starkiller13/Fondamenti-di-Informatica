import java.util.Scanner;
import java.lang.Math;

public class SimpleTriangoloTester
{
	public static void main(String[] args)
	{
		final double ERRORE = 1E-14;
		Scanner in = new Scanner(System.in);
		System.out.println("Informazioni sui Triangoli");
		System.out.println("Inserisci valore lato 1(intero positivo: ");
		int a = in.nextInt();
		System.out.println("Inserisci valore lato 1(intero positivo: ");
		int b = in.nextInt();
		System.out.println("Inserisci valore lato 1(intero positivo: ");
		int c = in.nextInt();
		double alpha = Math.acos((Math.pow(a,2)-Math.pow(b,2)-Math.pow(c,2))/(-2*b*c));
		double beta = Math.acos((Math.pow(b,2)-Math.pow(a,2)-Math.pow(c,2))/(-2*a*c));
		double gamma = Math.PI-alpha-beta;
		if(a<=0||b<=0||c<=0)
		{
			System.out.println("Valori inseriti non validi!");
		}
		else if(a+b<c||a+c<b||b+c<a)
		{
			System.out.println("Non e' un triangolo");
		}
		else if(a==b&&b==c)
		{
			System.out.println("Triangolo equilatero");
		}
		else if(a==b||b==c||a==c)
		{
			System.out.print("Triangolo isoscele ");
			if(Math.abs(Math.PI/2-alpha-beta)<ERRORE||Math.abs(Math.PI/2-alpha-gamma)<ERRORE||Math.abs(Math.PI/2-gamma-beta)<ERRORE)
			{
				System.out.println("rettangolo");
			}
			else if(alpha<Math.PI/2&&beta<Math.PI/2&&gamma<Math.PI/2)
			{
				System.out.println("acutangolo");
			}
			else
			{
				System.out.println("ottusangolo");
			}
			
		}
		else
		{
			System.out.print("Triangolo scaleno ");
			if(Math.abs(Math.PI/2-alpha-beta)<ERRORE||Math.abs(Math.PI/2-alpha-gamma)<ERRORE||Math.abs(Math.PI/2-gamma-beta)<ERRORE)
			{
				System.out.println("rettangolo");
			}
			else if(alpha<Math.PI/2&&beta<Math.PI/2&&gamma<Math.PI/2)
			{
				System.out.println("acutangolo");
			}
			else
			{
				System.out.println("ottusangolo");
			}
		}
		in.close();
	}
}
