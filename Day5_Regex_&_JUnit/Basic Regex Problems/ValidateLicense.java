public class ValidateLicense {
    public static void main(String[] args) {
        String plate = "AB1234";
        System.out.println(plate.matches("^[A-Z]{2}\\d{4}$") ? "Valid" : "Invalid");
    }
}
