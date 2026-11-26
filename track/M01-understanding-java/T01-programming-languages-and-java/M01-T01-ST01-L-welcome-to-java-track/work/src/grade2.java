
public class grade2 {
    public static void main(String[] args) {

        int marks = 34;

        switch (marks / 10) {

            case 10:
            case 9:
                System.out.println("Grade A");
                break;

            case 8:
                System.out.println("Grade B");
                break;

            case 7:
            case 6:
                System.out.println("Grade C");
                break;

            case 5:
            case 4:
            case (3 + 5 / 10):
                System.out.println("Grade D");
                break;

            default:
                System.out.println("You are great.");
                break;
        }
    }
}
