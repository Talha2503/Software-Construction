public class Game_Dev_Company extends Company {
 

    @Override
    public Employee[] get_Employees() {
        // TODO Auto-generated method stub
        return new Employee[]{
            new Designer(),
            new Artist()
        };
            
      }
}
