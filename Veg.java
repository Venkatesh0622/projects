package chillout;
import java.util.Scanner;

public class Veg 
{
    Scanner sc = new Scanner(System.in);
    
    String[] vegStarters = {"Gobi Manchurian", "Baby Corn Manchurian", "Panner Fry", "Gobi Noodles"};
    int[] vegStartersPrices = {99, 99, 119, 119};
    
    String[] vegBiryanis = {"Gobi Rice", "Mushroom Biryani", "Panner Biryani", "Jeera Rice", "Veg Fried rice", "Curd Rice"};
    int[] vegBiryanisPrices = {119, 199, 159, 159, 159, 159};

    void vegList() 
    {
        int order;
        do 
        {
            System.out.println("Please Select...");
            System.out.println("✵✵✵✵✵✵✵✵✵✵✵✵✵");
            System.out.println("1 ==> Veg-Starters -->🍆🥦🥬");
            System.out.println("2 ==> Veg Biryani's --> 🍝🍲🥗");
            order = sc.nextInt();

            switch(order) 
            {
                case 1:
                	this.displayMenu(vegStarters, vegStartersPrices);
                    break;
                case 2:
                    this.displayMenu(vegBiryanis, vegBiryanisPrices);
                    break;
                default:
                    System.out.println("⚠️ Invalid option!...");
                    System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️" + "\n");
                    System.out.println("Please enter a valid option...." + "\n" + "\n");
            }
        } while(order!=1 && order!=2);
    }

    void displayMenu(String[]items,int[]prices)
    {
        int itemNumber;
        do 
        {
            System.out.println("** Veg Menu **");
            System.out.println("------------------------------------"+"\n");

            for (int i=0;i<items.length;i++) 
            {
                System.out.println((i+1)+" ==> "+items[i]+"---------"+prices[i]+"/-");
            }

            System.out.println("\nSelect the item");
            itemNumber=sc.nextInt();

            if (itemNumber>=1 && itemNumber<=items.length) 
            {
                System.out.println(itemNumber+" ==> " +items[itemNumber-1]+ "---------" + prices[itemNumber-1] + "/-");
            } 
            else 
            {
                System.out.println("⚠️ Invalid option!...");
                System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️" + "\n");
                System.out.println("Please enter a valid option...." + "\n" + "\n");
            }

        } while(itemNumber<1 || itemNumber>items.length);
    }

    public static void main(String[] args) {
        Veg vegMenu = new Veg();
        vegMenu.vegList();
    }
}
