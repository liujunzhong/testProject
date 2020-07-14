package com.ncu.testSyntax.annotation;

public @interface AnnotationDemo {
    String attr1();
    String attr2() default "attr2 value";
    String value();
    String[] attr3();

}
@interface  AnnotationDemo2{
    String value();
}
@interface AnnotationDemo3{
    String att();
}
