public class Main {
    public static void main(String[] args) {
        Employee[] employeearray = new Employee[5];
        employeearray[0] = new Employee("Петров Иван Сергеевич", "Директор", "ivandir.petrov@mail.ru", "+375293939317","9000 руб.", "49 лет");
        employeearray[1] = new Employee("Иванова Раиса Алексеевна", "Главный бухгалтер", "rusia73@mail.ru", "+3752253535355","5500 руб.", "51 лет");
        employeearray[2] = new Employee("Сидоров Сергей Егорович", "Начальник отдела кадров", "sidorov1976@gmail.com", "+375337894512","4800 руб.", "48 лет");
        employeearray[3] = new Employee("Цветкова Анна Сергеевна", "Секретарь", "anutik04@gmail.com", "+375291234556","2500 руб.", "20 лет");
        employeearray[4] = new Employee("Зыль Марина Николаевна", "Уборщица", "marina.zyl@mail.ru", "+375254478989","1200 руб.", "62 года");
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

