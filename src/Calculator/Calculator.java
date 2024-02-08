
package Calculator;
import Length_converter.Langth;
import Currency_converter.Currency;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int choise; //for choice which user select in switch case
        int flag=1; //if user choose wrong option then flag=1 and loop becomes infinite until user select right option
        int exit=1;  //if code run successfully then ask for continue
        int j=0; //if user select wrong option when ask for continue loop becomes infinite until user enter 1 or 0

            System.out.println("\n********** Welcome to java mini-project **********\n");
        while (flag==1)
        {
            j=0;  //this is for ask user to continue or not
            System.out.println("1 : Currency converter \n2 : Length converter \n3 : Exit");
            System.out.print("Enter your choise : ");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    flag=0;
                    currency();
                    break;
                case 2:
                    flag=0;
                    length();
                    break;
                case 3 :
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    flag = 1;
                    j=1;
                    System.out.println("\nPlease choose valid option");
                    break;
            }
            while (j==0){
            System.out.println("\nEnter 0 for exit\nEnter 1 for continue : ");
            exit = sc.nextInt();
            if (exit==0)
            {
                System.out.println("Thank you");
                System.exit(0);
            }
            else if(exit==1)
            {
                j=1;
                flag=1;

            }
            else {
                j=0;
                System.out.println("\nPlease enter valid choise");
            }
            }
        }
    }catch(Exception e)
    {
        System.out.println("\nSome Error occured we will fix it soon");
    }
    }

/***************************  Function for length calculation  ***************************/
 static void length(){
        try{
                System.out.println(Langth.langth_convert());
        }catch(Exception e)
        {
            System.out.println("\nSome Error occured we will fix it soon");
        }
    }

/***************************  Function for length calculation  ***************************/
static void currency(){
        try{
            System.out.println(Currency.currency_convert());
        }catch(Exception e)
        {
            System.out.println("\nSome Error occured we will fix it soon");
        }
    }

}






















