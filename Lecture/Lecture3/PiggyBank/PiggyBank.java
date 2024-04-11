package Week3.Lecture3.PiggyBank;

import Week3.Lecture3.ArrayBag;
import Week3.Lecture3.BagInterface;

/**
    A class that implements a piggy bank by using a bag.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 4.0
*/
public class PiggyBank
{
	private BagInterface<Coin> coins;

	public PiggyBank() 
	{
		coins = new ArrayBag<>();
	} // end default constructor

	public boolean add(Coin aCoin) 
	{
		return coins.add(aCoin);
	} // end add

	public Coin remove() 
	{
		return coins.remove();
	} // end remove

	public boolean isEmpty() 
	{
		return coins.isEmpty();
	} // end isEmpty
} // end PiggyBank
