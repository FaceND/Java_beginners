import java.util.Scanner;
class ForExample { // 7
     public static void main (String[] args) {
          int amount,product_price;
          float sum = 0.0f;
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter Product Amount: ");
          amount = scan.nextInt();
          
          for(int i=1; i<=amount; i++) {
               System.out.println("Enter Product Price "+ i +": ");
               product_price = scan.nextInt();
               sum += (product_price*0.07f) + product_price;
          }
          System.out.println("Price of Products: " +sum);
     }
}