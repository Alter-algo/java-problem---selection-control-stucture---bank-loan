class Tester {
	public static void main(String[] args) {
	double accountNumber= 1001;
	double salary= 50000;
	double accountBalance= 100000;
	String loanType= "car";
	double loanAmountExpected=400000;
	double emisExpected=36;
	if ( accountNumber<2000 && salary>25000 && accountBalance>999 && loanType=="car" && loanAmountExpected<500000 && emisExpected<37)
	{
	    System.out.println(+accountNumber);
	    System.out.println("you are eligible for bank loan");
	    System.out.println(+loanAmountExpected);
	    System.out.println(+emisExpected);
	}
	else if (accountNumber<2000 && salary>50000 && accountBalance>999 && loanType=="house" && loanAmountExpected<6000000 && emisExpected<61)
	{
	System.out.println(+accountNumber);
	System.out.println("you are eligible for bank loan");
	System.out.println(+loanAmountExpected);
	System.out.println(+emisExpected);
	}
	else if (accountNumber<2000 && salary>75000 && accountBalance>999 && loanType=="business" && loanAmountExpected<7500000 && emisExpected<85)
	{
	    System.out.println(+accountNumber);
	    System.out.println("you are eligible for bank loan");
	    System.out.println(+loanAmountExpected);
	    System.out.println(+emisExpected);
	}
	else 
	{
	    System.out.println("Sorry you are not eligible");
	}
	}
}
