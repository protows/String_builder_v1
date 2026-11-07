package stringbuilder;
//Объединить элементы массива в строку можно также через StringBuilder с помощью
//цикла. Однако код с таким алгоритмом выглядит достаточно громоздко. Исправьте его так,
//чтобы в использовании StringBuilder и цикла отпала необходимость.
//StringBuilder sbRainbow = new StringBuilder();
//for (int i = 0; i < rainbow.length; i++) {
//sbRainbow.append(rainbow[i]);
//if (i != rainbow.length - 1) {
//    sbRainbow.append(", ");
//}
//}
public class String15 {
public static void main(String[] args) {
String[] rainbow = new String[]{
"Красный",
"Оранжевый",
"Жёлтый",
"Зелёный",
"Голубой",
"Синий",
"Фиолетовый"
};
String result = String.join(", ", rainbow);

System.out.println(result);
}
}
