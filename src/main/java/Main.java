import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

/**
 * Инициализируй данные. Для этого создай объекты:
 * - Мясо в количестве 5 кг по цене 100 рублей за кг;
 * - Яблоки красные в количестве 10 кг по цене 50 рублей;
 * - Яблоки зелёные в количестве 8 кг по цене 60 рублей.
 * Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
 * Посчитай и выведи на экран значения для созданной корзины:
 * - общую сумму товаров без скидки,
 * - общую сумму товаров со скидкой,
 * - сумму всех вегетарианских продуктов без скидки.
 * Все переменные класса должны быть недоступны извне, если не указано иное.
 * Доступ к ним реализуй через известные тебе методы: создавай только те,
 * которые действительно нужны для реализации описанной функциональности.
 */
public class Main {
    public static void main(String[] args) {
        var meat = new Meat(5, 100);
        var appleRed = new Apple(10, 50, Colour.RED);
        var appleGreen = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, appleRed, appleGreen};
        var cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.totalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + cart.discountPrice());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.vegPrice());

    }
}
