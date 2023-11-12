import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    //Метод для возвращения всех цифр из строки:
    public static String getAllDigits(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    //Метод для замены каждой буквы на знак &:
    public static String replaceWithAmpersand(String input) {
        return input.replaceAll("[a-zA-Z]", "&");
    }
    //Метод для возвращения инст в строке:
    public static String findInstagram(String input) {
        return input.replaceAll(".*inst: @([^\\s]+).*", "$1");
    }
    // Метод для проверки строки на вид "null":
    public static boolean isNull(String input) {
        return "null".equals(input);
    }
    //Найти имя и фамилию человека в строке:
    public static String findNameAndSurname(String input) {
        Pattern pattern = Pattern.compile("Меня зовут ([^\\s]+) ([^\\s]+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String name = matcher.group(1);
            String surname = matcher.group(2);
            return("Имя: " + name + ", Фамилия: " + surname);
        }
        return input;
    }
    //“Hello \n world \n !!!” заменить \n на “”
    public static void changeNewStrToProb(){
        String input = "Hello \n world \n !!!";
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(input);
        String result = matcher.replaceAll("");
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(getAllDigits("Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills"));
        System.out.println(replaceWithAmpersand("0406hi88"));
        System.out.println(findInstagram("Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills"));
        System.out.println(isNull("null"));
        System.out.println(findNameAndSurname("Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!"));
        changeNewStrToProb();
    }
}