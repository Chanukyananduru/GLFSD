import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        int limit;
        int i = 1;
        int j = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter how many numbers you want to print:");
        limit= sc.nextInt();
        
        System.out.println("Printing "+limit+ " numbers:");
        System.out.print(i+","+j+",");
        for (int count =2; count< limit; count++)
        {
            int res = i + j;
            System.out.print(res+",");
            i=j;
            j=res;

        }



    }  
}