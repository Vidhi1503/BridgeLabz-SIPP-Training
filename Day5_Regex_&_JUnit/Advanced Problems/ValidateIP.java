public class ValidateIP {
    public static void main(String[] args) {
        String ip = "192.168.0.1";
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        System.out.println(ip.matches(regex) ? "Valid" : "Invalid");
    }
}
