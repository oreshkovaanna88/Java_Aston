public class Main {
    public static void main(String[] args) {
        Employee[] employeearray = new Employee[5];
        employeearray[0] = new Employee("Семенов Иван Петрович", "Менеджер по продажам", "semenov.ivan@mail.ru", "+375448785785","2000 руб.", "35 лет");
        employeearray[1] = new Employee("Полежайкин Иосиф Ильич", "Главный бухгалтер", "polezh@mail.ru", "+375292334345","4500 руб.", "50 лет");
        employeearray[2] = new Employee("Ландыш Далья Григорьевна", "Начальник отдела продаж", "darya9190@gmail.com", "+375331290789","3800 руб.", "48 лет");
        employeearray[3] = new Employee("Автухович Кристина Петровна", "Юристконсульт", "avtush.kristina0102@gmail.com", "+375448879897","2000 руб.", "40 лет");
        employeearray[4] = new Employee("Маськова Ирина Ивановна", "Заместитель директора", "irina.ivan@mail.ru", "+375253434344","4275 руб.", "42 года");
        for (int i = 0; i < 5; i++) {
            System.out.println(employeearray[i].getFIO());
            System.out.println(employeearray[i].getPosition());
            System.out.println(employeearray[i].getEmail());
            System.out.println(employeearray[i].getPhoneNumber());
            System.out.println(employeearray[i].getSalary());
            System.out.println(employeearray[i].getAge());
        }
    }
}

public class Employee {

            private String FIO;
            private String position;
            private String email;
            private String phoneNumber;
            private String salary;
            private String age;

            public Employee(String FIO, String position, String email, String phoneNumber, String salary, String age) {
                this.FIO = FIO;
                this.position = position;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
            }

            public String getFIO() {
                return FIO;
            }
            public String getPosition() {
                return position;
            }
            public String getEmail() {
                return email;
            }
            public String getPhoneNumber() {
                return phoneNumber;
            }
            public String getSalary() {
                return salary;
            }
            public String getAge() {
                return age;
            }
}

