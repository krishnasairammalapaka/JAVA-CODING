public class SwitchExample {
    public static void main(String[] args) {
        int n = 11;

        switch (n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("TuesdaY");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thurday");
                break;
            case 5:
                System.out.println("friday");       //instead if -> use yeild
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter a valod number");
        }
    }
}
