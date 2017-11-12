public class BankAccount
{
	public BankAccount()
	{
		this.saldo=0;
	}
	public BankAccount(double s0)
	{
		this.saldo=s0;
	}
	public double getSaldo()
	{
		return this.saldo;
	}
	public void versamento(double amount)
	{
		if(amount<0)
		{
			System.out.println("Valore in entrata non valido");
		}
		else
		{
			this.saldo=this.saldo + amount;
		}
	}
	public void prelievo(double amount)
	{
		if(amount<0)
		{
			System.out.println("Valore in entrata non valido");
		}
		else if(this.saldo<amount)
		{
			System.out.println("Saldo disponibile non sufficiente");
		}
		else
			this.saldo=this.saldo - amount;
	}	
	public void addInterest(double rate)
	{
		this.saldo= this.saldo*(1+rate/100);
	}
	
	private double saldo;	
}
