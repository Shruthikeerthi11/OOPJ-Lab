class  TotalAverage
{
	static int a,b;
	static int total;
	static double avg;
	static void calculate()
	{
		total = a + b;
		avg = total / 2.0;
	}
	public static void main(String args[])
	{
		//commandline arguments
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);	
		
		calculate();

				System.out.println("firstnumber : " +a);
			    System.out.println("secondnumber : " +b);
				System.out.println("Total : " +total);
				System.out.println("Avg : " +avg);
	}
}
