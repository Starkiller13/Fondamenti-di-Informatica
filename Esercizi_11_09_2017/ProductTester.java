import java.util.Scanner;
import java.util.Locale;

public class ProductTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		System.out.println("Prodotti");
		System.out.println("Inserisci il nome del prodotto 1: ");
		String n1 = in.nextLine();
		System.out.println("Inserisci il prezzo del prodotto 1: ");
		double p1 = Double.parseDouble(in.nextLine());
		System.out.println("Inserisci il nome del prodotto 2: ");
		String n2 = in.nextLine();
		System.out.println("Inserisci il prezzo del prodotto 2: ");
		double p2 = Double.parseDouble(in.nextLine());
		Product pdt1= new Product(n1,p1);
		Product pdt2= new Product(n2,p2);
		if(pdt1.getPrice()>pdt2.getPrice())
		{
			System.out.println("Prodotto1 --> nome: " + pdt1.getName() + " prezzo: "+  pdt1.getPrice());
			System.out.println("Prodotto2 --> nome: " + pdt2.getName() + " prezzo: "+  pdt2.getPrice());
			System.out.println("Inserisci uno sconto da applicare al prodotto piu' costoso: ");
			double sconto = in.nextDouble();
			pdt1.reducePrice(sconto);
			if(pdt1.getPrice()>pdt2.getPrice())
			{
				System.out.println("Prodotto1 --> nome: " + pdt1.getName() + " prezzo: "+  pdt1.getPrice());
				System.out.println("Prodotto2 --> nome: " + pdt2.getName() + " prezzo: "+  pdt2.getPrice());
			}
			else
			{
				System.out.println("Prodotto1 --> nome: " + pdt2.getName() + " prezzo: "+  pdt2.getPrice());
				System.out.println("Prodotto2 --> nome: " + pdt1.getName() + " prezzo: "+  pdt1.getPrice());
			}
		}
		else
		{
			System.out.println("Prodotto1 --> nome: " + pdt2.getName() + " prezzo: "+  pdt2.getPrice());
			System.out.println("Prodotto2 --> nome: " + pdt1.getName() + " prezzo: "+  pdt1.getPrice());
			System.out.println("Inserisci uno sconto da applicare al prodotto piu' costoso: ");
			double sconto = in.nextDouble();
			pdt2.reducePrice(sconto);
			if(pdt1.getPrice()>pdt2.getPrice())
			{
				System.out.println("Prodotto1 --> nome: " + pdt1.getName() + " prezzo: "+ pdt1.getPrice());
				System.out.println("Prodotto2 --> nome: " + pdt2.getName() + " prezzo: "+ pdt2.getPrice());
			}
			else
			{
				System.out.println("Prodotto1 --> nome: " + pdt2.getName() + " prezzo: "+  pdt2.getPrice());
				System.out.println("Prodotto2 --> nome: " + pdt1.getName() + " prezzo: "+  pdt1.getPrice());
			}
			
		}
		in.close();	
	}
		
}
