//Ряд символов нельзя использовать напрямую как разделители. Это символы точки <.>,
//знака вопроса <?>, скобок <(>, <)>, <[>, <{>, доллара <$>, звёздочки <*>, плюса <+> и
//некоторые другие: <|>, <^>, <\>. Если элементы в строке разделены одним из таких
//символов, то при передаче в метод необходимо добавить два обратных слеша <\\>.
//Настало время разделить строку самостоятельно! Преобразуйте строку dollarAssets в
//массив так, чтобы программа выдавала true при проверке его элементов.
package stringbuilder;
public class String14 {
public static void main(String[] args) {
    String dollarAssets = "Акции$Облигации$Фонды$";
    String[] splitVar = dollarAssets.split("\\$");// разбейте строку dollarAssets
    System.out.println(splitVar[0].equals("Акции"));
    System.out.println(splitVar[1].equals("Облигации"));
    System.out.println(splitVar[2].equals("Фонды"));
}
}
