package HW_7;

import HW_7.Geometry.Circle;
import HW_7.Geometry.Rectangle;
import HW_7.Geometry.Triangle;

public class HW_7 {
    public static void main(String[] args) {
        //Задание 1
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Васька");
        cats[1] = new Cat("Маркиз");
        cats[2] = new Cat("Барсик");
       
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Бобик");
        dogs[1] = new Dog("Мираж");
        dogs[2] = new Dog("Палкан");
        
        //Сколько пробежали
        //cats[1].run(220);
        //dogs[1].run(550);

        //Сколько проплыли
        //cats[2].swim(25);
        //dogs[2].swim(15);

        //Сколько котов
        //int countCats = Animal.getCountCertainAnimals(cats);
        //System.out.println("Всего котов: " + countCats);

        //Сколько собак
        //int countDogs = Animal.getCountCertainAnimals(dogs);
        //System.out.println("Всего собак: " + countDogs);

        //Сколько общее количество животных
        //int allCountAnimals = Animal.getCountAllAnimals(countCats, countDogs);
        //System.out.println("Всего животных: " + allCountAnimals);

        //Кормежка котоов и их сытость
        //int bowlOfFood = 12;
        //bowlOfFood = Cat.feedCats(bowlOfFood, cats);
        //Cat.findOutIsCatFull(cats);
        //bowlOfFood = replenishFoodBowl(bowlOfFood, 10);
        //bowlOfFood = Cat.feedCats(bowlOfFood, cats);
        //Cat.findOutIsCatFull(cats);

        //Задание 2
        //Circle circle1 = new Circle(2.0, "Зеленый", "Черный");
        //Rectangle rectangle1 = new Rectangle(1.0, 2.0, "Оранжевый", "Синий");
        //Triangle triangle1 = new Triangle(2.0, 2.0, 3.0, "Красный", "Белый");

        //circle1.getCircleInfo();
        //rectangle1.getRectangleInfo();
        //triangle1.getTriangleInfo();
    }
    //Задание 1
    //Пополняем миску с едой
    public int replenishFoodBowl(int bowlOfFood, int amountOfFood) {
        return bowlOfFood + amountOfFood;
    }