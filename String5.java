//, который будет возвращать число
//повторения подстроки substring в переданном тексте text
package stringbuilder;

public class String5 {
public static void main(String[] args) {
String5 check = new String5();
int count = check.numberOfRepeats("раз, раз, раз", "раз");
System.out.println(count);
}
public int numberOfRepeats(String text, String substring) {
    int countItems = 0;
    String[] rawArr = text.split(",");
    String[] arr =  new String[rawArr.length];
    for(int i=0; i< rawArr.length; i++){
        arr[i] = rawArr[i].trim();
    }
    for(int j=0; j<arr.length; j++){
        if(substring.equals(arr[j])){
            countItems++;
        }
    }
    
    return countItems;
   
}
}
