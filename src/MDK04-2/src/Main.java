public class Main
{
    public static void main(String[] args)
    {
        Person name = new Person();

        Person fullname = new Person(name.fullName, name.age);

        fullname.move();

        name.talk();

    }
}