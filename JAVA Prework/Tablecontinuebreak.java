class Tablecontinuebreak{
    public static void main(String[] args) {
        for (int i=0;;i++){
            if (i%2!=0)
                continue;
            else if (i>20)
                break;
            else
                System.out.println(i);
                

        }
    }
}