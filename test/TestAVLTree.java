import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.Before;

public class TestAVLTree{


 @Test public void TestHeight(){
   AVLTree<Person> av = new AVLTree<Person>();
   Person p1 = new Person("Thethela","male/black");
   Person p2 = new Person("Candice","female/white");
   av.insert(p1);
   av.insert(p2);
   assertEquals((Integer)av.getHeight(),(Integer)1);
 }

 @Test public void TestBalanceFactor(){
   AVLTree<Person> av = new AVLTree<Person>();
   Person p1 = new Person("Thethela","male/black");
   Person p2 = new Person("Candice","female/white");
   Person p3 = new Person("Wayne","male/coloured");
   Person p4 = new Person("Amber","female/white");
   Person p5 = new Person("Thethela");
   av.insert(p1);
   av.insert(p2);
   av.insert(p3);
   assertEquals((Integer)av.balanceFactor(av.find(p5)),(Integer)0);
 }

 @Test public void TestHeightAferRotation(){
   AVLTree<Person> av = new AVLTree<Person>();
   Person p1 = new Person("Thethela","male/black");
   Person p2 = new Person("Candice","female/white");
   Person p3 = new Person("Wayne","male/coloured");
   Person p4 = new Person("Busi","female/black");
   Person p5 = new Person("Amber","female/white");
   av.insert(p1);
   av.insert(p2);
   av.insert(p3);
   av.insert(p4);
   av.insert(p5);
    assertEquals((Integer)av.getHeight(),(Integer)2);
 }

 @Test public void TestDelete(){
   AVLTree<Person> av = new AVLTree<Person>();
   Person p1 = new Person("Thethela","male/black");
   Person p2 = new Person("Candice","female/white");
   Person p3 = new Person("Wayne","male/coloured");
   Person p4 = new Person("Busi","female/black");
   Person p5 = new Person("Amber","female/white");
   Person p6 = new Person("Thethela");
   av.insert(p1);
   av.insert(p2);
   av.insert(p3);
   av.insert(p4);
   av.insert(p5);
   av.delete(p6);
   assertEquals((Integer)av.getSize(),(Integer)4);
 }










}
