package ShallowCopy;

public class Major {
    private String majorName;
    private String majorId;
    public Major(String name, String id){
        majorName=name;
        majorId=id;
    }
    public String information(){
        return majorName+" "+majorId;
    }
    public void mc(String name){
        this.majorName = name;
    }
}
