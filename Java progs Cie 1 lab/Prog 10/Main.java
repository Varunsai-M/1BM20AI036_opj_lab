import java.util.Scanner;

enum Products{
    Lays(10),Hersheys(35),Kitkat(30);
    private int price;
    Products(int p)
    {
        this.price = p;
    }
    public int getPrice()
    {
        return price;
    }
}

interface VendingMachineInterface
{
    public void displayProductMessage();
    public void selectProduct(Products p,Calculator obj);
    public void enterCoinsMsg(Calculator obj);
    public void enterCoins(int n);
    public void displayChangeMsg(Calculator obj);
}

class Calculator
{
    int total;
    Calculator()
    {
        total = 0;
    }
    void calculateTotal(int price)
    {
        this.total += price;
    }
    int calculateChange(int coins)
    {
        return (coins - total);
    }
}

class VendingMachine implements VendingMachineInterface
{
    int coins;
    VendingMachine()
    {
        coins = 0;
    }
    public void displayProductMessage()
    {
        System.out.println("The list of Products :");
        System.out.println();
        System.out.println("Product\tPrice");
        for(Products p : Products.values())
        {
            System.out.println(p + "\t" + p.getPrice());
        }
    }
    public void selectProduct(Products p,Calculator obj)
    {
        switch(p)
        {
            case Lays : System.out.println("Item Selected : Lays");
                        obj.calculateTotal(p.getPrice());
                        break;
            case Hersheys : System.out.println("Item Selected : Hersheys");
                            obj.calculateTotal(p.getPrice());
                            break;
            default:System.out.println("Item Selected : KitKat");
                    obj.calculateTotal(p.getPrice());
                    break;
        }
    }
    public void enterCoinsMsg(Calculator obj)
    {
        System.out.println("Put the coins for the total price : " + obj.total);
    }
    public void enterCoins(int n)
    {
        this.coins = n;
    }
    public void displayChangeMsg(Calculator obj)
    {
        System.out.println("Collect the change : " + obj.calculateChange(coins));
    }
}

public class Main 
{
    public static void main(String args[])
    {
        Calculator c = new Calculator();
        VendingMachine vm = new VendingMachine();
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("*** Menu ***");
            System.out.println("1. Display Products");
            System.out.println("2. Select Product");
            System.out.println("3. Display Total and Coins Message");
            System.out.println("4. Enter Coins, Display Change Message and Exit");
            System.out.println("Enter your choice :");
            ch = sc.nextInt(); 
            switch(ch)
            {
                case 1 :vm.displayProductMessage();
                        break;
                case 2 :int choice;
                        Products p;
                        System.out.println("1. Lays\n2. Hersheys\n3. KitKat");
                        System.out.println("Enter your choice :");
                        choice = sc.nextInt();
                        if (choice == 1)
                        {
                            p = Products.Lays;
                            vm.selectProduct(p, c);
                        }
                        else if(choice == 2)
                        {
                            p = Products.Hersheys;
                            vm.selectProduct(p, c);
                        }
                        else
                        {
                            p = Products.Kitkat;
                            vm.selectProduct(p, c);
                        }
                        break;
                case 3 :vm.enterCoinsMsg(c);
                        break;
                case 4 :System.out.println("Enter Coins :"); //Each coin is assumed to be 1 unit
                        int coins = sc.nextInt();
                        sc.close();
                        vm.enterCoins(coins);
                        vm.displayChangeMsg(c);
                        System.exit(0);
            }
        }
    }
}