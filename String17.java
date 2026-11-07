//Программа по учёту оценок сломалась, но в нашей части системы сохранились бэкапы! 
//Проведите преобразование, обратное тому, которое было в предыдущем задании. На вход теперь подаётся массив строк:
//Вероника Чехова физика — Безупречно Анна Строкова математика — Потрясающе Иван Петров геометрия — Безупречно
//Требуется превратить их в одну запись вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка". 
//Метод для перевода оценки в строку-число уже реализован.
//https://github.com/practicetasks/java_tasks/blob/main/string/task_3/README.md
package stringbuilder;

public class String17 {
     public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        String17 str = new String17();
String[] arr = new String[]{
        "Вероника Чехова физика — Безупречно",
        "Анна Строкова математика — Потрясающе",
        "Иван Петров геометрия — Безупречно"
};        String res = str.serializeGrades(arr);
        System.out.println(res);

    }

        
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
          String[] records= new String[grades.length];
 
         for(int i=0; i< grades.length; i++){
            String[] parts = grades[i].split(" ");
         //String name = capitalize(parts[0]);
        // String lastName = capitalize(parts[1]);
         //String subject = parts[2].toLowerCase();
         String grade = gradeStringToInt(parts[4]);
         records[i] = (parts[0] + "," + parts[1]+ "," + parts[2] + "," + grade);
         
            }

return String.join(";", records);
               


    }
}
