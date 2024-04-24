import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    { System.out.print("Введите номер задания: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        switch (task) {
            case 1:
                printThreeWords(); break;
            case 2:
                checkSumSign(); break;
            case 3:
                printColor(); break;
            case 4:
                compareNumbers(); break;
            case 5:
                getSumNumbers(); break;
            case 6:
                giveTypeOfNumber(); break;
            case 7:
                giveNumberType(); break;
            case 8:
                giveNumberOfLines(); break;
            case 9:
                getTypeOfYear(); break;
            case 10:
                ChangeElements(); break;
            case 11:
                FillElements(); break;
            case 12:
                MultiplyElements(); break;
            case 13:
                fillDiagonalElements(); break;
            case 14:
                fillArrayLength(); break;
        }
    }
// задание 1
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int a = 0, b = 5, sum =0 ;
        sum = a+b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");}
        else {System.out.println("Сумма отрицательная");}
    }
    private static void  printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");}
        if (value >0 && value <=100 ) {
            System.out.println("Желтый");}
        else {System.out.println("Зеленый");}
    }
    private static void  compareNumbers() {
        int a = 50, b=20;
        if (a >= b) {
            System.out.println("a >= b");}
        else {System.out.println("a < b");}
    }
    private static void  getSumNumbers() {
        System.out.print("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        Scanner in1 = new Scanner(System.in);
        int second = in1.nextInt();
        int sum = first +second;
        if (sum >= 10 && sum <=20) {
            System.out.println("true");}
        else {System.out.println("false");}
    }
    private static void  giveTypeOfNumber() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >= 0) {
            System.out.println("Число положительное");}
        else {System.out.println("Число отрицательное");}
    }
    private static void  giveNumberType() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number < 0) {
            System.out.println("true");}
        else {System.out.println("false");}
    }
    private static void  giveNumberOfLines() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.print("Введите количество строк: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }
    private static void  getTypeOfYear() {
        System.out.print("Введите год: ");
        Scanner in = new Scanner(System.in);
        int numberofyear = in.nextInt();
        if (numberofyear < 0) {
            System.out.println("Неверное значение");}
        if (( numberofyear %400==0)||(numberofyear > 0 && numberofyear %4==0 && numberofyear %100!=0)) {
            System.out.println("true");}
        else {System.out.println("false");}
    }
    private static void  ChangeElements() {
        int[] numbers = { 1 , 0, 0, 0, 1 , 1 , 0, 0, 0};
        for (int i = 0; i < 9; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            }
            else numbers[i] = 1;
            System.out.print(numbers[i] + " ");
        }
    }
    private static void  FillElements() {
        int[] numbers = new int[100];
        for (int i = 0; i <100; i++) {
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }
    }
    private static void  MultiplyElements() {
        int[] numbers = { 5 ,50, 78, 10, 23 , 4 , 66, 3, 6};
        for (int i = 0; i < 9; i++) {
            if (numbers[i] <6 ) {
                numbers[i] = numbers[i] * 2;
            }
            System.out.print(numbers[i] + " ");
        }
    }
    private static void  fillDiagonalElements() {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [][] array = new int [number][number];
        for (int i = 0; i < number; i++) {
            array[i][number - i - 1] = 1;
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void  fillArrayLength() {
        System.out.print("Длина массива: ");
        int len, arr[];
        Scanner in = new Scanner(System.in);
        len = in.nextInt();
        arr = new int[len];
        System.out.print("Введите значение массива: ");
        Scanner scanner = new Scanner(System.in);
        int initialValue = scanner.nextInt();
        for(int i = 0; i < len; i++){
            System.out.print(initialValue + " ");

        }
    }

}
