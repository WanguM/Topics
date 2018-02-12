public class Example_And_Or {
    public static void main(String[] args) {

        int x,y;

        x=15;
        y=45;

        if (x>30 && y>30) {
            System.out.println("Both Numbers Are positve");
        }
        if (x>30 || y>30) {
            System.out.println("Atleast one number is positve");
        }
        else {
            System.out.println("Both Numbers Are negative");
        }
    }
}