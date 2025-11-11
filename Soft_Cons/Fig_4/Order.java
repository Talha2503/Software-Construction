import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Line_Items> line_item = new ArrayList<>();
    private Shipping shipping;
    public void Add_Item(Line_Items item){
        line_item.add(item);
    }
    public double Get_Total(){
        double total=0;
        for (Line_Items line_Items : line_item) {
           total+= line_Items.getPrice();
        }
        return total;
    }
    public double Get_Weight(){
        double total=0;
        for (Line_Items line_Items : line_item) {
           total+= line_Items.getWeight();
        }
        return total;
    }
    public void Set_Shipping_Type(Shipping shipping){
        this.shipping=shipping;
    }
    public double Get_Shipping_Cost(){
        return shipping.Get_Cost(this);
    }
    public LocalDate Get_Shipping_Date(){
        return shipping.Get_Date(this);

    }
}
