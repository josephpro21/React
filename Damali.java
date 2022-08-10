package Alpha;

import java.util.Scanner;

//creating a class
class One {
    String FirstName;
    int age ;
    public void ReadingData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First Name:\t");
        FirstName = scan.nextLine();
        System.out.println("Enter Yuor age:\t");
        age = scan.nextInt();
        //Display the data.

        System.out.println("Your name is "+FirstName+ "And your Age is "+age);

        }
}


public class Damali {
    public static void main(String[] args) {
       //it is in the main method that the execution of the program starts
        System.out.println("Yello Damali, Enjoy Java");
        /*
        create an object of class one.
        by using the syntax, classname   objectname = new classname();
        the object name can be anything  you can remember
         */

        One objectone = new One();
        /*
        after you have created the object from a class, use the dot notations to access
        the methods within that class.
         */
        objectone.ReadingData();

    }
}
