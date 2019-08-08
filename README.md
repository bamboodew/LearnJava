# LearnJava

## 目录
[1.main中的arges的含义](https://github.com/bamboodew/LearnJava/blob/master/README.md#1main中的arges的含义)

[2.parameters和arges的区别](https://github.com/bamboodew/LearnJava/blob/master/README.md#2parameters和arges的区别)

[3..class和.java的区别](https://github.com/bamboodew/LearnJava/blob/master/README.md#3class和java的区别)

[4.indexof()的使用方法](https://github.com/bamboodew/LearnJava/blob/master/README.md#4indexof的使用方法)

[5.String和String[]的length的区别](https://github.com/bamboodew/LearnJava/blob/master/README.md#5String和String的length的区别)

[6.java StringBuffer的length()和capacity()方法比较](https://github.com/bamboodew/LearnJava/blob/master/README.md#6java-StringBuffer的length和capacity方法比较)

[7.JAVA_Eclipse_WindowBuilder中给JPanel加标题头](https://github.com/bamboodew/LearnJava/blob/master/README.md#7JAVA_Eclipse_WindowBuilder中给JPanel加标题头)

[8.JAVA_Eclipse_WindowBuilder修改块颜色](https://github.com/bamboodew/LearnJava/blob/master/README.md#8JAVA_Eclipse_WindowBuilder修改块颜色)

[9.表格内容居中](https://github.com/bamboodew/LearnJava/blob/master/README.md#9表格内容居中)





## 1.main中的arges的含义
[main方法参数String[] args的使用](https://www.cnblogs.com/xy-hong/p/7197725.html)

## 2.parameters和arges的区别
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

## 3..class和.java的区别
.java文件是源文件，通过javac命令编译后生成.class文件；.class文件是字码结文件，即.java文件编译后的代码。

.class文件全名称为Java class文件，主要在平台无关性和网络移动性方面使Java更适合网络。

它在平台无关性的任务是为Java程序提供独立于底层主机平台的二进制形式的服务。

![头像](https://gss0.baidu.com/9vo3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/6f061d950a7b02086a910e736fd9f2d3562cc8c3.jpg)

源文件：一般指用汇编语言或高级语言写出来的代码保存为文件后的结果，源文件是相对目标文件和可执行文件而言的。

源文件就是用汇编语言或高级语言写出来的代码保存为文件后的结果。

Java：是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。

Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程。

Java之父“高司令”：他是比尔盖茨的噩梦，他用他的大胡子让盖茨的微笑变得十分勉强，他是技术的先驱，他技术成果覆盖了100亿台设备，除了苹果，没有什么手机不用向他致敬；他就是高斯林，Java的缔造者。作为Java编程语言的共同创始人之一，中国的程序员们在膜拜这位公认的Java之父同时，亲昵的用中文谐音“高司令”来表达出对他的多重敬意。

## 4.indexof()的使用方法
```java
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

## 5.String和String[]的length的区别
```java
String s1;
String[] s2;
s1.length(); // 字符串需要括号
s2.length; // 数组不需要括号
```

## 6.java StringBuffer的length()和capacity()方法比较
[StringBuffer的length()和capacity()方法比较](https://blog.csdn.net/wxgxgp/article/details/55657078)

StringBuffer的的初始大小为（16+初始字符串长度）即capacity=16+初始字符串长度。

一旦length大于capacity时，capacity便在前一次的基础上加1后倍增。

## 7.JAVA_Eclipse_WindowBuilder中给JPanel加标题头
```java
Jpanel panel = new JPane();
Border titleBorder1 = BorderFactory.createTitledBorder("会员基本信息"); //关键JPanel标头
panel.setBorder(titleBorder1);
```
--------------------- 
作者：Mv8Yang 
来源：CSDN 
原文：https://blog.csdn.net/Mv8Yang/article/details/45566097 
版权声明：本文为博主原创文章，转载请附上博文链接！

createTitledBorder(Border border, String title, int titleJustification, int titlePosition, Font titleFont)
向现有边框添加一个标题，使其具有指定的位置和默认的文本颜色（由当前外观确定）。
直接在后面再加个字体
```java
panel.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.BLACK,2),
        "用户",
        TitledBorder.CENTER,
        TitledBorder.TOP,
        new java.awt.Font("宋体",0,26)));//宋体，普通，26号字，把中间的0改成1就是加粗
```

## 8.JAVA_Eclipse_WindowBuilder修改块颜色
opaque改为true
foreground：字体颜色
background：背景颜色

## 9.表格内容居中
```java
DefaultTableCellRenderer r = new DefaultTableCellRenderer();   
r.setHorizontalAlignment(JLabel.CENTER);   
table.setDefaultRenderer(Object.class, r);
```
