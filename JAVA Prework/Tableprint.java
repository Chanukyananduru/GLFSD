import java.util.Scanner;

class Tableprint{
    public static void main(String[] args) {
        int table;
        int row;
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter first number:");
        table= sc.nextInt();
   
        System.out.println ("Enter second number:");
        row= sc.nextInt();

        sc.close();

        System.out.println ("Table: "+table+" as requested:");
        
        for (int i = 0; i<=row; i++){
            int product = table*i;
            System.out.println(+table+" * "+i+" = "+product);
        }
        
    }
}