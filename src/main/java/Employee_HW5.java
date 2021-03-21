public class Employee_HW5 {
    String name, surname, email;
    int phone, salary, age;

    //ФИО, должность, email, телефон, зарплата, возраст.
    Employee_HW5(String name, String surname, String email, int phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public static void main(String[] args) {

        Employee_HW5[] empArray = new Employee_HW5[5];
        empArray[0] = new Employee_HW5("Peter", "Petrov", "peter@mailbox.com", 892312310, 30000, 30);
        empArray[1] = new Employee_HW5("Irina", "Irinova", "irina@mailbox.com", 892312311, 35000, 25);
        empArray[2] = new Employee_HW5("Sidor", "Sidorov", "sidor@mailbox.com", 892312312, 35000, 43);
        empArray[3] = new Employee_HW5("Olga", "Drevlyanova", "olga@mailbox.com", 892312313, 35000, 68);
        empArray[4] = new Employee_HW5("Vasiliy", "Vaskin", "vasya@mailbox.com", 892312314, 35000, 38);


        Employee_HW5 petrovich = new Employee_HW5("Ivan", "Ivanov", "ivanov@ivan.ru", 555555555, 1000, 50);


        petrovich.getInfo(petrovich);
        System.out.println(petrovich.getAge(petrovich));

        for (int i = 0; i < empArray.length; i++){
            empArray[i].search40(empArray);
        }






    }


    public void getInfo(Employee_HW5 employee_HW5) {
        System.out.println(name + " " + surname + " " + email + " " + phone + " " + salary + " " + age);
    }

    public int getAge(Employee_HW5 employee_HW5) {
        return age;
    }

    public void search40(Employee_HW5[] empArray) {

        for (int i = 0; i < 1; i++) {
            if (getAge(empArray[i]) >= 40) {
                getInfo(empArray[i]);
            }

        }
    }
}





