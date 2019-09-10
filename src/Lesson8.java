import java.util.Arrays;

public class Lesson8 {

    private String learn = "My home work";
    private String work =  "My job";
    private String lesson = "My Home wOrk";
    private String job = "  Jobs yes 5 ";
    private boolean value = true;

    public  void stringLearn() {

        char charAt = learn.charAt(4); // находит символ под индексом
        System.out.println(charAt);

        boolean contains = learn.contains("ho"); // возвращает true если находит последовательность символов
        System.out.println(contains);

        boolean endsWith = learn.endsWith("or"); // возвращает true если строка заканчивается этим суфиксом
        System.out.println(endsWith);

        boolean startsWith = learn.startsWith("My"); // возвращает true если строка начинается этим префиксом
        System.out.println(startsWith);              // (для endsWith и startsWith регистр имеет значение)

        boolean equals = learn.equals(work); // возвращает true если сравниваемые строки одинаковы (чуствителен к регистру)
        System.out.println(equals);

        boolean equalsIgnoreCase = learn.equalsIgnoreCase(lesson); // возвращает true если сравниваемые строки одинаковы
        System.out.println(equalsIgnoreCase);                      // без учета регистра

        System.out.printf("%12.4s%n", learn); // для форматирования текста, в данном случае выведет первые 4 символа и сдвинет их вправо на 12

        int indexOf = learn.indexOf("o"); // возвращает индекс указаного символа (только первый символ который встретит)
        System.out.println(indexOf);

        int lastIndexOf = learn.lastIndexOf("o"); // возвращает индекс указаного символа (только последний символ который встретит)
        System.out.println(lastIndexOf);

        boolean isEmpty = learn.isEmpty(); // возвращает true если длина строки == 0;
        System.out.println(isEmpty);

        int length = learn.length(); // возвращает длину строки
        System.out.println(length);

        String replace = learn.replace("o", "T"); // возвращает строку с измененными символами
        System.out.println(replace);

        String substring = learn.substring(5); // возвращает подстроку этой строки, начиная с индекса
        System.out.println(substring);

        String toLowerCase = lesson.toLowerCase(); // преобразовует все символы в нижний регистр
        System.out.println(toLowerCase);

        String toUpperCase = learn.toUpperCase(); // преобразовует все символы в верхний регистр
        System.out.println(toUpperCase);

        String trim = job.trim(); // убирает все начальные и конечные пробелы
        System.out.println(trim);

        String valueOf = String.valueOf(value); // возвращает строковое представление для типов boolean,char,double ... .
        System.out.println(valueOf);

        String[] split = learn.split("\\s*(\\s|,|!|\\.)\\s*"); // разбивает строку во регулярным выражениям
        System.out.println(Arrays.toString(split));


    }

}
