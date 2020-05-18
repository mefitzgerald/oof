public class Person
{
    private String name;
    private String phone;

    public Person()
    {
        this("unknown", "unknown");
    }

    public Person(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    // copy constructor
    public Person(Person p)
    {
        name = p.name;
        phone = p.phone;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setPhone(String newPhone)
    {
        phone = newPhone;
    }

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String toString()
    {
        return "Person[name: " + name + " phone: " + phone + "]";
    }
}