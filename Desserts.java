package chillout;

import java.util.Scanner;

public class Desserts 
{
	Scanner sc = new Scanner(System.in);
	void desserts_list()
	{
		
		int val;
        do 
        {
            System.out.println("Desserts");
            System.out.println("✵✵✵✵✵✵✵✵✵✵✵✵✵");
            System.out.println("55 ==> Sweets      ⟹⟹⟹ 🍰🍰");
            System.out.println("66 ==> Ice Creams  ⟹⟹⟹ 🍧🍨");
            System.out.println("77 ==> Soft Drinks ⟹⟹⟹ 🍹🍹");
            System.out.println("Select the items");
            val = sc.nextInt();
            switch (val) 
            {
                case 55:
                    this.sweets();
                    break;
                case 66:
                    this.icecreams();
                    break;
                case 77:
                    this.softdrinks();
                    break;
                default:
                	System.out.println("⚠️ Invalid option!...");
                	System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️"+ "\n");
                    System.out.println("Please enter a valid option...."+ "\n"+ "\n");
            }
        } 
        while (val != 55 && val != 66 && val != 77);
   	}
	void sweets()
	{
		int s;
        do 
        {
            System.out.println("* Sweets *");
            System.out.println("------------------------" + "\n");
            System.out.println("1 ==> Friut Salad");
            System.out.println("2 ==>Double ka Meetha");
            System.out.println("3 ==>Gulab Jamoon");
            System.out.println("4 ==>Rasagulla"+"\n"+"\n");
            System.out.println("Select the items");
            s = sc.nextInt();
            switch (s) 
            {
                case 1:
                    System.out.println("==>Jilebi(4pcs)----------------99/-");
                    break;
                case 2:
                    System.out.println("==>Double ka Meetha-----119/-");
                    break;
                case 3:
                    System.out.println("==>Gulab Jamoon(6pcs)----------79/-");
                    break;
                case 4:
                    System.out.println("==>Rasagulla(6pcs)-------------79/-");
                    break;
                default:
                	System.out.println("⚠️ Invalid option!...");
                	System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️"+ "\n");
                    System.out.println("Please enter a valid option...."+ "\n"+ "\n");
            }
        } 
        while (s < 1 || s > 4);
   	}
	void icecreams()
	{
		int ice;
        do 
        {
            System.out.println("* Ice Creams *");
            System.out.println("------------------------" + "\n");
            System.out.println("1==>Friut Salad--------99/-");
            System.out.println("2==>Vanilla------------59/-");
            System.out.println("3==>Choclate-----------69/-");
            System.out.println("4==>StrawBerry---------69/-");
            System.out.println("5==>Butter Scotch------79/-");
            System.out.println("6==>Black Current------89/-");
            System.out.println("7==>Pineapple----------69/-"+"\n"+"\n");
            System.out.println("Select the items");
            ice = sc.nextInt();
            switch (ice) 
            {
                case 1:
                    System.out.println("==>Friut Salad-----------99/-");
                    break;
                case 2:
                    System.out.println("==>Vanilla------------59/-");
                    break;
                case 3:
                    System.out.println("==>StrawBerry---------69/-");
                    break;
                case 4:
                    System.out.println("==>Butter Scotch------79/-");
                    break;
                case 5:
                    System.out.println("==>Black Current------89/-");
                    break;
                case 6:
                    System.out.println("==>Pineapple----------69/-");
                    break;
                default:
                	System.out.println("⚠️ Invalid option!...");
                	System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️"+ "\n");
                    System.out.println("Please enter a valid option...."+ "\n"+ "\n");
            }
        } 
        while (ice < 1 || ice > 7);
    
	}
	void softdrinks()
	{
		int cool;
        do 
        {
            System.out.println("* Soft Drinks *");
            System.out.println("------------------------" + "\n");
            System.out.println("1==>Coke--------29/-");
            System.out.println("2==>Tumbsup-----29/-");
            System.out.println("3==>Sprite------29/-");
            System.out.println("4==>Fanta-------29/-");
            System.out.println("Select the items");
            cool = sc.nextInt();
            switch (cool) 
            {
                case 1:
                    System.out.println("==>Coke--------29/-");
                    break;
                case 2:
                    System.out.println("==>Tumbsup-----29/-");
                    break;
                case 3:
                    System.out.println("==>Sprite------29/-");
                    break;
                case 4:
                    System.out.println("==>Fanta-------29/-");
                    break;
                default:
                	System.out.println("⚠️ Invalid option!...");
                	System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️"+ "\n");
                    System.out.println("Please enter a valid option...."+ "\n"+ "\n");
            }
        } 
        while (cool < 1 || cool > 4);
	}
}
