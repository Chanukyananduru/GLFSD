import java.util.Scanner;

class SwitchImplementation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = in.nextInt();
        in.close();
        switch (num){

            case 1: System.out.println("Neither prime nor composite"); break;
            case 2: System.out.println("Prime number"); break;
            case 4: System.out.println("Composite number"); break;
            default : System.out.println("I do not know");

        }


    }
}