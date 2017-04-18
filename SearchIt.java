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
  int c1=0;
  /**
   *Constructors creates the BinarySearchIt
   *@throws IoException
  */

  public SearchIt(){
     bt = new BinarySearchTree<Person>();}


  public void insertTestData()throws IOException {
       FileReader data = new FileReader("/home/f/fltthe004/CSC2001F/assignment2/testdata");
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
       c1++;
       count++;
       if(c1>2000){break;}
     }

  }

/**
 *Searches the Binary Search Tree,using the queryfile
 *@throws IOException
*/

 public void SearchData()throws IOException {


  FileReader d = new FileReader("/home/f/fltthe004/CSC2001F/assignment2/queryfile");
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


 public void  delete(Person p){
      bt.delete(p);
 }

 public void  insert(Person p){
   bt.insert(p);
 }

 public int size(){
  return bt.getSize();

 }

}
