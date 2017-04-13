//Thethela Faltein
//SearchIt

/**
 *This class feeds data into a binarySearchTree,and then uses a queryfile to search 
 *the binarySearchTree
 *@author Thethela Faltein
 *@version 1.0
*/




import java.io.*;


public class SearchIt{
  BinarySearchTree<Person> bt;
  int count=0;
  /**
   *Constructors creates the BinarySearchIt
   *@throws IoException
  */
  
  public SearchIt()throws IOException {
     bt = new BinarySearchTree<Person>();
  
  
       FileReader data = new FileReader("/home/thethela/assignment1/testdata");
      BufferedReader br = new BufferedReader(data); 
      String thisline=null;


    while((thisline = br.readLine()) != null){
       String sline=thisline;
       int len=sline.length();
       int islash=sline.indexOf('|');
       String sname=sline.substring(islash+1,len);
       islash=sname.indexOf('|');
       len=sname.length();
       String sKey=sname.substring(islash+1,len);
       bt.insert(new Person(sKey,sline));
       count++;}  
     
  }

/**
 *Searches the Binary Search Tree,using the queryfile
 *@throws IOException
*/ 

 public void SearchData()throws IOException {
 
 
  FileReader d = new FileReader("/home/thethela/assignment1/src/queryfile");
  BufferedReader b = new BufferedReader(d);
  String s= null;
  
  while((s= b.readLine()) != null){
      String sl=s;
      if(bt.find(new Person(sl)) != null){
       bt.visit(bt.find(new Person(sl)));
      }
      else{System.out.println("Not Found");} 
 
 
 
 
 }
 
 
 
 
 
 }



}
