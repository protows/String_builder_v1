//Реализуйте методы capsLock() и print(). Первый устанавливает флаг isCapsLock в true
//или false. Второй выводит строку в верхнем или оставляет регистр как есть в зависимости
//от этого флага.
package stringbuilder;
public class String2 {
    private static boolean isCapsLock = false;

    public static void main(String[] args) {
    System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
    capsLock();
    print("Name", isCapsLock);
}
    
    public static void capsLock() {
    // Здесь нужно изменить значение флага isCapsLock на противоположное
    isCapsLock=!isCapsLock;
    }
public static void print(String str, boolean isCapsLock) {
// А здесь распечатать строку в верхнем или нижнем регистре с учётом флага
   if(isCapsLock){
        System.out.println(str.toUpperCase());
    }else{
        System.out.println(str.toLowerCase());
    }
}

}
