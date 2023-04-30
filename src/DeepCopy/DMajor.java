package DeepCopy;

public class DMajor implements Cloneable{
    private String majorName;
    private String majorId;
    public DMajor(String name, String id){
        majorName=name;
        majorId=id;
    }
    public String information(){
        return majorName+" "+majorId;
    }
    public void mc(String name){
        this.majorName=name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
