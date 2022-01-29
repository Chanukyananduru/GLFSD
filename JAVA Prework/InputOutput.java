import java.util.Scanner;

class InputOutput{

    public static void main(String[] args) {
        int i;
        float f;
        char c;
        String str;
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter integer value:");
        i= sc.nextInt();
   
        System.out.println ("Enter float value:");
        f= sc.nextFloat();

        System.out.println ("Enter character value:");
        c = sc.next().charAt(0);

        System.out.println ("Enter phrase value:");
        str = sc.next();
    
        sc.close();

        System.out.println("int -> " +i);
        System.out.println("float -> " +f);
        System.out.println("char -> " +c);
        System.out.println("String value -> " +str);
    
        
    }
}