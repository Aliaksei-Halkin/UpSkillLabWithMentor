package module.therd.strings;

/**
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 * <p>
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 * <p>
 * 3. Проверить, является ли заданное слово палиндромом.
 * <p>
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 * <p>
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * <p>
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 * <p>
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 * <p>
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда
 * самых длинных слов может быть несколько, не обрабатывать.
 * <p>
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
 * английские буквы.
 * <p>
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
 * вопросительным знаком. Определить количество предложений в строке X.
 */
public class StringOrStrBulder {
    public static void main(String[] args) {
        //2.1
        String str = "Дан текст  (строка). Найдите     наибольшее количество подряд идущих пробелов в нем.";
        System.out.println("Maximum quantity of spases: " + runTask2_1(str));
        //2.2
        String str2 = "And from Nevada, the money trail leads to Chongqing City," +
                " the pharma capital of the People's Republic of China";
        System.out.println("Result sentences(after letter \"a\" include letter \"b\": " + runTask2_2(str2));

    }

    static int runTask2_1(String sentences) {
        int maxCount = 0;
        int counter = 0;
        for (int i = 0; i < sentences.length(); i++) {
            if (sentences.charAt(i) == ' ') {
                counter++;
            } else {
                if (counter > maxCount) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }

    private static String runTask2_2(String sentences) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length(); i++) {
            if (sentences.charAt(i) == 'a') {
                stringBuilder.append("ab");
            } else {
                stringBuilder.append(sentences.charAt(i));
            }
        }
               return new String(stringBuilder);
    }
}