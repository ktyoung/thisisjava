package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "½Å¹ÎÃ¶";
		String strVar2 = "½Å¹ÎÃ¶";
		String strVar3 = new String("½Å¹ÎÃ¶"); // ¹®ÀÚ¿­ÀÌ ¾Æ´Ñ °´Ã¼·Î ÀÎ½ÄÇÔ
		
		System.out.println(strVar1 == strVar2); // (¹®ÀÚ¿­)½Å¹ÎÃ¶ == (¹®ÀÚ¿­)½Å¹ÎÃ¶
		System.out.println(strVar1 == strVar3); // (¹®ÀÚ¿­)½Å¹ÎÃ¶ != (°´   Ã¼)½Å¹ÎÃ¶
		System.out.println();
		
		// equals´Â ÇüÅÂ°¡ °°ÀºÁö ÆÄ¾ÇÇÔ (º¯¼ö Å¸ÀÔ°ú »ó°ü¾øÀ½)
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); 

	}

}
