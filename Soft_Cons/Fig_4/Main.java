public class Main {
    public static void main(String[] args) {
        Order O_1 = new Order();
        O_1.Add_Item(new Line_Items("Headphone", 25.0, 0.50));
        O_1.Add_Item(new Line_Items("Charger", 125, 0.2));
        O_1.Add_Item(new Line_Items("Laptop", 1200, 2.0));
        O_1.Set_Shipping_Type(new Air());
        System.out.println("The total COst of the order is : " + O_1.Get_Total());
        System.out.println("The Total weight of the order is : "+ O_1.Get_Weight());
        System.out.println("The shipping Cost of the Order is :"+ O_1.Get_Shipping_Cost());
        System.out.println("Shipping Date : "+ O_1.Get_Shipping_Date());
    }
}
