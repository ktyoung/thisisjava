package sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // Annotation ���� ����� ������ �� ����ϴ� @Target Annotation
@Retention(RetentionPolicy.RUNTIME) // ��� �뵵�� ���� Annotation�� ��� �������� ������ ������ �����ϴ� @Retention Annotation

// Annotation�� Element�� ����� ����
// Element�� Ÿ�԰� �̸����� �����Ǹ�, ����Ʈ ���� ���� �� �ִ�
// Ÿ�����δ� int, double, String, ����, Class, �迭Ÿ�� ��� ����
// �̸� �ڿ��� �޼��带 �ۼ��ϴ� ��ó�� ()�� �ٿ��� ��

public @interface PrintAnnotation { // @ �ڿ� ���� ���� Annotation��
	String value() default "-"; // String Ÿ�� Element
	int number() default 15; // int Ÿ�� Element
}