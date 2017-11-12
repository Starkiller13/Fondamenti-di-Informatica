import java.util.Scanner;

public class UnoDueTre{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci tre parole separate da uno spazio: ");
		String a = in.next();
		String b = in.next();
		String c = in.next();
		System.out.println("Ecco le tre stringhe: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		in.close();
		}
}
