import java.util.Scanner;
import java.util.Locale;

public class BankAccountTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		System.out.println("Conto in banca");
		System.out.println("Inserisci saldo iniziale: ");
		double a = in.nextDouble();
		System.out.println("Inserisci tasso d'interesse: ");
		double b = in.nextDouble();
		BankAccount acct1 = new BankAccount(a);
		acct1.addInterest(b);
		acct1.addInterest(b);
		System.out.println("Saldo dopo due anni: " + acct1.getSaldo());
		acct1.prelievo(a);
		System.out.println("Guadagno: " + acct1.getSaldo());
		in.close();
	}
}
