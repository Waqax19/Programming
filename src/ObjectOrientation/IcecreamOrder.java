package ObjectOrientation;

public class IcecreamOrder
{
    public void orderIceCream(String flavor , String toppings , boolean isAlergic)
    {
        if(isAlergic)
        {
            System.out.println("Ordering : " + flavor + " ice cream for someone with " + toppings);
        }

        else
        {
            System.out.println("Ordering : " + flavor + " ice cream with" + toppings);
        }

    }

    public void orderIceCream(String flavor , String toppings , String coneType)
    {
        System.out.println("Ordering : " + flavor + " ice cream in : " + coneType + " cone with : " + toppings + " toppings.");

    }

    public void orderIceCream(String flavor , String toppings )
    {
        System.out.println("Ordering : " + flavor + " ice cream in : " + toppings + " toppings.");

    }

    public void addSyrup(String syrupType)
    {
        System.out.println("Adding : " + syrupType + " syrup.");
    }
    
    public void addToppings(String toppingType)
    {
        System.out.println("Adding : " + toppingType + " topping..");
    }

    public static void main(String[] args)
    {
        IcecreamOrder order = new IcecreamOrder();

        order.orderIceCream("Vanilla" , "Chocolate chips..");

        order.addSyrup("Chocolate");

        order.addToppings("Cream..");

        order.orderIceCream("Mango" , "Sprinkles" , "Waffle");

        order.addSyrup("Mango");

        order.addToppings("Chopped nuts..");

        order.orderIceCream("Chocolate" , "Caramel" , true);
    }
}
