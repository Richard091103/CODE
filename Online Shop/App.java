import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) throws Exception {
        myOrder();
    }

    static void myOrder() {
        System.out.println("Welcome to Lazpee!");

        System.out.print("Enter your name: ");
        String Name = scan.nextLine();

        System.out.println();
        System.out.print("Enter your first order: ");
        String Order1 = scan.nextLine();
        System.out.print("Price: ");
        double Price1 = scan.nextDouble();
        System.out.print("Qty: ");
        int Qty1 = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter your second order: ");
        String Order2 = scan.nextLine();
        System.out.print("Price: ");
        double Price2 = scan.nextDouble();
        System.out.print("Qty: ");
        int Qty2 = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter your third order: ");
        String Order3 = scan.nextLine();
        System.out.print("Price: ");
        double Price3 = scan.nextDouble();
        System.out.print("Qty: ");
        int Qty3 = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter your fourth order: ");
        String Order4 = scan.nextLine();
        System.out.print("Price: ");
        double Price4 = scan.nextDouble();
        System.out.print("Qty: ");
        int Qty4 = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter your fifth order: ");
        String Order5 = scan.nextLine();
        System.out.print("Price: ");
        double Price5 = scan.nextDouble();
        System.out.print("Qty: ");
        int Qty5 = scan.nextInt();
        

        double total1 = Qty1 * Price1; 
        double total2 = Qty2 * Price2; 
        double total3 = Qty3 * Price3; 
        double total4 = Qty4 * Price4; 
        double total5 = Qty5 * Price5; 
        double totalAmount = total1 + total2 + total3 + total4 + total5;

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+\t OFFICIAL RECEIPT! \t+");
        System.out.println("+-------------------------------+");
        System.out.println("+ Customer Name: " +Name+ "    +");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+  Qty  |  Order Name  |  Price +");
        System.out.println("+   " + Qty1 +"   |    "+Order1+"   |    " +total1 + " +");
        System.out.println("+   " + Qty2 +"   |    "+Order2+"   |    " +total2 + " +");
        System.out.println("+   " + Qty3 +"   |    "+Order3+"   |    " +total3 + " +");
        System.out.println("+   " + Qty4 +"   |    "+Order4+"   |    " +total4 + " +");
        System.out.println("+   " + Qty5 +"   |    "+Order5+"   |    " +total5 + " +");
        System.out.println("+-------------------------------+");
        System.out.println("+             Total Amount: " +totalAmount +"+");
        System.out.println("+-----THANK YOU FOR BUYING!-----+");
        System.out.println("+++++++++++++++++++++++++++++++++");


    };


}
