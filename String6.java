//Маленькие дети часто забывают, что нужно начинать новое предложение с большой буквы.
//Помогите им! Реализуйте метод capitalize(). Он должен переводить первый символ в
//переданной строке в верхний регистр при помощи метода toUpperCase() и возвращать
//полученную строку.
package stringbuilder;
public class String6 {
public static void main(String[] args) {
    String6 check = new String6();
    System.out.println(check.capitalize("я не волшебник, я только учусь!"));
    }
public String capitalize(String str) {
    if(str ==null || str.isBlank()){
        return str;
    }
    return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
