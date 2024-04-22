// Stuart Reges
// 1/19/00
//
package Project;
import java.util.*;

public class ShoppingCart {

    public static final double DISCOUNT_PERCENT = 0.9;

    private ArrayList<ItemOrder> itemOrders;

    private boolean discount;

    public ShoppingCart()
    {
        itemOrders = new ArrayList<>();
        discount = false;
    }

    public void add(ItemOrder next)
    {
        for (int i = 0; i < itemOrders.size(); i++)
        {
            if (itemOrders.get(i).getItem().equals(next.getItem()))
            {
                itemOrders.set(i , next);
                return;
            }
        }
        itemOrders.add(next);

    }

    public void setDiscount(boolean discount)
    {
        this.discount = discount;

    }

    public double getTotal()
    {
        double total = 0;

        for (ItemOrder itemOrder : itemOrders)
        {
            total += itemOrder.getPrice();
        }

        if (discount) {
            total *= DISCOUNT_PERCENT;
        }

        return total;


    }
}
