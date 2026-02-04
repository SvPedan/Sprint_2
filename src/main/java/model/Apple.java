package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

/* Наследник класса Food.
 * Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
 * Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает
 * флаг isVegetarian.
 * Для красных яблок (colour равно "red") скидка должна быть равна 60%:
 * соответствующий метод возвращает значение 60.
 */
public class Apple extends Food implements Discountable {

    String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);

        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(colour, Colour.RED)) {
            return Discount.RED;
        } else {
            return super.getDiscount();
        }
    }
}
