import java.util.Scanner;
import java.util.Locale;

public class TreDoubleRev1{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Seleziona lo standard per l'esercizio: ");
		System.out.println("1. America US");
		System.out.println("2. Italiano IT");
		System.out.println("Tutto il resto. Esci");
		int option = in.nextInt();
		if(option==1){
			in.useLocale(Locale.US);
		}
		else if(option==2){
			in.useLocale(Locale.ITALY);
		}
		else{
			System.exit(0);
		}
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
