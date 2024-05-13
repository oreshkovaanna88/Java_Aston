package Hw7;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int distance){
        if (distance <= 500 ) {
            System.out.printf("%s пробежал: %d.\n", name, distance);
        } else {
            System.out.printf("%s пробежал: %d. Необходимо еще пробежть: %d.\n", name, 500,
                    distance - 500 );
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.printf("%s проплыл: %d.\n", name, distance);
        } else {
            System.out.printf("%s проплыл: %d. Необходимо еще проплыть: %d.\n", name, 10,
                    distance - 10);
        }
    }
}
