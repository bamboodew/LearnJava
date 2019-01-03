package chap02_character_class;

public class Test {
	char c = 'A'; // 字符：只有1个字节（8位）
	char c1;
	int i;

	public static void main(String[] args) {
		Test test = new Test();

		char ch = 'a';
		char uniChar = '\u039A'; // Unicode字符表示
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(ch);
		System.out.println(uniChar);
		System.out.println(charArray);
		// System.out.println(c1);
		// Cannot make a static reference(引用) to the non-static field(字段) c1
		// 静态main方法不能调用类的非静态字段
		System.out.println(test.c);

		Character c2 = new Character('C');
		System.out.println(c2);
		System.out.println(Character.isLetter(c2));
		System.out.println(Character.isDigit(c2));
		System.out.println(Character.isWhitespace(c2));
		char c3 = ' ';
		System.out.println(Character.isWhitespace(c3));

		System.out.println("全局变量整型默认:" + test.i); // 全局变量整型默认为0，局部变量无默认值

		System.out.println("全局变量字符型默认:" + test.c1); // 全局变量字符型默认为空格
	}
}
