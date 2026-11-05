package stringbuilder;
public class FindRepeats {
static int numberOfRepeats(String text, String substring) {
int count = 0;
while (text.contains(substring)) {
count++;

text = text.substring(text.indexOf(substring) + substring.length());
System.out.println("text:" + text);

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
