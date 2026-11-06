// Напишите метод boolean isPalindromeWord(String str). Он должен возвращать true,
// если аргумент — палиндром, иначе false. Исходите из того, что строка-аргумент это одно
// слово, которое не содержит пробелов. К примеру, «казак».
package stringbuilder;

public class String12_isPalindrom {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.out.println(isPalindromeWord("казак"));
    }


public static boolean isPalindromeWord(String str) {
    StringBuilder newItem = new StringBuilder();
    for(int i=str.length()-1; i>=0; i--){
        newItem.append(str.charAt(i));
    }
  

    if(newItem.toString().equals(str)){
        
     return true;
        
    }else{return false;}

}
}
