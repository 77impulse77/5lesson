

//        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//

//________________________________________________________________________________________________________


//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.


import java.util.Arrays;

public class lesson5 {
    public static void main(String[] args) {
        worker_5 worker_one = new worker_5();

        worker_one.old = 35;
        worker_one.zp = 1000;
        worker_one.t_number = 89787023711L;
        worker_one.fio = "Карташев В.С.";
        worker_one.email = "scugorshkof@gmail.com";
        worker_one.post = "QA Engineer";


        worker_5 worker_two = new worker_5();
        worker_two.old = 37;
        worker_two.zp = 2000;
        worker_two.t_number = 89787113727L;
        worker_two.fio = "Петров С.В.";
        worker_two.email = "brat2_kv@ukr.net";
        worker_two.post = "QA Engineer";
        System.out.println(" ");
        System.out.println("1___Создать класс Сотрудник с полями: ФИО, должность, email, телефон, зарплата, возраст___");
        System.out.println(worker_one.email + "  " + worker_one.t_number + "  " + worker_one.fio + "  " + worker_one.post + "  " + worker_one.zp + "  " + worker_one.old);
        System.out.println(worker_two.email + "  " + worker_two.t_number + "  " + worker_two.fio + "  " + worker_two.post + "  " + worker_two.zp + "  " + worker_two.old);

        System.out.println(" ");
        System.out.println("2___Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль___");
        worker_one.info();
        worker_two.info1();
        System.out.println(" ");
        System.out.println("4_________________________________________");

//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        worker_5[] wkr = new worker_5[5];
        fill_worker(wkr);
        for (int i = 0; i < wkr.length; i++) {
            if ( wkr[i].old > 40)
                wkr[i].info2();


        }

    }


    //        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        persArray[4] = new Person(...);
    public static void fill_worker(worker_5[] wkr) {

        wkr[0] = new worker_5("Карташев В.С.", "Директор", "олололо@mail.ru", 89787775522L, 30000, 45);
        wkr[1] = new worker_5("Куценко Г.А.", "Редактор", "олололо@mail.ru", 89787775522L, 70000, 25);
        wkr[2] = new worker_5("Балалайка Ж.Б.", "Музыкант", "олололо@mail.ru", 89787775522L, 60000, 55);
        wkr[3] = new worker_5("Поворотти И.Т.", "Певун", "олололо@mail.ru", 89787775522L, 50000, 65);
        wkr[4] = new worker_5("Барабан Б.Б.", "Директор", "олололо@mail.ru", 89787775522L, 40000, 75);


    }

}
