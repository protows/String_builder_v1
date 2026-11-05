//Реализуйте метод String fixText(String text). Он должен:
//• Исправлять кавычки "„" и "“" на "«" и"»".
//• Убирать опечатку в слове "цевилизаций" (на "цивилизаций").
//• Убирать лишние символы в начале и в конце строки.
//• Начинать строку с большой буквы. Обратите внимание, мы уже добавили в код ранее
//написанный вами метод String capitalize(String str).
package stringbuilder;
public class String9 {
public String capitalize(String str) {
return str.substring(0, 1).toUpperCase() + str.substring(1);
}
public String fixText(String text) {
// Реализуйте этот метод
    text = capitalize(text.replace("„", "«").replace("“", "»").replace("цевилизаций", "цивилизаций").trim());
    
    return text;
}
public static void main(String[] args) {
String text = "      история каждой из крупных галактических цевилизаций может быть разделена на три различные, " +
"ярко выраженные фазы: Борьба за выживание, Любопытство и Утонченность, также именуемые фазами " +
"„Как?“, „Зачем?“ и „Где?“. Пример: если для первой фазы характерен вопрос: „Как бы нам поесть?“," +
" а для второй „Зачем мы едим?“, то третья отличается вопросом: „Где бы нам лучше поужинать?“.  ";
var textFixer = new String9();
var fixedText = textFixer.fixText(text);
System.out.println(fixedText);
}


}
