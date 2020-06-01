/*
Write a class called Pet in a file called Pet.java to represent a pet. 
For each pet, store the pet's name, the type of animal it is (e.g. cat, dog or bird) and its age (an integer value). 
The constructor for this class must take values for each of the attributes. 
The only attribute that can be changed is the age of the pet. 
Include appropriate accessor(getter) and mutator(setter) methods as well as the method increaseAge() which increases
the age of the pet by 1.
Include a main method that creates an instance of a pet that is a 3-year old dog named Fido then print the pet object
 name and age to screen.
Then increase the age of the dog by 1, and display the dogs adjusted age using an accessor(getter) method.
*/

class Pet
{
    private String type;
    private String name;
    private int age;

    public Pet(String name, String type, int age)
    {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void increaseAge()
    {
        this.age++;
    }

    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public int getAge()
    {
        return this.age;
    }

    public String toString()
    {
        return ("Pet name: " + this.name + ", Pet type: " + this.name + ", Pet age: " + this.age);
    }

    public static void main(String[] args)
    {

        Pet p = new Pet("Fido", "dog", 3);
        System.out.println(p);
        p.increaseAge();
        System.out.println("The pets age is " + p.getAge());
    }
}