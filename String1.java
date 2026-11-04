//Напишите метод fixString() для обрезки ненужных пробелов
package stringbuilder;
public class String1 {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        String res = fixString("  ");
        System.out.println("result "  + res);

    }
     static String fixString(String str) {
         if(str.isBlank()){
             System.out.println(  "Вы ничего не ввели!");
         }
         str= str.trim();
         return str;
    }
}
