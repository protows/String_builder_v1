//Часто при реализации больших программ часть данных в них попадает в неподходящем, «сыром» виде. 
//Такие данные нужно преобразовать, чтобы избежать ошибок в их дальнейшей обработке.
//Напишите метод String fixPoem(String[] poem) для работы со стихотворениями. 
//Метод должен удалять пустые строки (или строки из пробельных символов) и лишние пробелы с начала и конца. 
//Стихотворение доступно по вызову метода readPoem() в виде списка строк.
package stringbuilder;
public class String11 {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        // допишите код
        StringBuilder  sb = new StringBuilder();
        
        for(int i=0; i< poem.length; i++){
           String trimmed =  poem[i].trim();
           if(!trimmed.isBlank()){
               if(sb.length()>0){
                   sb.append("\n");
               }
               sb.append(trimmed);
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String11 poemFixer = new String11();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
