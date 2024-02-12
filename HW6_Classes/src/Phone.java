public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер телефона: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+375256161718", "Google Pixel 7", 0.3);
        Phone phone2 = new Phone("+375291949596", "Redmi Note 11", 0.4);
        Phone phone3 = new Phone("+375257535455", "iPhone 12 mini", 0.2);

        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вес: " + phone1.weight);

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вес: " + phone2.weight);

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вес: " + phone3.weight);

        phone1.receiveCall("Витя");
        phone2.receiveCall("Костя");
        phone3.receiveCall("Оля");

        phone1.receiveCall("Витя", phone1.getNumber());
        phone2.receiveCall("Костя", phone2.getNumber());
        phone2.receiveCall("Оля", phone3.getNumber());

        phone1.sendMessage("4444444444", "555555555");
        phone2.sendMessage("123456789", "555555555", "999999999");
        phone3.sendMessage("123456789");
    }
}
