public class grade3 {
    public static void main(String[] args) {
        int marks = 85;
        String res = (marks >= 90) ? " grade A " : (marks >= 80) ? " grade B " : (marks >= 75) ? "grade C " : "Fail";
        System.out.println(res);
    }
}
