package chap02_character_class;

/*
 * 
 * @author 490712
 * unicode_整型_字符_字符串
 *
 */

public class Test3 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'B';
		// 字符拼接之前先转换成String类， 否则直接相加的结果是unicode值相加
		System.out.println(Character.toString(c1) + Character.toString(c2));
		// output:aB
		System.out.println(c1 + c2); // output:163
		System.out.println(c1 + 0); // output:97; char转unicode的方法之一
		System.out.println(c1 + '0'); // output:145
		System.out.println(c1 + "0"); // output:a0

		System.out.println(); // 空行
		System.out.println(0); // output:0
		System.out.println('0'); // output:0
		System.out.println("0"); // output:0
		System.out.println(0 + 0); // output:0
		System.out.println(0 + '0'); // output:48
		System.out.println(0 + "0"); // output:00
		System.out.println('0' + '0'); // output:96
		System.out.println('0' + "0"); // output:00
		System.out.println("0" + "0"); // output:00

		System.out.println();
		System.out.println(0 == '0'); // output:false
		System.out.println(48 == '0'); // output:true
		System.out.println(Character.toString('0') == Character.toString('0'));
		// output:false; String的地址不同
		System.out.println(Character.toString('0').equals(Character.toString('0')));
		// output:true; String的值相同

		String s1 = "123";
		String s2 = "123";
		System.out.println(s1 == s2);
		// output:true; String的地址相同
	}
}
