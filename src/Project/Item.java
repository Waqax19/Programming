package Project;
import java.text.*;
import java.util.Objects;

public class Item {
    // You will need to add more instance variables
    private String name;

    private double price;

    private double bulkPrice;

    private int bulkQuantity;

    private NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public Item(String name, double price)
    {
        if(price < 0)
            throw new IllegalArgumentException("price must be positive");

        this.name = name;
        this.price = price;
        this.bulkQuantity = 0;
        this.bulkPrice = 0;

    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice)
    {
        // this(/*WHAT SHOULD YOU PUT HERE?*/);
        if (price < 0 || bulkQuantity  < 0 || bulkPrice < 0)
        {
            throw new IllegalArgumentException("price , bulkQuantity  and bulkPrice cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.bulkPrice = bulkPrice;
        this.bulkQuantity = bulkQuantity;

    }

    public double priceFor(int quantity) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code

        if(quantity < 0)
        {
            throw new IllegalArgumentException("quantity must be positive");
        }

        if(bulkQuantity > 0 && quantity >= bulkQuantity)
        {
            int regularItems = quantity % bulkQuantity;
            int bulkItems = quantity / bulkQuantity;

            return (bulkItems * bulkPrice) + (regularItems *  price);
        }
        return quantity * price;
    }

    public String toString()
    {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code

        if(bulkQuantity > 0)
        {
            return String.format(name + " , " + formatter.format(price) + " ( " + bulkQuantity + " for " + formatter.format(bulkPrice) + ")");
        }

        return name + " , " + formatter.format(price);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        return Double.compare(item.price, price) == 0 &&
                Double.compare(item.bulkPrice, bulkPrice) == 0 &&
                bulkQuantity == item.bulkQuantity &&
                Objects.equals(name, item.name) &&
                Objects.equals(formatter, item.formatter);
    }


}
