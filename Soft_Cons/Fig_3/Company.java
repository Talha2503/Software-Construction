public abstract class Company {
    public abstract Employee[] get_Employees();
    public void Create_Software(){
        Employee[] employees = get_Employees();
        for (Employee employee : employees) {
            employee.Do_Work();
        }
    }
}
