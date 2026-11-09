//Задача
//В уроке мы не раз сделали акцент на том, что StringBuilder позволяет не создавать
//лишние строки. Проверьте это! Оптимизируйте программу по подсчету количества
//вхождений строки в текст, чтобы она не создавала лишний «мусор». Подсказка: вместо
//contains() в StringBuilder необходимо пользоваться методом indexOf, а вместо
//получения подстроки можно просто удалять лишние элементы.
package stringbuilder;
public class FindRepeats3 {
//static int numberOfRepeats(String text, String substring) {
//int count = 0;
//while (text.contains(substring)) {
//count++;
//
//text = text.substring(text.indexOf(substring) + substring.length());
//System.out.println("text:" + text);
//
//}
//return count;
//}

static int numberOfRepeats(String text, String substring) {
int count = 0;
StringBuilder sb = new StringBuilder(text);
while (sb.indexOf(substring) != -1) {
count++;
sb.delete(0, sb.indexOf(substring) + substring.length());
System.out.println("text:" + text);

}
return count;
}



public static void main(String[] args) {
String text = "раз раз раз раз раз ";
String entry = "раз ";
int res = numberOfRepeats(text, entry);
System.out.println(res);
}
}
