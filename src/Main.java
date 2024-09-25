import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create new instance of Scanner

        double cost=0;          // define all variables
        double SHIPPING_COST=.02;
        double shipping=0;
        double total=0;
        String trash=""; // use for bad input

        System.out.print("What is the cost of your item? $");

        if (in.hasNextDouble()){ // check to make sure input is valid
            cost=in.nextDouble(); // collect user input
            in.nextLine();
            System.out.println("You said the item cost $" + cost);
            if (cost<100){ // outputs shipping when less than $100
               shipping=cost*SHIPPING_COST; // calculate shipping
               total= shipping + cost; // calculate total
                System.out.println("Shipping is: $" + shipping + ". Your total cost is: $" + total);
            }
            else{ // outputs shipping when item is $100 or more
                System.out.println("Shipping is free! Your total cost is: $" + cost);
            }
        }
        else { // end program if input is invalid
            trash=in.nextLine();
            System.out.println("You said the item cost $" + trash); // output the bad input
            System.out.println("This is an invalid input. Rerun and try again. ");
        }
    }
}