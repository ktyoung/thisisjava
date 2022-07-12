package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.A;
import sec13.exam01_class_access.package1.B;

public class C {
	A a; // 다른 패키지에 있으므로 import해야만 클래스에 접근 가능
	B b;
}