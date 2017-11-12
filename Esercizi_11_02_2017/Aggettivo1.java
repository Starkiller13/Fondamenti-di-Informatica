import java.util.Scanner;

public class Aggettivo1{
	public static void main(String[] args){
		System.out.println("Scrivere un aggettivo qualificativo: ");
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String first_a = a.substring(0,1);
		String middle_a = a.substring(1,a.length()-1);
		String last_a= a.substring(a.length()-1,a.length());
		String a_min="";
		String a_abs="";
		if(last_a.equals("o"))
		{
			a_min=first_a.toUpperCase()+middle_a+"ino";
			a_abs=first_a.toUpperCase()+middle_a+"issimo";
		}
		else if(last_a.equals("a"))
		{
			a_min=first_a.toUpperCase()+middle_a+"ina";
			a_abs=first_a.toUpperCase()+middle_a+"issima";
		}
		else if(last_a.equals("e"))
		{
			a_min=first_a.toUpperCase()+middle_a+"ine";
			a_abs=first_a.toUpperCase()+middle_a+"issime";
		}
		else if(last_a.equals("i"))
		{
			a_min=first_a.toUpperCase()+middle_a+"ini";
			a_abs=first_a.toUpperCase()+middle_a+"issimi";
		}
		System.out.println("Aggettivo inserito: "+first_a.toUpperCase()+a.substring(1));
		System.out.println("Forma diminutiva: "+a_min);
		System.out.println("Forma superlativa: "+a_abs);
		in.close();
		}
}
