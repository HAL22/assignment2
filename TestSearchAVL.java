import java.io.*;
import java.time.*;
import java.util.*;

public class TestSearchAVL{

 public static  void main(String[] args)throws IOException {

 SearchAVL a = new SearchAVL();
 Instant start = Instant.now();
 a.insertTestData();
 Instant end = Instant.now();
 Duration timeElapsed=Duration.between(start,end);

 Instant start2= Instant.now();
 a.SearchData();
 Instant end2= Instant.now();
 Duration timeElapsed2 = Duration.between(start2,end2);
 System.out.println("Time taken to insert the  data from testdata: "+ timeElapsed.toMillis() +" milliseconds");
 System.out.println("Time taken for search  of data from testdata: "+ timeElapsed2.toMillis() +" milliseconds");





   }







}
