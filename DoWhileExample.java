import java.util.Scanner;
class DoWhileExample{ // 6
     public static void main (String[] args) {
          int number,sum = 0;
          Scanner scan = new Scanner(System.in);
          do{
               System.out.println("Enter number: ");
               number = scan.nextInt();
               if(number >= 0){
                    sum+=number;
               }
          }while(number > 0); 
               System.out.println("Result is: "+ sum);
     }
}