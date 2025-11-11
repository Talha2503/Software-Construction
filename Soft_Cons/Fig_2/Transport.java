public class Transport {
    private Engine engine;
    private Driver driver;
    public Transport(Driver driver){
        this.driver=driver;
       engine= new Combustion_Eng();
    }
    public void Deliver( String destination , String Cargo){
        engine.move();
        System.out.println("Towards "+ destination+" carrying "+ Cargo);
        driver.navigate();
    }
}
