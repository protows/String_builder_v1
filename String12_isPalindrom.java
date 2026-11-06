//Ваш метод public boolean isPalindromeLine(String str) из прошлого задания
//работает, но не совсем оптимально. Усовершенствуйте его так, чтобы он мог обрабатывать
//не только отдельные слова, но и целые строки с пробелами. Такие, как, к примеру,
//«Молебен о коне белом».
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
