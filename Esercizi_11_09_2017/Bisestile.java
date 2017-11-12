import java.util.Scanner;

public class Bisestile
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Anni Bisestili");
		System.out.println("Inserisci un anno da verificare: ");
		int a = in.nextInt();
		if(a>0)
		{
			if(a%4==0)
			{
				if(a>1582)
				{
					if(a%400==0)
					{
						System.out.println("Anno BISESTILE!!");
					}
					else if(a%100==0)
					{
						System.out.println("Anno non bisestile");
					}
					else
					{	
						System.out.println("Anno BISESTILE!!");
					}
				}
				else
				{
					System.out.println("Anno BISESTILE!!");
				}
			}
			else
			{
				System.out.println("Anno non bisestile");
			}
		}
		else
		{
			System.out.println("Valore non valido");
		}
		in.close();
	}
}
