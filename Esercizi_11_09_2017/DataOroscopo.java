import java.util.Scanner;

public class DataOroscopo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Guarda il tuo oroscopo");
		System.out.println("Inserisci il tuo compleanno(esempio 13 5 = 13 maggio): ");
		String a = in.next();
		String b = in.next();
		int mese = Integer.parseInt(b);
		int giorno = Integer.parseInt(a);
		int x=0;
		if(mese>12||mese<1)
		{
			System.out.println("Valori non validi");
		}
		else if(mese==2&&giorno>28)
		{
			System.out.println("Valori non validi");
		}
		else if(mese==11||mese==4||mese==6||mese==9&&giorno>30||giorno<1)
		{
			System.out.println("Valori non validi");
		}
		else if(giorno>31||giorno<1)
		{
			System.out.println("Valori non validi");
		}
		else if(mese==1)
		{
			if(giorno >= 21)
				x=2;
			else
				x=1;
		}
		else if(mese==2)
		{
			if(giorno >= 21)
				x=3;
			else
				x=2;
		}
		else if(mese==3)
		{
			if(giorno >= 21)
				x=4;
			else
				x=3;
		}
		else if(mese==4)
		{
			if(giorno >= 21)
				x=5;
			else
				x=4;
		}
		else if(mese==5)
		{
			if(giorno >= 21)
				x=6;
			else
				x=5;
		}
		else if(mese==6)
		{
			if(giorno >= 21)
				x=7;
			else
				x=6;
		}
		else if(mese==7)
		{
			if(giorno >= 21)
				x=8;
			else
				x=7;
		}
		else if(mese==8)
		{
			if(giorno >= 21)
				x=9;
			else
				x=8;
		}
		else if(mese==9)
		{
			if(giorno >= 21)
				x=10;
			else
				x=9;
		}
		else if(mese==10)
		{
			if(giorno >= 21)
				x=11;
			else
				x=10;
		}
		else if(mese==11)
		{
			if(giorno >= 21)
				x=12;
			else
				x=11;
		}
		else
		{
			if(giorno >= 21)
				x=1;
			else
				x=12;
		}
		x--;
		switch (x)
		{
			case 1:
				System.out.println("Acquario");
				System.out.println("Amore = 3");
				System.out.println("Amicizia = 4");
				System.out.println("Lavoro = 5");
				break;
			case 2:
				System.out.println("Pesci");
				System.out.println("Amore = 2");
				System.out.println("Amicizia = 4");
				System.out.println("Lavoro = 4");
				break;
			case 3:
				System.out.println("Ariete");
				System.out.println("Amore = 1");
				System.out.println("Amicizia = 5");
				System.out.println("Lavoro = 3");
				break;
			case 4:
				System.out.println("Toro");
				System.out.println("Amore = 5");
				System.out.println("Amicizia = 5");
				System.out.println("Lavoro = 5");
				break;
			case 5:
				System.out.println("Gemelli");
				System.out.println("Amore = 3");
				System.out.println("Amicizia = 4");
				System.out.println("Lavoro = 4");
				break;
			case 6:
				System.out.println("Cancro");
				System.out.println("Amore = 2");
				System.out.println("Amicizia = 4");
				System.out.println("Lavoro = 3");
				break;
			case 7:
				System.out.println("Leone");
				System.out.println("Amore = 3");
				System.out.println("Amicizia = 2");
				System.out.println("Lavoro = 5");
				break;
			case 8:
				System.out.println("Vergine");
				System.out.println("Amore = 4");
				System.out.println("Amicizia = 4");
				System.out.println("Lavoro = 3");
				break;
			case 9:
				System.out.println("Bilancia");
				System.out.println("Amore = 5");
				System.out.println("Amicizia = 2");
				System.out.println("Lavoro = 2");
				break;
			case 10:
				System.out.println("Scorpione");
				System.out.println("Amore = 3");
				System.out.println("Amicizia = 5");
				System.out.println("Lavoro = 3");
				break;
			case 11:
				System.out.println("Sagittario");
				System.out.println("Amore = 2");
				System.out.println("Amicizia = 4");
				System.out.println("Lavoro = 4");
				break;
			case 12:
				System.out.println("Capricorno");
				System.out.println("Amore = 3");
				System.out.println("Amicizia = 3");
				System.out.println("Lavoro = 3");
			default :
				break;
		}
		in.close();
		
	}
}
