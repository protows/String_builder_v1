package stringbuilder;
//Исправьте текст при помощи методов replace() и replaceFirst(). У вас должно получиться.
//На красный свет — стой на месте;
//на жёлтый свет — приготовься;
//на зелёный — осмотрись, а затем смело шагай.
public class String8 {
public static void main(String[] args) {
    String rules = "На зелёный цвет — стой на месте;\n" +
    "на зелёный цвет — приготовься;\n" +
    "на зелёный — осмотрись, а затем смело шагай.";
    String replaced = rules.replaceFirst("На зелёный", "На красный").replaceFirst("на зелёный", "на жёлтый");
    System.out.println(replaced);
}
}
