package stringbuilder;
//Ваш метод public boolean isPalindromeLine(String str) из прошлого задания
//работает, но не совсем оптимально. Усовершенствуйте его так, чтобы он мог обрабатывать
//не только отдельные слова, но и целые строки с пробелами. Такие, как, к примеру,
//«Молебен о коне белом».
public class String13_isPalindrom_v2 {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.out.println(isPalindromeWord("Молебен о коне белом"));
    }


public static boolean isPalindromeWord(String str) {
    String arr = str.replaceAll("\\s+", "").toLowerCase();

    StringBuilder newItem = new StringBuilder();
    for(int j=arr.length()-1; j>=0; j--){
            System.out.println("j: " + arr.charAt(j));

            newItem.append(arr.charAt(j));
    }
    System.out.println("newItem: "+ newItem);

    if(newItem.toString().equals(arr)){
        return true; 
    }else{      
        return false;
    }

}
}
