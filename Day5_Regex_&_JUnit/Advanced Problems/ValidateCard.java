public class ValidateCard {
    public static void main(String[] args) {
        String card1 = "4123456789012345"; // Visa
        String card2 = "5123456789012345"; // MasterCard
        System.out.println(card1.matches("^4\\d{15}$") ? "Visa Valid" : "Invalid");
        System.out.println(card2.matches("^5\\d{15}$") ? "MasterCard Valid" : "Invalid");
    }
}
