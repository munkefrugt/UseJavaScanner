package Scannerpackage;

import java.util.Scanner;

/**
 * Created by v on 2/17/16.
 */
public class MainScanner

{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("hi");


        System.out.println("enter name");
        String name = input.nextLine();
        System.out.println("your name is: " + name);



    }


}
