public class Example_If_Else {
    public static void main(String[] args) {

        int x = 20;
        int y = 20;

        if (x>y) {
            System.out.println("You Won");
        }
        if (x<y) {
            System.out.println("You lost");
        }
        if (x==y) {
            System.out.println("Tied");
        }

        // else

        if (x>y) {
            System.out.println("You Won");
        }
        else if (x==y) {
            System.out.println("Tied");
        }
        else {
            System.out.println("Try Again");
        }
    }
}
