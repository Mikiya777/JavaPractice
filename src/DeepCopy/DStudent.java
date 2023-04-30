package DeepCopy;

import ShallowCopy.Major;
import ShallowCopy.Student;

public class DStudent implements Cloneable {
    private String name;
    private int age;
    private DMajor dmajor;

    public DStudent(String name,int age,DMajor m){
        this.name=name;
        this.age=age;
        this.dmajor=m;
    }

    public void change(String name){
        this.dmajor.mc(name);
    }

    public void out(){
        System.out.println(this.name+" "+this.age+" "+dmajor.information());
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        DStudent dStudent= (DStudent) super.clone();//clone one dStudent object
        dStudent.dmajor=(DMajor)dmajor.clone();//clone one DMajor of previous dStudent,so after this operate the Stack Memory have two Major Object.
        return dStudent;
    }
}
