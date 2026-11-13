//Задача усложняется! Ограничений на количество символов в строках наименования товара, количества и цены больше нет. 
//При этом самая длинная строка с наименованием товара и его количеством должна разделяться ровно двумя пробелами.
//То же самое между количеством и ценой.
//Для входных данных мы предлагаем вам использовать данный набор строк:
//String[]{"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"}
//Данные строки, по очереди введите в консоль программы после того, как вы задали число строк.
//https://github.com/practicetasks/java_tasks/blob/main/string/task_5/README.md
package stringbuilder;
public class String19 {
    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        int n = items.length;
        String[] name = new String[n];
        String[] count = new String[n];
        String[] price = new String[n];
        
        
        for(int i=0; i< n; i++){
            String[] res = items[i].split(",");
            name[i] = res[0].trim();
            count[i] = res[1].trim();
            price[i] = res[2].trim();
            }
            int nameLength  = findMaxLength(name) + 2;
            int countLength  = findMaxLength(count)+2;

            String format = "%-" + nameLength + "s%-" + countLength+ "s%s%n";
            for(int j=0; j< n; j++){
                System.out.printf(format,  name[j], count[j], price[j]);
            }
        
    }

    public static void main(String[] args) {        
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        String[] values = new String[]{"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"};
        printCheck(values); 
    }
}
