public class Main {

    public static void main(String[] args) {
        long number = 0;
        String str = "";
        Phone ph1 = new Phone();

        Phone ph2 = new Phone();

        Phone ph3 = new Phone();

        Phone ph = new Phone();

        System.out.print("Введите номер 1-го телефона: ");

        ph1.setNumber(number);

        System.out.print("Введите модель: ");

        ph1.setModel(str);

        System.out.print("Вес: ");

        ph1.setWeight(number);

        System.out.print("Введите номер 2-го телефона: ");

        ph2.setNumber(number);

        System.out.print("Введите модель: ");

        ph2.setModel(str);

        System.out.print("Вес: ");

        ph2.setWeight(number);

        System.out.print("Введите номер 3-го телефона: ");

        ph3.setNumber(number);

        System.out.print("Введите модель: ");

        ph3.setModel(str);

        System.out.print("Вес: ");

        ph3.setWeight(number);

        System.out.println(ph1.Number + "   " + ph1.model + "   " + ph1.weight);   //3

        System.out.println(ph2.Number + "   " + ph2.model + "   " + ph2.weight);   //3

        System.out.println(ph3.Number + "   " + ph3.model + "   " + ph3.weight);   //3

        System.out.println();

        ph1.receiveCall();


        System.out.println(ph1.getNumber());

        System.out.println();

        ph2.receiveCall();

        System.out.println(ph2.getNumber());

        System.out.println();

        ph3.receiveCall();

        System.out.println(ph3.getNumber());

        System.out.println();

        ph1 = new Phone(ph1.Number, ph1.model, ph1.weight);

        ph2 = new Phone(ph2.Number, ph2.model);

        ph.receiveCall(ph1.name, ph1.Number);

        ph.sendMessage(ph2.Number, ph3.Number);
    }
}