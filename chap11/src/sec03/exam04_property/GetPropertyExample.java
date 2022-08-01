package sec03.exam04_property;

import java.util.Properties;
import java.util.Set;

// 시스템 프로퍼티(속성값를 읽는 getProperty() 메서드
// 시스템 프로퍼티는 키(key)와 값(value)로 구성되어 있다.
public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);
		
		System.out.println("--------------------");
		System.out.println(" [ Key ] value");
		System.out.println("--------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + "] " + value);
		}

	}

}
