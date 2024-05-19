package animals;

public class Main {
    public static void main(String[] args) {
        Animal first_animal = new Animal("Кошка");
        Animal second_animal = new Animal("Кот");
        Animal third_animal = new Animal("Собака");
        Animal fourth_animal = new Animal("Собака");
        Cat first_cat = new Cat("Кошка", "Машка", false);
        Cat second_cat = new Cat("Кот", "Барсик", false);
        Dog first_dog = new Dog("Собака", "Палкан");
        Dog second_dog = new Dog("Собака", "Рэкс");

        System.out.println("Количество котов и кошек: "+ Cat.getCount() );
        System.out.println("Количество собак: "+ Dog.getCount());
        System.out.println("Количество животных: "+ Animal.getCount());

        first_cat.run(150);
        first_cat.swim(10);
        second_cat.swim(0);
        first_dog.run(450);
        second_dog.swim(1);

        Cat[] eating_cat = new Cat[2];
        eating_cat[0] = new Cat("Кот", "Пушистик", false);
        eating_cat[1] = new Cat("Кошка", "Маркиза", false);
        int plate = 1;
        for (Cat cat : eating_cat) {
    
            if ( plate >= 1) {
                cat.well_fed = true;
                plate -= 1;
                System.out.println("Кот " + cat.cat_name + " покушал: " + cat.well_fed);
            }

        }
        System.out.println(Cat.addFoodAtPlate(plate, 10));

    }
}
