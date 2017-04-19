import java.io.*;
/**
 *This program feeds an AVLTree with data from a dataset,and searches the AVLTree using names from a queryfile
 *@author Thethela Faltein
 *@version 1.0
*/

public class SearchAVL{
  AVLTree<Person> bt;
  int count=0;
  int c1=0;
/**
 *this method creates the AVLTree
 *
*/
  public SearchAVL(){
     bt = new AVLTree<Person>();}

/**
 *this method inserts the AVLTree with data from the testdata file
 *@throws IOException
*/

  public  void insertTestData()throws IOException{
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
    count++;
    c1++;
     if(c1>6999){break;}
   }

  }
/**
 *this method searches the AVLTree
 *@throws IOException
*/
  public void SearchData()throws IOException{
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
/**
 *this method return the size of the AVLTree
 *@return size of AVLTree
*/
 public int size(){
  return bt.getSize();
 }










}
