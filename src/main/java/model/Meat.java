package model;

/* Наследник класса Food.
 * Класс Meat — для мяса. Это класс с конструктором.
 * Конструктор принимает два входных параметра — количество и цену.
 * И устанавливает для флага isVegetarian правильное значение.
 */
public class Meat extends Food implements Discountable{

    public Meat(int amount, double price) {
        super(amount, price, false);
    }
}
