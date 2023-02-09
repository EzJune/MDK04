public class Person
{
    public String fullName = "Nikolenko A.D";
    public int age = 31;

    public void talk()
    {
        System.out.println(fullName + " says - blablabla ");
    }

    public void move()
    {
        System.out.println(fullName + " moves toward ");
    }

    public Person()
    {

    }

    public Person(String fullname, int age)
    {
        this.fullName = fullname;
        this.age = age;
    }






}

