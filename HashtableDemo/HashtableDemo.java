import java.util.*;
/*HashtableDemo is an exercise from Teach Yourself Java
 * @author PhoenixElijah
 * 7/24/2012
 */

class HashtableDemo {
    
    public static void main(String args[]){
        
        //Create the Persons.
        Person person1 = new Person("Bob", "555-1234", "444-1234", "bob@domain.com");
        //System.out.println("Person 1 added.");
        Person person2 = new Person("Sam", "555-1234", "444-1234", "sam@domain.com");
        //System.out.println("Person 2 added.");
        Person person3 = new Person("Tom", "555-1234", "444-1234", "tom@domain.com");
        //System.out.println("Person 3 added.");
        Person person4 = new Person("Lil", "555-1234", "444-1234", "lil@domain.com");
        //System.out.println("Person 4 added.");
        Person person5 = new Person("Sal", "555-1234", "444-1234", "sal@domain.com");
        //System.out.println("Person 5 added.");
        
        //The Hashtable that the Persons into.
        Hashtable hashtable = new Hashtable();
        
        //Place the people into the Hashtable.
        hashtable.put("ssn1", person1);
        hashtable.put("ssn2", person2);
        hashtable.put("ssn3", person3);
        hashtable.put("ssn4", person4);
        hashtable.put("ssn5", person5);
        
        //Make the enumerator to go through the Hashtable.
        Enumeration enu = hashtable.keys();        
        //Display the elements of the Hashtable.
        while(enu.hasMoreElements()){
            Object k = enu.nextElement();
            
            Object v = hashtable.get(k);
            Person p = (Person) v;
            
            System.out.println("SSN: " + k + " Name: " + p.name + " Phone: " +
                    p.phone + " Fax: " + p.fax + " Email: " + p.email);
          
        
        
        }
    }
}