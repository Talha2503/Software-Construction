public class Main{
    public static void main(String args[]){
        Amazon A1 = new Amazon();
        A1.Create_Server("Pakistan");
        A1.List_Server("Pakistan");
        A1.Get_CDN_Address();
        A1.Store_File("Robot.txt");
        A1.Get_File("Robot.txt");
        
        Drop_Box D1 = new Drop_Box();
        D1.Store_File("Robot.txt");
        D1.Get_File("Robot.txt");
    }
}