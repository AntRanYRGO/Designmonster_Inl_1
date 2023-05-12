import java.util.*;
public class Main{
  public static void main(String[] args){
    //List<Person> persons;// = new ArrayList<>();
    /*
    persons.add(new Person("Bob", "bob@email.com"));
    persons.add(new Person("Ben", "ben@email.com"));
    persons.add(new Person("Pam", "pam@email.com"));
    persons.add(new Person("Eve", "eve@email.com"));
    persons.add(new Person("Guy", "guy@email.com"));
    persons.add(new Person("Lis", "lis@email.com"));
    persons.add(new Person("Ann", "ann@email.com"));
    System.out.println(persons);
    Storage.save(persons);
    */
    //persons=Storage.fetchPersons();
    //persons.trimToSize();
    //System.out.println(persons);
    //Employee engineer = new Employee("kamel", "kameluppfödningsroteln", );
    //System.out.println(engineer);


    List<McGuy> mcGuyList = new ArrayList<>();

    try {
      McGuy mcguy1 = new McGuy("John Doe");
      mcGuyList.add(mcguy1);

      McGuy mcguy2 = new McGuy("Alice Smith", "alice@example.com");
      mcGuyList.add(mcguy2);

      McGuy mcguy3 = new McGuy("Bob Johnson", "bob@example.com", "1234567890");
      mcGuyList.add(mcguy3);

      McGuy mcguy4 = new McGuy("Jane Smith");
      mcGuyList.add(mcguy4);

      McGuy mcguy5 = new McGuy(null);
      mcGuyList.add(mcguy5);
    } catch (NullPointerException e) {
      System.out.println("Error creating McGuy: " + e.getMessage());
    }

    // Print the list of McGuy objects
    for (McGuy mcGuy : mcGuyList) {
      System.out.println(mcGuy);
    }
  }
}
