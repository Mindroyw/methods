import java.time.LocalDate;

public class Main {

    public static String codeSeparator(){
        System.out.println("------------------");
        return null;
    }

    public static int leapYear() {
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 4 == 0) {
            System.out.println(currentYear + " високосный год");
        } else {
            System.out.println(currentYear + " невисокосный год");
        }
        return currentYear;
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String appInstall() {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        if (clientOS == 0){
           osName = "IOS";
        } else {
           osName = "Android";
        }
        return osName;
    }

    public static int lightVersion(){
        int currentYear = LocalDate.now().getYear();
        int osYear = 2014;
        if (currentYear > osYear){
            System.out.println("Рекомендуем установить облегченную версию приложения.");
        }
        return currentYear;
    }

    public static int deliveryDays(){
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
        leapYear(); //задание 1
        codeSeparator();
        System.out.println("Установите версию приложения для: " + appInstall());
        lightVersion();
        codeSeparator();
        System.out.println("Срок доставки: "+ deliveryDays() + " дня"); //задание 3
        codeSeparator();
        }

    }
