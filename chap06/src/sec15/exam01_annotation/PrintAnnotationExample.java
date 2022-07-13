package sec15.exam01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// Service Ŭ�����κ��� �޼��� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods(); // Service Ŭ������ ����� �޼��� ���(���÷���)
		
		// Method ��ü�� �ϳ��� ó��
		for(Method method : declaredMethods) {
			// PrintAnnotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// �޼��� �̸� ���
				System.out.println("[" + method.getName() + "]");
				// ���м� ���
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					// �޼��� ȣ��
					method.invoke(new Service()); // Service ��ü�� ����, ������ Service ��ü�� �޼��� ȣ��
				} catch (Exception e) {}
					System.out.println();
			}
		}

	}

}
