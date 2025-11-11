import java.time.LocalDate;

public interface Shipping {
    public double Get_Cost(Order o);
    public LocalDate Get_Date(Order o);
}
