public class Drop_Box implements Cloud_Storage_Provider{
    public void Store_File(String name){
        System.out.println("File Named "+name+" is stored");
    }
        public void Get_File(String name){
        System.out.println("File Named "+name+" is fetched");

    }
}