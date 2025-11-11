import java.time.LocalDate;

public class Ground implements Shipping {

    @Override
    public double Get_Cost(Order o) {
        if(o.Get_Total()>100){
            return 0;
        }
        return Math.max(10, o.Get_Weight()*1.5);

    }

    @Override
    public LocalDate Get_Date(Order o) {
        return LocalDate.now().plusDays(5);
    }
    
}
