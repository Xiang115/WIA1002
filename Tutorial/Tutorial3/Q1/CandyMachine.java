package Week3.Tutorial3.Q1;

    /*
     * DispenserCandies : Dispenser
     * DispenserChips : Dispenser
     * DispenserGum : Dispenser
     * DispenserCookies : Dispenser
     * Register : CashRegister
     * 
     * DisplayProducts() : void
     * Selection() : Dispenser
     * DisplayCost() : void
     * Operate() : void
     */

import java.util.Scanner;

public class CandyMachine {

    private Dispenser[] Items = {
        new Dispenser("Candies", 2.0),
        new Dispenser("Chip", 3.0),
        new Dispenser("Gum", 5.0),
        new Dispenser("Cookies", 2.5)
    };
    private CashRegister Register = new CashRegister();

    public CandyMachine(){
    }

    public void DisplayProducts(){
        System.out.println("The list of products: ");
        for(int i=0; i<Items.length ; i++){
            System.out.printf("%d. %s\n",i+1,Items[i].getItem());
        }
    }

    public Dispenser Selection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("""

            1 - Candies
            2 - Chip
            3 - Gum
            4 - Cookies
            Enter your choices :""");
        switch (sc.nextInt()) {
            case 1:
                return Items[0];
            case 2:
                return Items[1];
            case 3:
                return Items[2];
            case 4:
                return Items[3];
            default:
                return null;
        }
    }

    public void DisplayCost(Dispenser item){
        System.out.printf("The cost of %s: %.2f\n", item.getItem(), item.getCost());
    }

    public void Operate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Candy Machine\n");
        DisplayProducts();
        Dispenser choice = Selection();
        DisplayCost(choice);
        System.out.print("Enter the amount of money: ");
        Register.AcceptMoney(sc.nextDouble());
        Register.ReturnChange(choice.getCost());
    }
}
