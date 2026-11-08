//Допишите программу для вывода на экран информации из чека.
//На вход подаётся массив строк вида {"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"}. 
//Наименование товара состоит не более чем из восьми символов, количество не более чем из пяти,
//а цена не более чем из шести символов.
//В результате исполнения метода на экран должен напечататься чек. Все его элементы должны быть выровнены по левому краю.
//Между ними должно быть минимум два пробела. Ограничений на максимальный вывод нет, 
//равно как и ограничений на количество пробелов между наименованием / количеством / ценой.
//Пример обработанных данных (оба варианты корректны):
//https://github.com/practicetasks/java_tasks/blob/main/string/task_4/README.md
package stringbuilder;
public class String18 {
    public static void printCheck(String[] items) {
        for(int i=0; i< items.length; i++){
            String[] res = items[i].split(",");
        
            System.out.printf("%-10.8s%-5s%-6s%n", res[0].trim(), res[1].trim(), res[2].trim());
        }
    }

    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        
   
     String[] values = new String[]{"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"};
        printCheck(values); 
    }
         
}
