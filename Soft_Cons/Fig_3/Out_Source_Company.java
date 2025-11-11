public class Out_Source_Company extends Company {

    @Override
    public Employee[] get_Employees() {
        
        return new Employee[]{
            new Programmer(),
            new Tester()
        };
        }
    
}
