import java.util.Scanner;

public class PersonTester
{
    private Scanner kb;
    private Person[] people;
    private final int SIZE = 15;
    private int current;

    //Task1
    public PersonTester()
    {
        this.people = new Person[SIZE];
        this.kb = new Scanner(System.in);
        this.current = 0;
    }

    //Task2
    public void addPerson()
    {
        for (int i = 0; i < SIZE; i++)
        {
            if (people[i] == null)
            {
                System.out.println("Please enter person name:");
                String name = this.kb.nextLine();
                System.out.println("Please enter person phone:");
                String phone = this.kb.nextLine();
                people[i] = new Person(name, phone);
                current++;
                break;
            }
        }
    }

    //Task2
    public void addPersonV2()
    {
        if (current < SIZE)
        {
            System.out.println("Please enter person name:");
            String name = this.kb.nextLine();
            System.out.println("Please enter person phone:");
            String phone = this.kb.nextLine();
            people[current] = new Person(name, phone);
            current++;
        }
    }

    //Task 3
    public void display()
    {
        boolean isEmpty = true;
        for (Person p : this.people)
        {
            if (p != null)
            {
                System.out.println(p.getName() + " " + p.getPhone());
                isEmpty = false;
            }
        }
        if (isEmpty)
        {
            System.out.println("Array is empty");
        }
    }

    //Task 4
    public int search(Person p)
    {
        for (int i = 0; i < current; i++)
        {
            if (people[i].getName().equals(p.getName()) && people[i].getPhone().equals(p.getPhone()))
            {
                return i;
            }
        }
        return -1;
    }

    //Task 5
    public Person removePerson(int index)
    {
        if (index < 0 || index > SIZE)
        {
            System.out.println("ERROR:Invalid index");
            return null;
        }
        else if (people[index] == null)
        {
            System.out.println("ERROR:Null index");
            return null;
        }
        else
        {
            Person copyPerson = new Person(people[index]);

            for (int i = index; i < SIZE - 1; i++)
            {
                people[i] = people[i + 1];
            }
            people[SIZE - 1] = null;
            current--;
            System.out.println("One person object has been removed, current count = " + current);
            return copyPerson;
        }
    }

    public static void main(String[] args)
    {
        PersonTester pt = new PersonTester();
        pt.addPerson();
        pt.addPersonV2();
        pt.display();
        Person a = new Person("bob", "300");
        System.out.println("Search result: " + pt.search(a));
        pt.removePerson(22);
        pt.removePerson(5);
        System.out.println(pt.removePerson(0));
        pt.display();
    }
}