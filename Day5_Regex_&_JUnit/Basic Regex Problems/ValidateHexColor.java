public class ValidateHexColor {
    public static void main(String[] args) {
        String color = "#FFA500";
        System.out.println(color.matches("^#[0-9A-Fa-f]{6}$") ? "Valid" : "Invalid");
    }
}
