import java.io.*;
import java.time.*;
import java.util.*;

public class TestSearchIt{

   public static void main(String[] args)throws IOException {
   String Name2="78637 Florida Cliffs, Blythe|(234)229-3444|Bobbie Jayce";
   String NameToDelete="Haag Camille";

   SearchIt s = new SearchIt();

   //getting the time of the datainsert
   Instant start = Instant.now();
   s.insertTestData();
   Instant end = Instant.now();
   Duration timeElapsed = Duration.between(start, end);


   //getting the time of the search
   Instant start2= Instant.now();
   s.SearchData();
   Instant end2= Instant.now();
   Duration timeElapsed2 = Duration.between(start2,end2);
   System.out.println("Time taken for search  of data from testdata: "+ timeElapsed2.toMillis() +" milliseconds");

   System.out.println("Time taken for insert of data from testdata: "+ timeElapsed.toMillis() +" milliseconds");
   //getting the time of delete
  

   }
















}
