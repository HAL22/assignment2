/**
 *This class creates a queryfile,containing names extracted from testdata
 *@author Thethela Faltein
*/




import java.io.*;
import java.util.*;

public class CreateQuery{
File queryfile;
String sline;
int count=0;
/**
 *creates the queryfile
 *@throws IOException
*/
public CreateQuery()throws IOException{
ArrayList<String>placeholder = new ArrayList<String>();
queryfile = new File("queryfile");
queryfile.createNewFile();
FileWriter writer = new FileWriter(queryfile);
FileReader data =new FileReader("/home/f/fltthe004/CSC2001F/assignment2/testdata");
BufferedReader br = new BufferedReader(data);
String thisline=null;


while((thisline = br.readLine()) != null){
   count++;
   sline=thisline;
  int islash=sline.indexOf('|');
  int len =sline.length();
  String sname=sline.substring(islash+1,len);
  islash=sname.indexOf('|');
  len = sname.length();
  String key = sname.substring(islash+1,len);
//  String[] j=sname.split("|");
  placeholder.add(key);
 //Use to vary the data
  if(count>1999){
  break;
  }

}


long seed=System.nanoTime();
Collections.shuffle(placeholder,new Random(seed));
String newline = System.getProperty("line.separator");

for(int i=0;i<placeholder.size();i++){
   writer.write(placeholder.get(i)+newline);
}
writer.close();


}

public static void main(String[] args) throws IOException{
CreateQuery CQ = new CreateQuery();
}






}
