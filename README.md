# LearnJava

## 1、main中的arges的含义
[main方法参数String[] args的使用](https://www.cnblogs.com/xy-hong/p/7197725.html)

## 2、parameters和arges的区别？
11/30/2011MASTER  LEAVE A COMMENT
在对一个函数写一个注释时，我在考虑到底该用parameter还是用argument来描述其参数呢。

根据网上一些资料，对parameter和argument的区别，做如下的简单说明。

parameter是指函数定义中参数，而argument指的是函数调用时的实际参数。
简略描述为：parameter=形参(formal parameter)， argument=实参(actual parameter)。
在不很严格的情况下，现在二者可以混用，一般用argument，而parameter则比较少用。

While defining method, variables passed in the method are called parameters.
当定义方法时，传递到方法中的变量称为参数.
While using those methods, values passed to those variables are called arguments.
当调用方法时，传给变量的值称为引数.（有时argument被翻译为“引数“）

## 3、.class和.java的区别？

## 4、indexof()的使用方法
```
private static void testIndexOf() { 
    String string = "aaa456ac";  
    //查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.  
    System.out.println(string.indexOf("b"));//indexOf(String str)；返回结果：-1，"b"不存在  
  
    //从第四个字符位置开始往后继续查找，包含当前位置  
    System.out.println(string.indexOf("a",3));//indexOf(String str, int fromIndex)；返回结果：6  
  
    //（与之前的差别：上面的参数是 String 类型，下面的参数是 int 类型）参考数据：a-97,b-98,c-99  
  
    //从头开始查找是否存在指定的字符  
    System.out.println(string.indexOf(99));//indexOf(int ch)；返回结果：7  
    System.out.println(string.indexOf('c'));//indexOf(int ch)；返回结果：7  
    
    //从fromIndex查找ch，这个是字符型变量，不是字符串。字符a对应的数字就是97。  
    System.out.println(string.indexOf(97,3));//indexOf(int ch, int fromIndex)；返回结果：6  
    System.out.println(string.indexOf('a',3));//indexOf(int ch, int fromIndex)；返回结果：6  
  
    //这个就是灵活运用String类提供的方法，拆分提供的字符串。  
    String s = "D:\\Android\\sdk\\add-ons";  
    System.out.println(s);  
    while (s.lastIndexOf("\\") > 0) {  
        s = s.substring(0, s.lastIndexOf("\\"));  
        System.out.println(s);  
    }  
}
```

## 5、String和String[]的length的区别
```
String s1;
String[] s2;
s1.length(); // 字符串需要括号
s2.length; // 数组不需要括号
```
