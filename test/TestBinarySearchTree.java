import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.Before;

public class TestBinarySearchTree{

  
     
  @Before public void setup(){
  
   
  } 

  @Test public void TestFind(){
  BinarySearchTree<Person>  bt = new BinarySearchTree<Person>();
  Person p4 = new Person("Thethela");
  Person p5 = new Person("alex");
  Person p1 = new Person("Thethela","male/black");
  Person p2 = new Person("Candice","female/white");
  Person p3 = new Person("Zoe","female/black");
  bt.insert(p1);
  bt.insert(p2);
  bt.insert(p3); 
   
   assertNotNull(bt.find(p4));
   assertNull(bt.find(p5));
 

     
  }
   
  @Test public void TestSize(){

  BinarySearchTree<Person>  bt2 = new BinarySearchTree<Person>();
  Person p4 = new Person("Thethela");
  Person p5 = new Person("alex");
  Person p1 = new Person("Thethela","male/black");
  Person p2 = new Person("Candice","female/white");
  Person p3 = new Person("Zoe","female/black");
  bt2.insert(p1);
  bt2.insert(p2);
  bt2.insert(p3);

    assertEquals((Integer)bt2.getSize(),(Integer)3);
  }

  @Test public void TestHeight(){
   BinarySearchTree<Person>  bt3 = new BinarySearchTree<Person>();
  Person p4 = new Person("Thethela");
  Person p5 = new Person("alex");
  Person p1 = new Person("Thethela","male/black");
  Person p2 = new Person("Candice","female/white");
  Person p3 = new Person("Zoe","female/black");
  bt3.insert(p1);
  bt3.insert(p2);
  bt3.insert(p3);
   
    assertEquals((Integer)bt3.getHeight(),(Integer)1); 
 
 }



}
