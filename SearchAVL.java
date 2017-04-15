import java.io.*;


public class SearchAVL{
  AVLTree<Person> bt;
  int count=0;

  public SearchAVL(){
     bt = new AVLTree<Person>();}

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
    count++;}

  }

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











}
