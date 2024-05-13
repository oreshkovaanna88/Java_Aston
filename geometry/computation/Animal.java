package Geomerty;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int distance) {
    }

    public void swim(int distance) {
    }

    //Находим количество отдельных животных
    public static int getCountCertainAnimals(Animal[] animals) {
        int countAnimals = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                countAnimals++;
            }
        }
        return countAnimals;
    }

    //Находим общее количество животных
    public static int getCountAllAnimals(int... countAnimal) {
        int countAllAnimals = 0;
        for (int i : countAnimal) {
            countAllAnimals += i;
        }
        return countAllAnimals;
    }
}
