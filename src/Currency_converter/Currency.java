package Currency_converter;
import java.io.*;
import java.util.Scanner;
public class Currency {
    public static String currency_convert()throws Exception
    {
        double amount; //amount which user enter
        int code;  //for choice which user select in switch case
        String msg=""; //message which return at the end of function
        Scanner sc=new Scanner(System.in);
        System.out.println("\n*** Welcome to currency converter ***");

            System.out.print("Enter your amount : ");
            amount = sc.nextDouble();
            System.out.println("choose your currency");
            System.out.println("1 : Rupees\n2 : Dollar\n3 : Pound\n4 : Euro\n5 : Kuwaiti dinar\n6 : Rate of currency \n");
            int flag=1;
            Display d; //display class reference
            //if user choose wrong option then flag=1 and loop becomes infinite until user select right option
            while (flag==1) {
                System.out.print("Enter the currency code : ");
                code = sc.nextInt();


                switch (code) {
                    case 1:
                        flag=0;
                        d = new Rupees(amount);
                        msg = d.display();
                        break;
                    case 2:
                        flag=0;
                         d = new Dollar(amount);
                        msg = d.display();
                        break;
                    case 3:
                        flag=0;
                         d = new Pound(amount);
                        msg = d.display();
                        break;
                    case 4:
                        flag=0;
                         d = new Euro(amount);
                        msg = d.display();
                        break;
                    case 5:
                        flag=0;
                        d = new KWD(amount);
                        msg = d.display();
                        break;
                    case 6:
                        flag=0;
                        FileReader fr = new FileReader(
                                "D:\\G13_CALCULATOR_JAVA\\Currency_converter\\currency.txt");
                        int i;
                        while ((i = fr.read()) != -1) {
                            System.out.print((char) i);
                        }
                        fr.close();
                        break;
                    default:
                        System.out.println("Enter correct currency code");
                        flag = 1;
                }
            }
    return msg;
    }
}

