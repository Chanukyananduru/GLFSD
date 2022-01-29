public class SimpleDesign {
    public static void main(String[] args) {
        int rowlimit=5;
        for (int i =0; i<=rowlimit; i++){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
