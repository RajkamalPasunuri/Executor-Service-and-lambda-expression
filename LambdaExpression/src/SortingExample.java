import java.util.ArrayList;
import java.util.List;


public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personsList= new ArrayList<Person>();
		personsList.add(new Person("Raj","Pasunuri", 26, 20000));
		personsList.add(new Person("kamal","Pasunoori",25, 30000));
		System.out.println("Before Sorting");
		for(Person person : personsList){
			System.out.println(person);
		}
		System.out.println("Sorting With FN");
		personsList.sort((Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		personsList.forEach((person)->System.out.println(person));
		System.out.println("Sorting With LN");
		personsList.sort((Person p1, Person p2)->p1.getLastName().compareTo(p2.getLastName()));
		personsList.forEach((person)->System.out.println(person));
		System.out.println("Sorting With Age");
		personsList.sort((Person p1, Person p2)->p1.getAge()-(p2.getAge()));
		personsList.forEach((person)->System.out.println(person));
		System.out.println("Sorting With Salary");
		personsList.sort((Person p1, Person p2)->p1.getSalary()-(p2.getSalary()));
		personsList.forEach((person)->System.out.println(person));
		
	}

}
