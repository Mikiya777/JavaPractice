import DeepCopy.DMajor;
import DeepCopy.DStudent;
import ShallowCopy.Major;
import ShallowCopy.Student;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Main one=new Main();
        one.deep();
    }
    public void shallow() throws CloneNotSupportedException {
        Major m1=new Major("我是帅比","10016");
        Student s1=new Student("mike",18,m1);

        System.out.println("对象创建完毕，进行浅拷贝");
        Student student2=(Student) s1.clone();
        System.out.println(s1==student2);
        System.out.println(s1);
        System.out.println(student2);

        s1.change("我是丑逼");
        s1.out();
        student2.out();
    }
    public void deep() throws CloneNotSupportedException{
        DMajor m1=new DMajor("我是帅比","10016");
        DStudent s1=new DStudent("mike",18,m1);

        System.out.println("对象创建完毕，进行深拷贝");
        DStudent dstudent2=(DStudent) s1.clone();
        System.out.println(s1==dstudent2);
        System.out.println(s1);
        System.out.println(dstudent2);

        s1.change("我是丑逼");
        s1.out();
        dstudent2.out();
    }
}