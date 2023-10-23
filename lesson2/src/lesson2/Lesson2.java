/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account(); 
        System.out.printf("Initial name is: %s%n%n",  myAccount.getName());
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // read a line of text
myAccount.setName(theName); 
System.out.println();
System.out.printf("Name in object myAccount is:%n%s%n",
        myAccount.getName());
    }
    
}
