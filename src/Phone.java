import java.util.Scanner;

public class Phone
{
    String name = "Maxim";
    public long Number;     //1

    public long getNumber() {
        return Number;
    }

    public void setNumber(long number) {
        Scanner num = new Scanner(System.in);
         number = num.nextLong();
        this.Number = number;
        
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        Scanner str = new Scanner(System.in);
        model = str.nextLine();
        this.model = model;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        Scanner num = new Scanner(System.in);
        weight = num.nextLong();
        this.weight = weight;
    }

    public String model;    //1

    public long weight;     //1

    public void receiveCall() {     //4

        System.out.println("Звонит " + name);

    }

    public void receiveCall(String name, long num) {    //9

        System.out.println("Звонит " + name + "\n" + num);

    }
    public void sendMessage(long num1, long num3) {     //10

        System.out.println(num1 + "\n" + num3);

    }

    public Phone(long a, String b, long c) {    //5 и 2

        Number = a;

        model = b;

        weight = c;

        Phone ph = new Phone(1, "model");     //8

    }

    public Phone(long a, String b) {    //6 и 2

        Number = a;

        model = b;

    }

    public Phone() {}   //7

}


