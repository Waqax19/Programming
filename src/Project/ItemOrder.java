package Project;

public class ItemOrder
{
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;

    }


    public double getPrice() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return item.priceFor(quantity);
    }

    public Item getItem() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return item;
    }
}
