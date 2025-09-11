package Day2_Functional_Interfaces;

import java.io.*;
class BackupData implements Serializable {
    String data="Backup Info";
}
public class DataBackup {
    public static void main(String[]a){
        BackupData b=new BackupData();
        System.out.println("Serializable backup created");
    }
}
