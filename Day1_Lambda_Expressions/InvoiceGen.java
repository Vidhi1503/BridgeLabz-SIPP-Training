package Day1_Lambda_Expressions;

import java.util.*;

class Invoice {
    String txnId;
    Invoice(String id){ this.txnId=id; }
    public String toString(){ return "Invoice:"+txnId; }
}

public class InvoiceGen {
    public static void main(String[] args) {
        List<String> txns = Arrays.asList("TX1001","TX1002","TX1003");
        txns.stream().map(Invoice::new).forEach(System.out::println);
    }
}
