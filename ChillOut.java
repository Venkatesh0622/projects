package chillout;
import java.util.Scanner;

public class ChillOut 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int menu;
		
        do 
        {
            System.out.println("WELCOME TO CHILLOUT RESTAURANT");
            System.out.println("    💥~~~~~~~~🙏🙏🙏~~~~~~~~💥     " + "\n");
            System.out.println("Plzz Choose items  and Enter the Number");
            System.out.println("--------------------------------------- ");
            System.out.println("1 ==> Veg --> 🍆🥕🥦");
            System.out.println("2 ==> Non-Veg --> 🍗🥩🍗");
            System.out.println("3 ==> Desserts --> 🍦🍨🍧" + "\n");
            System.out.println("Order Plzz....." + "\n");
            System.out.println("Enter the Code to Proceed" + "\n");
            menu = sc.nextInt();
            switch (menu) 
            {
                case 1:
                	Veg aobj=new Veg();
                	aobj.vegList(); 	
                    break;
                case 2:
                    NonVeg bobj=new NonVeg();
                	bobj.non_vegList();
                    break;
                case 3:
                    Desserts cobj=new Desserts();
                    cobj.desserts_list();
                    break;
                default:
                    System.out.println("⚠️ Invalid option!...");
                    System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️"+ "\n");
                    System.out.println("Please enter a valid option...." + "\n"+ "\n");
            }
        } 
        while (menu < 1 || menu > 3);
        sc.close();
	}
	
}