package test06;

import java.util.regex.Pattern;

public class PatternMatcherExample {
 
    public static void main(String[] args) {
        String id = "5Angel1004";
        // [] : 문서의 집합 범위, {} : 횟수 또는 범위
        // []
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";	// → 앞 한 글자를 뺀 두 번
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없다.");
        }
    }
}