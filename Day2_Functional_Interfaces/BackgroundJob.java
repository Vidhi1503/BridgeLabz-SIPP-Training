package Day2_Functional_Interfaces;

public class BackgroundJob {
    public static void main(String[]a){
        Runnable job=()->System.out.println("Job executed!");
        new Thread(job).start();
    }
}
