package stringbuilder;
public class FindRepeats2 {
static int numberOfRepeats(String text, String substring) {
int count = 0;
int index = text.indexOf(substring);

 while (index != -1) {
            count++;
            index = text.indexOf(substring, index + substring.length());
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
