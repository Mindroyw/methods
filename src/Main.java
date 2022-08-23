import java.time.LocalDate;

public class Main {

    public static String codeSeparator(){
        System.out.println("------------------");
        return null;
    }

    public static void printLeapYear() {
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " високосный год");
        } else {
            System.out.println(currentYear + " невисокосный год");
        }
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void appInstall() {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        if (clientOS == 0){
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
        int currentYear = LocalDate.now().getYear();
        int osYear = 2014;
        if (currentYear > osYear){
            System.out.println("Рекомендуем установить облегченную версию приложения.");
        }
    }

    public static int calculateDeliveryDays(){
        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        }else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = 2;
        }else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days = 3;
        }
        return days;
    }

    public static void main(String[] args) {
        codeSeparator();
        printLeapYear(); //задание 1
        codeSeparator();
        System.out.println("Установите версию приложения для: "); //задание 2
        appInstall();
        codeSeparator();
        System.out.println("Срок доставки: "+ calculateDeliveryDays() + " дня"); //задание 3
        codeSeparator();
        }

    }
