package base;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner a = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = a.nextLine();
        String msg = "Hello, " + name + ", nice to meet you!";
        System.out.println(msg);
    }
}
