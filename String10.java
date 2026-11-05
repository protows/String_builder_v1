//Напишите конструктор приветствия при помощи StringBuilder! Сначала создайте экземпляр
//StringBuilder, а затем добавьте в него три подстроки
package stringbuilder;
public class String10 {
public static void main(String[] args) {
    String start = "Привет! Меня зовут ";
    StringBuilder hello = new StringBuilder(start); // создайте StringBuilder с началом start
    hello.append("ваше имя");// добавьте подстроку "<ваше имя>"
    hello.append(". Я из города "); // добавьте подстроку ". Я из города "
    hello.append("ваш город");// добавьте подстроку "<ваш город>."
String asString = hello.toString();
System.out.println(asString);

}
}
