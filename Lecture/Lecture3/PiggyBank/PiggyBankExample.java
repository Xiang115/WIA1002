package Week3.Lecture3.PiggyBank;

/**
    A class that demonstrates the class PiggyBank.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 4.0
*/
public class PiggyBankExample
{
	public static void main(String[] args) 
	{
		PiggyBank myBank = new PiggyBank();
		
		addCoin(new Coin(1, 2010), myBank);
		addCoin(new Coin(5, 2011), myBank);
		addCoin(new Coin(10, 2000), myBank);
		addCoin(new Coin(25, 2012), myBank);
		
 		System.out.println("Removing all the coins:");
      int amountRemoved = 0;
      
      while (!myBank.isEmpty())
      {
         Coin removedCoin = myBank.remove();
         System.out.println("Removed a " + removedCoin.getCoinName() + ".");
         amountRemoved = amountRemoved + removedCoin.getValue();
      } // end while
      
		System.out.println("All done. Removed " + amountRemoved + " cents.");
	} // end main
	
	private static void addCoin(Coin aCoin, PiggyBank aBank) 
	{
		if (aBank.add(aCoin))
			System.out.println("Added a " + aCoin.getCoinName() + ".");
		else
			System.out.println("Tried to add a " + aCoin.getCoinName() + 
			                   ", but couldn't");
	} // end addCoin
} // end PiggyBankExample

/*
Added a PENNY.
Added a NICKEL.
Added a DIME.
Added a QUARTER.
Removing all the coins:
Removed a QUARTER.
Removed a DIME.
Removed a NICKEL.
Removed a PENNY.
All done. Removed 41 cents.

*/
