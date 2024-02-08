package Length_converter;
import java.io.*;
import java.util.Scanner;
public class Langth {
    public static String langth_convert() throws Exception
    {
        double langth;//length which user enter
        int code;//for choice which user select in switch case
        String msg=""; //message which return at the end of function
        Scanner sc=new Scanner(System.in);
        System.out.println("\n*** Welcome to length converter ***");

        System.out.print("Enter your langth : ");
        langth = sc.nextDouble();
        System.out.println("choose your unit");
        System.out.println("1 : feet\n2 : Cm\n3 : meter\n4 : inch\n5 : Rate of Length \n");
        Display d; //display class reference
        int flag=1;
        //if user choose wrong option then flag=1 and loop becomes infinite until user select right option
        while (flag==1) {
            System.out.print("Enter the code : ");
            code = sc.nextInt();

            switch (code) {
                case 1 -> {
                    flag = 0;
                    d = new feet(langth);
                    msg = d.display();
                }
                case 2 -> {
                    flag = 0;
                    d = new Cm(langth);
                    msg = d.display();
                }
                case 3 -> {
                    flag = 0;
                    d = new Meter(langth);
                    msg = d.display();
                }
                case 4 -> {
                    flag = 0;
                    d = new Inch(langth);
                    msg = d.display();
                    break;
                }
                case 5 -> {
                    flag = 0;
                    FileReader fr = new FileReader(
                            "D:\\G13_CALCULATOR_JAVA\\Length_converter\\length.txt");
                    int i;
                    while ((i = fr.read()) != -1) {
                        System.out.print((char) i);
                    }
                    fr.close();
                    break;
                }
                default -> {
                    flag = 1;
                    msg = "Enter correct langth code";
                }
            }
        }
            return msg;
    }

}

