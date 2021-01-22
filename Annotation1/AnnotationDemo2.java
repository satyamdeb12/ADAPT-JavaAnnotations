package Annotation1;


import jdk.jfr.Percentage;

import java.lang.annotation.*;

//Annotations without any variables are called Marker Annotations
//Annotations with one variable is called Single Value Annotation
//Annotations with multiple variables are called Single Value Annotation
//Target and Retention are called as meta annotations

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String os() default "Symbian";
    int version() default 1;
}


//Specifying the values will override the existing values
@SmartPhone(os = "Android", version = 6)
class NokiaASeries{
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

public class AnnotationDemo2 {
    public static void main(String[] args) {
        NokiaASeries obj = new NokiaASeries("Fire", 5);
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.version());
    }
}
