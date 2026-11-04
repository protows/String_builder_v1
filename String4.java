package stringbuilder;
//Задача
//В отделах кадров часто требуется искать работников по первым буквам фамилии. От
//перебора бумажных картотек уже отказались — все персональные данные загружены в
//электронную базу. Вам нужно реализовать метод boolean startsWith(String initial,
//String other), который возвращает true, если фамилия работника initial начинается с
//подстроки other, иначе false.
public class String4 {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        var startsWith = startsWith("Geoge Same", "Geo");
        System.out.println("startsWith " + startsWith);
        var endsWith = endsWith("Geoge Same", "ame");
         System.out.println("endsWith " + endsWith);

    }

public static boolean startsWith(String initial, String other) {
             return initial.indexOf(other) == 0;

}


//Теперь вам нужно реализовать метод boolean endsWith(String initial, String
//other) — для поиска не по началу слова, а по окончанию. Метод должен возвращать true,
//если строка initial заканчивается на строку other, иначе false. Например, для сочетания
//«жираф» и «раф», результат должен быть true, так как строка «жираф» заканчивается на
//слово «раф», а вот для сочетания «кошка» и «каша» должно вернуться false.
public static boolean endsWith(String initial, String other) {
    return initial.lastIndexOf(other)== initial.length() - other.length();
}
}
