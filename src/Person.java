/**
 *This class implements the
 *Comparable class,this allows us tho overwrite the class
 *The class also us to store object in our binarySearchTree
 *@author Thethela
 *
*/


public class Person implements Comparable<Person>{
    String key;
    String value;

  /**
   *The constructor allows us to create a Person,with the
   *key(name) and the value
   *@param name first String value
   *@param v Second String value
   *
  */

    public Person(String name,String v){
    key=name;
    value=v;
    }

   /**
    *The constructor allows us to create a Person
    *Object with name(key) as parameter,use to compare
    *data from the queryfile to the BinarySearchTree
    *@param name Third String value
   */

    public Person(String name){
    key=name;
    value=null;
    }

 /**
  *@return name(key)
 */

    public String getname(){
     return key;
    }
  /**
   *@return value
  */

    public String getvalue(){
    return value;
    }
  /**
   *This method(overwrite version) compares two person object,using the name(key)
   *to compare,returns an integer, depending on the comparism
   *@param p of type person
   *@return integer
   */
    public int compareTo(Person p){
     return this.getname().compareTo(p.getname());
    }
   /**
    *@return name and value
   */

    public String toString(){
      return this.getname()+","+this.getvalue();
    }

}
