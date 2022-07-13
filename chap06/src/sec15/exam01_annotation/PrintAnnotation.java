package sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // Annotation 적용 대상을 지정할 때 사용하는 @Target Annotation
@Retention(RetentionPolicy.RUNTIME) // 사용 용도에 따라 Annotation을 어느 범위까지 유지할 것인지 지정하는 @Retention Annotation

// Annotation은 Element를 멤버로 가짐
// Element는 타입과 이름으로 구성되며, 디폴트 값을 가질 수 있다
// 타입으로는 int, double, String, 열거, Class, 배열타입 사용 가능
// 이름 뒤에는 메서드를 작성하는 것처럼 ()를 붙여야 함

public @interface PrintAnnotation { // @ 뒤에 오는 것이 Annotation임
	String value() default "-"; // String 타입 Element
	int number() default 15; // int 타입 Element
}