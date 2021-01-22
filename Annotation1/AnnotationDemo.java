package Annotation1;

//Means only one function in the interface
@FunctionalInterface
interface Abc{
    void show();
}
class A{
    public void showData(){
        System.out.println("In A");
    }
}
class B extends A{

    @Deprecated
    //Means dont use it
    public void show(){

    }

    @Override
    //Means it is overridden and
    //will generate error if names dont match
    public void showData(){
        System.out.println("In B");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showData();
        obj.show();
    }
}
