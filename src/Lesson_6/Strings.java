package Lesson_6;

public class Strings {
    public static void main(String[] args) {
        String str1 = "    Предложение один  Теперь предложение два     Предложение три  ";
        System.out.println(str1);

        String str2 = str1.replaceAll(" +", " ");                       //заменили все мультипробелы на один пробел
        System.out.println(str2);

        StringBuilder stringBuilder = new StringBuilder(str2);                              //создали стрингбилдер и приравняли
        do{                                                                                 //удалили любой незаглавный символ из начала стрингбилдера
            if (stringBuilder.charAt(0) >= 'А' && stringBuilder.charAt(0) <= 'Я') {
                break;
            } else stringBuilder.delete(0, 1);
        } while (true);

        for (int i = 1; i <stringBuilder.length() ; i++) {                                  //Заменили все пробелы перед заглавными буквами на точки
            if (stringBuilder.charAt(i) >= 'А' && stringBuilder.charAt(i) <= 'Я') {
                stringBuilder.setCharAt(i-1, '.');
            }
        }
        for (int i = 0; i <stringBuilder.length() ; i++) {                                  //После каждой точки вставили пробел
            if (stringBuilder.charAt(i) == '.'){
                stringBuilder.insert(i+1, ' ');
                i++;                                                                        //принудительно увеличиваем счётчик цикла for т.к. иначе он будет нарываться всегда на одну и ту же точку
            }
        }
        do {
            if (stringBuilder.charAt(stringBuilder.length()-1) != ' ' && stringBuilder.charAt(stringBuilder.length()-1) != '.'){ //проверяем конец стрингбилдера на любой символ кроме пробела и точки
                stringBuilder.insert(stringBuilder.length(),'.');                                                               //если последний символ не пробел и не точка, то ставим точку и выходим из цикла breakом
                break;
            } else if (stringBuilder.charAt(stringBuilder.length()-1) == '.'){                                          //если последний символ точка, то просто выходим из цикла
                break;
            } else {
                stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());                               //если последний символ пробел, то удаляем его
            }
        } while (true);
        System.out.println(stringBuilder.toString());               //вывод результата в консоль
    }
}
