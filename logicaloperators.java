public class logicaloperators {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 30;
        int x = 34;
        int y = 64;


        // boolean result = a<b && x<y;
        boolean result = a<b || x<y;

        System.out.println(result);         //(! -- changes the result to opposite)

    }
}
