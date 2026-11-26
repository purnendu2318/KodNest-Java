public class grade {
    public static void main(String[] args) {
        int marks = 99;
        if (marks >= 91 && marks <= 100) {

            System.out.println("Grade A");
        } else if (marks >= 81 && marks <= 90) {

            System.out.println("Grade B");
        } else if (marks >= 61 && marks <= 80) {

            System.out.println("Grade c");
        } else if (marks >= 35 && marks <= 60) {
            System.out.println("Grade d");
        } else {

            System.out.println("You are great. ");
        }
    }

}
