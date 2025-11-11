import java.time.LocalDate;

public class Air implements Shipping {

    @Override
    public double Get_Cost(Order o) {
          
        return  o.Get_Weight()*2.5;

    }

    @Override
    public LocalDate Get_Date(Order o) {
        // TODO Auto-generated method stub
        return LocalDate.now().plusDays(2);
    }
    
}
