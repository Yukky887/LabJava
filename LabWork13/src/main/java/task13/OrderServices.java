package task13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServices {

    @Autowired
    Cart cart;

    private int Price;

    public void Order() {
        Price = 0;
        System.out.println("В вашем заказе находятся следующие продукты: ");
        for (Product x : cart.Cart) {
            Price += x.price;
            System.out.println(x.title);
        }
        System.out.println("Итоговая цена " + Price);
    }

    public void FastBuy(Product pr) {
        System.out.println("Совршена покупка: " + pr.title + " за " + pr.price);
    }
}