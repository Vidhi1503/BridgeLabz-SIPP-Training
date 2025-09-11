import java.util.*;
import java.util.function.Predicate;

public class HospitalAlerts {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "Critical: Heart", 
            "Info: BP Check", 
            "Critical: Oxygen"
        );
        Predicate<String> onlyCritical = a -> a.startsWith("Critical");
        alerts.stream().filter(onlyCritical).forEach(System.out::println);
    }
}
