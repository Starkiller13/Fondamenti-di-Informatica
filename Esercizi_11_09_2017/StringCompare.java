import java.util.Scanner;

public class StringCompare
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci tre stringhe: ");
		System.out.println("Stringa 1: ");
		String a = in.nextLine();
		System.out.println("Stringa 2: ");
		String b = in.nextLine();
		System.out.println("Stringa 3: ");
		String c = in.nextLine();
		if(a.compareTo(b)<0&&a.compareTo(c)<0)
		{
			if(b.compareTo(c)<0)
			{
				System.out.println("Ecco le stringhe in ordine lessicografico: " + " " +a +" "+ b+" " + c);
			}
			else
			{
			System.out.println("Ecco le stringhe in ordine lessicografico: " + a+" " + c+" " + b);
			}
		}
		else if(b.compareTo(a)<0&&b.compareTo(c)<0)
		{
			if(a.compareTo(c)<0)
			{
				System.out.println("Ecco le stringhe in ordine lessicografico: " + b +" "+ a+" " + c);
			}
			else
			{
			System.out.println("Ecco le stringhe in ordine lessicografico: " + b +" "+ c+" " + a);
			}
		}
		else 
		{
			if(a.compareTo(b)<0)
			{
				System.out.println("Ecco le stringhe in ordine lessicografico: " + c +" "+ a +" "+ b);
			}
			else
			{
			System.out.println("Ecco le stringhe in ordine lessicografico: " + c +" "+ b +" "+ a);
			}
		}
		in.close();
	}
}
