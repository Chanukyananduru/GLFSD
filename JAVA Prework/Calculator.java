import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        float num1;
        float num2;
        String operation;
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter first number:");
        num1= sc.nextFloat();
   
        System.out.println ("Enter second number:");
        num2= sc.nextFloat();

        System.out.println ("Enter 'add' or 'sub' or 'multiply' or 'divide':");
        operation= sc.next();

        sc.close();

        System.out.println("The first number you entered is -> " +num1);
        System.out.println("The second number your entered is -> " +num2);
        System.out.println("The operation you chose is -> " +operation);
    
        switch (operation){
            case "add": {
                float result = num1+num2;
                System.out.println("Result ->" +result); break;
            }
            case "sub": {
                float result = num1-num2;
                System.out.println("Result ->" +result); break;
            }
            case "multiply": {
                float result = num1*num2;
                System.out.println("Result ->" +result); break;
            }
            case "divide": {
                if (num2==0){
                    System.out.println("Division with 0 is not possible");
                } 
                else {
                    float result = num1/num2;
                System.out.println("Result ->" +result); break;
                }
            } 
        }
        
        
    }
}