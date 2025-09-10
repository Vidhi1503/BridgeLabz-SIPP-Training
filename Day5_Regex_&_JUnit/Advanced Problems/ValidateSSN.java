public class ValidateSSN {
    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";
        System.out.println(ssn1.matches("^\\d{3}-\\d{2}-\\d{4}$") ? "Valid" : "Invalid");
        System.out.println(ssn2.matches("^\\d{3}-\\d{2}-\\d{4}$") ? "Valid" : "Invalid");
    }
}
