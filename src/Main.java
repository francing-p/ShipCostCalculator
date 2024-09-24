import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cost=0;          // define all variables
        double SHIPPING_COST=.02;
        double total=0;
        String trash=""; // use for bad input

        System.out.print("What is the cost of your item? $");

        if (in.hasNextDouble()){ // check to make sure input is valid
            cost=in.nextDouble();
            in.nextLine();
            System.out.println("You said the item cost $" + cost);
            if (cost<100){ // outputs shipping when less than $100
               total=cost*SHIPPING_COST + cost;
                System.out.println("Shipping is 2% of the price. Your total cost is: $" + total);
            }
            else{ // outputs shipping when item is $100 or more
                System.out.println("Shipping is free! Your total cost is: $" + cost);
            }
        }
        else { // end program if input is invalid
            trash=in.nextLine();
            System.out.println("You said the item cost $" + trash);
            System.out.println("This is an invalid input. Rerun and try again. ");
        }
    }
}