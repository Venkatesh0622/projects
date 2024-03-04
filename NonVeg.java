package chillout;
import java.util.Scanner;


public class NonVeg 
{
	Scanner sc = new Scanner(System.in);
	
    String[] nonveg_starters = {"Chicken Lollypop", "Chicken Manchurian", "Chicken Tandoori","Chicken Noodles", "Fish Fry", "Fish Kababb","Pepper Chicken", "Chilli Chicken"};
    int[] prices = {189, 159, 299, 99, 179, 179, 199, 199};
    
    String[] biryaniItems = {"Chicken Lollypop Biryani", "Chicken Dum Biryani", "Mugalai Biryani","Chicken Fry Piece Biryani", "Mutton Biryani", "Fish Biryani", "Prawns Biryani" };      
    int[] biryaniPrices = {299, 259, 359, 199, 399, 299, 359};
   
    void non_vegList() 
    {
        int order;
        do 
        {
            System.out.println("Please Select...");
            System.out.println("✵✵✵✵✵✵✵✵✵✵✵✵✵");
            System.out.println("1 ==> NonVeg-Starters -->🍆🥦🥬");
            System.out.println("2 ==> Biryani's --> 🍝🍲🥗");
            order = sc.nextInt();

            switch(order) 
            {
                case 1:
                	this.displayMenu(nonveg_starters, prices);
                    break;
                case 2:
                    this.displayMenu(biryaniItems, biryaniPrices);
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
            System.out.println("** Non-Veg Menu **");
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
        NonVeg  menu= new NonVeg();
        menu.non_vegList();
    }
  
}
   
     
     
    

