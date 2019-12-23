
import com.sun.source.tree.LiteralTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class Welcoms {

    public static final double FINAL_COLOR = 1.0;

    public enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};

    //    public static strictfp void main(String[] args) {
    public static void main(String[] args) {
        double aa = 2.0 - 1.1;
        System.out.println(1/1); //没有换行符
        System.out.println("Java 欢迎你！！！");
        System.out.println(Double.isNaN(1));

        boolean b = false;
        System.out.println(Character.isJavaIdentifierStart('@'));

        double bb = 1;
        bb+=1;
        System.out.println(FINAL_COLOR);

        Size s = Size.MEDIUM;
        System.out.println(s);

        double y = Math.sqrt(bb+1);
        System.out.println(Math.pow(y,2));

        y = 222;
        int x = 1;
        int c = 2+ ++x;
        System.out.println(c);
        System.out.println(x<y?x:y);

        System.out.println(1<<4);

        String greeting = "Hello";
        //子串长度为b-a
        System.out.println(greeting.substring(0,3)); //第二个参数是不想复制的第一个位置的index
        System.out.println(greeting.substring(2,3));

        String all = String.join("/","S","M","L","XL");
        System.out.println(all);

        System.out.println("Hello".equals("hello")); //"".equalsIgnoreCase()
        System.out.println("".length() == 0);
        System.out.println(""==null);
        System.out.println("    hello__".indexOf("hello"));

        StringBuilder builder = new StringBuilder();
        builder.append("asaa");
        builder.append('_');
        System.out.println(builder.toString());
        System.out.printf("%1$tF %1$tT \n", new Date());

        x = 0;
        int sign = 0;
        if(x<0) if(x==0) sign=0; else sign=-1;








    }
}

