

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.time.ZoneId.SHORT_IDS;

public class Bank {

    public ZonedDateTime time;
    public String zoneOfTransaction;
    public String initialsName;
    public String initialsLastName;
    public double cash;

    public void enterRegion() {
        time = ZonedDateTime.now(ZoneId.of(SHORT_IDS.get(this.zoneOfTransaction)));

    }


    public void transaction() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите свой регион");
            zoneOfTransaction = scanner.next();

            enterRegion();
        } catch (Exception e) {
            System.out.println("Вы ввели неккоректный формат часового пояса");

            transaction();
        }
    }

    public void enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя");

        String name = scanner.nextLine();
        initialsName = String.valueOf(name.charAt(0)).toUpperCase();

        System.out.println("Введите Фамилию");

        String lastName = scanner.nextLine();
        initialsLastName = String.valueOf(lastName.charAt(0)).toUpperCase();

    }


    public void enterCash() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Внесите деньги");
            cash = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Вы ввели неккоректное значение");
            enterCash();
        }

    }

    public void showAll(){
        transaction();
        enterName();
        enterCash();

        System.out.println(time);
        System.out.println(initialsName + "." + " " + initialsLastName + ".");
        System.out.println(cash + "руб.");
    }
}
