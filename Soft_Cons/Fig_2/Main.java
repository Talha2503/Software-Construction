public class Main {
    public static void main(String[] args) {
        Driver D1 = new Human();
        Transport T1 = new Transport(D1);

        T1.Deliver("KHI", "PC");
    }
}
