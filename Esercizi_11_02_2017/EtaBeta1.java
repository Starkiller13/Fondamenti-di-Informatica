import java.util.Scanner;

public class EtaBeta1{
	public static void main(String[] args){
		System.out.println("Scrivere una frase del tipo Articolo Sostantivo Verbo Aggettivo: ");
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		String c = in.next();
		String d = in.next();
		String new_a = a.substring(0,1).toUpperCase() + a.substring(1);
		String new_b = "p"+b;
		String new_d = "p"+d;
		String phrase = new_a + " " + new_b + " " + c + " " + new_d;
		System.out.println("Ecco la frase tradotta da Eta Beta:" + phrase);
		in.close();
	}
}
