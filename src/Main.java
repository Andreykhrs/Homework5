public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS=0; // (0 — iOS, 1 — Android)
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
            else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
            else {
            System.out.println("Введите цифру 0, если у вас iOS. Если у вас Android, введите цифру 1.");
        }
        System.out.println();
        System.out.println("Задача №2");
        int clientDeviceYear = 2010; // Переменная clientOS уже добавлена выше, в предыдущей задаче.
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientOS != 1 && clientOS!=0) {
            System.out.println("Введите год выпуска вашего телефона и цифру 0, если у вас iOS. Если у вас Android, введите цифру 1.");
        }
        System.out.println();
        System.out.println("Задача №3");
        int year = 1900;
        int everyFourYears = year % 4;
        int  everyHundredthYear = year % 100;
        int everyFourHundredthYear = year% 400;
        if (year>1584 && everyHundredthYear != 0 && everyFourYears ==0 || everyFourHundredthYear ==0 ) {
            System.out.println(year + " год является Високосным");
        } else {
            System.out.println(year + " год не является Високосным");
        }
        System.out.println();
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 100) {
            System.out.println("Нет доставки.");
            return;
        }
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
        deliveryDay++;
        }
            System.out.println("Потребуется дней: "+ deliveryDay);


        System.out.println();
        System.out.println("Задача №5");
        int monthNumber=12;
        switch (monthNumber) {
            case 1:
            case 2 :
            case 12:
                System.out.println("Это зимнмй месяц.");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц.");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Нет такого месяца.");
        }





        }
    }
