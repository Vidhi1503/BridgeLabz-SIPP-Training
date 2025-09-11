package Day3_Stream_API;

import java.util.*;import java.time.*;
public class TransactionLogger{
  public static void main(String[]a){
    List<String>ids=Arrays.asList("TXN1","TXN2");
    ids.forEach(id->System.out.println(LocalDateTime.now()+" - Transaction: "+id));
  }
}
