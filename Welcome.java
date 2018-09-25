class Welcome
{
	public void accept()
	{
		System.out.println("Welcome to accept");
	}
	
	public void display()
	{
		System.out.println("Welcome to Deloitte");
		System.out.println("Welcome to ITPL");
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome to ITPL");
		Welcome w = new Welcome();
		w.display();
		w.accept();
		Bye b= new Bye();
		b.sayBye();
	}
}