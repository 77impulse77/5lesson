//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class worker_5 {
    String fio;
    String post;
    String email;
    long t_number;
    int zp;
    int old;

    public  worker_5 (String fio, String post, String email, long t_number, int zp, int old){
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.t_number = t_number;
        this.zp = zp;
        this.old = old;
    }
    public worker_5(){

    }

    void info() {

        System.out.println(fio + " | " + post + " | " + t_number);
    }
    void info1() {

        System.out.println(zp + " | " + old + " | " + email);
    }
    void info2() {

        System.out.println(fio + " | " + post + " | " + t_number + " | " + zp + " | " + old + " | " + email);
    }
}


//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль


