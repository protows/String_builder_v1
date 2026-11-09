package stringbuilder;
public class FindRepeats3 {
static int numberOfRepeats(String text, String substring) {
int count = 0;
int index = text.indexOf(substring);
StringBuilder sb = new StringBuilder(text);

 while (index != -1) {
            count++;
            sb.delete(0, index + substring.length());
            index = sb.indexOf(substring);
        }
return count;
}



public static void main(String[] args) {
String text = "раз раз раз раз раз ";
String entry = "раз ";
int res = numberOfRepeats(text, entry);
System.out.println(res);
}
}
