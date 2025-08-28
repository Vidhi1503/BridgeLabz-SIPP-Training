package Day3_Java_Streams;

import java.io.*; import java.util.*;
class WordCount {
    public static void main(String[] a)throws Exception {
        Map<String,Integer> map=new HashMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader("words.txt"))){
            String line;
            while((line=br.readLine())!=null)
                for(String w:line.split("\\W+")) if(!w.isEmpty())
                    map.put(w,map.getOrDefault(w,0)+1);
        }
        map.entrySet().stream()
           .sorted((x,y)->y.getValue()-x.getValue())
           .limit(5).forEach(System.out::println);
    }
}
