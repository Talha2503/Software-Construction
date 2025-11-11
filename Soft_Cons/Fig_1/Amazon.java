public class Amazon implements Cloud_Hosting_Provider,Cloud_Storage_Provider,CDN_Provider{
     public void Create_Server(String region){
        System.out.println("Server created in region "+ region);
     }
    public void List_Server(String region){
        System.out.println("Server in region: "+ region);

    }
    public void Get_CDN_Address(){
        System.out.println("CDN Address: Not Specified");
    }
    public void Store_File(String name){
        System.out.println("File Named "+name+" is stored");
    }
    public void Get_File(String name){
        System.out.println("File Named "+name+" is fetched");

    }
}