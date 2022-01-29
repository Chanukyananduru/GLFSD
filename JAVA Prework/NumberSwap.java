public class NumberSwap {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 4;

        System.out.println("Initial value of numbers:");
        System.out.println("Num 1->" +a);
        System.out.println("Num 2->" +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swapped values of numbers:");
        System.out.println("Num 1->" +a);
        System.out.println("Num 2->" +b);
    }
    
}
