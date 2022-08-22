import java.time.LocalDate;

public class Main {

    public static int leapYear() {
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 79 == 0) {
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

    public static int appInstall() {
        String osName = "iOS";
        int currentYear = LocalDate.now().getYear();
        int clientOS = getClientOS(osName);
        int osYear = 2014;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS");
            if (currentYear > osYear) {
                System.out.println("Для корректной работы рекомендуем установить облегченную версию приложения.");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android");
                if (currentYear > osYear){
                    System.out.println("Для корректной работы рекомендуем установить облегченную версию приложения.");
                }
            }
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
        leapYear(); //задание 1

        appInstall(); //задание 2

        System.out.println("Срок доставки: "+ deliveryDays() + " дня"); //задание 3
        }

    }
