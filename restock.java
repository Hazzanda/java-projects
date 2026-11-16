import java.util.Scanner;

public class restock {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scan.nextLine();

        System.out.print("Current stock quantity: ");
        int currentStock = Integer.valueOf(scan.nextLine());

        System.out.print("Minimum stock level: ");
        int reorderLevel = Integer.valueOf(scan.nextLine());

        int reorderQuantity = reorderLevel - currentStock;

        if (currentStock <= 0) {
            System.out.println("Out Of Stock");
            System.out.println("Reorder " + reorderQuantity + " packs of " + name + " now. Current stock is below threshold.");
        } else if (currentStock < reorderLevel) {
            System.out.println("Reorder " + reorderQuantity + " packs of " + name + " soon. Current stock is below threshold.");   
        } else {
            System.out.println("Stock OK. Happy selling!");
        }
    }
}