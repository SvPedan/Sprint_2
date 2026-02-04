package service;

import model.Food;

/**
 * Добавь в него поле — массив элементов из объектов типа Food.
 * Понадобится конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины.
 * В классе ShoppingCart реализуй методы для работы с корзиной:
 * - получить общую сумму товаров в корзине без скидки,
 * - получить общую сумму товаров в корзине со скидкой,
 * - получить общую сумму всех вегетарианских продуктов в корзине без скидки.
 */
public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.totalPrice();
        }
        return total;
    }

    public double discountPrice() {
        double total = 0;
        for (Food item : items) {
            total += item.discountedPrice();
        }
        return total;
    }

    public double vegPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian())
                total += item.totalPrice();
        }
        return total;
    }
}
