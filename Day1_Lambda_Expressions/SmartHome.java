package Day1_Lambda_Expressions;

interface LightAction { void execute(); }

public class SmartHome {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction night = () -> System.out.println("Dim lights for night mode");
        LightAction voice = () -> System.out.println("Voice command: Party lights");

        motion.execute();
        night.execute();
        voice.execute();
    }
}
