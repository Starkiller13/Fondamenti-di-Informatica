import java.util.Scanner;

public class TempoTrascorso{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci orario iniziale(formato OOMM):");
		int ora1= in.nextInt();
		System.out.println("Inserisci orario finaleformato OOMM):");
		int ora2= in.nextInt();
		in.close();
		int ore_totali=0;
		int minuti_totali=0;
		if(ora1%100<ora2%100){
			minuti_totali=ora2%100-ora1%100;
			if(ora1<ora2){
				ore_totali=ora2/100-ora1/100;
			}
			else{
				ore_totali=24-ora1/100+ora2/100;
			}
		}
		else{
			minuti_totali=ora1%100-ora2%100+60;
			if(ora1<ora2){
				minuti_totali=ora1%100-ora2%100+60;
				ore_totali=ora2/100-ora1/100;
			}
			else{
				ore_totali=23-ora1/100+ora2/100;
				minuti_totali=60+ora2%100-ora1%100;
			}
		}
		System.out.println("Il tempo trascorso e' : " + ore_totali +" ore " + minuti_totali + " minuti.");
		
	}
}
