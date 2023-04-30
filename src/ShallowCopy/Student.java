package ShallowCopy;

public class Student implements Cloneable {
    private String name;
    private int age;
    private Major major;

    public Student(String name,int age,Major m){
        this.name=name;
        this.age=age;
        this.major=m;
    }

    public void change(String name){
        this.major.mc(name);
    }

    public void out(){
        System.out.println(this.name+" "+this.age+" "+major.information());
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
