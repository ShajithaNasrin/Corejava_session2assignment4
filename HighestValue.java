class Highest
{
	public void numbers()
	{
		System.out.print("Enter 'A' value :");
		int A=Integer.parseInt(System.console().readLine()); //getting 'A' value in runtime

		
		System.out.print("Enter 'B' value :");
		int B=Integer.parseInt(System.console().readLine()); //getting 'B' value in runtime
		
		System.out.print("Enter 'C' value :");
		int C=Integer.parseInt(System.console().readLine()); //getting 'C' value in runtime
		
		if ((A>B) && (A>C))				     //Confirm 'A' is greater
		{
			System.out.println(" A is greatest");
		}
		else if(B>C){					     //Confirm 'B' is greater
			System.out.println(" B is greatest");
		}
		else{
			System.out.println(" C is greatest"); 	     // If 'A' and 'B' is not highest 									it i will print c is greatest
		}
	}
}
class HighestValue
{
	public static void main(String[] args)
	{
		Highest h=new Highest();
		h.numbers();
	}
}