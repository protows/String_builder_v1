//Настройте программу по учёту школьных оценок. На вход подаётся строка, один элемент которой имеет вид <имя, фамилия, предмет, оценка>. Между собой элементы разделяются с помощью символа ";".
//К примеру:"вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5"
//Нужно вывести на экран отдельные строки вида "Имя Фамилия предмет — Оценка". При этом нужно учесть, что
//Имя и фамилия должны начинаться с большой буквы — здесь вам поможет метод String capitalize(String str), который вы написали ранее.
//Название предмета должно состоять из строчных букв.
//Оценка должна быть преобразована в текст. Соответствующий метод String gradeToString(String grade) уже реализован в прекоде.
//Оценка должна быть отделена от предмета длинным тире '—'. Скопируйте символ в код и не забудьте добавить по пробелу с каждой стороны.
//Выходные данные должны получиться такими:
//Вероника Чехова физика — Безупречно
//Анна Строкова математика — Потрясающе
//Иван Петров геометрия — Безупречно
//https://github.com/practicetasks/java_tasks/blob/main/string/task_2/README.md

package stringbuilder;
import java.util.Arrays;


public class String16 {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        String16 str = new String16();
        str.gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");

    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    public void gradeBeautifier(String grades) {
        String[] result = grades.split(";");
        for(int i=0; i< result.length; i++){
            String[] parts = result[i].split(",");
                     StringBuilder sb = new StringBuilder();

            String spaces = " ";
            sb.append(capitalize(parts[0])).append(spaces).append( capitalize(parts[1])).append(spaces)
                    .append(parts[2].toLowerCase()).append(spaces).append(" — ").append(gradeToString(parts[3]));
            System.out.println(sb);  
       
            }

    }
    
     public void gradeBeautifierJoins(String grades) {
        String[] result = grades.split(";");
         StringBuilder sb = new StringBuilder();
        for(int i=0; i< result.length; i++){
            String[] parts = result[i].split(",");
         String name = capitalize(parts[0]);
         String lastName = capitalize(parts[1]);
         String subject = parts[2].toLowerCase();
         String grade = " — " + gradeToString(parts[3]);
          System.out.println(name + " " + lastName + " " + subject + grade);
                
       
            }

    }
}
