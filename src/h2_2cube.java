import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class h2_2cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words: ");

        String[] parasite = {"эээ", "потом", "вот"}; //Массив слов паразитов

        ArrayList<String> arrayList = new ArrayList<>(); //Ввод слов
        String n = sc.nextLine();
        arrayList.add(n);
        while (!Objects.equals(n,"СТОП")) {
            n = sc.nextLine();
            arrayList.add(n);
        }

        for(int i = 0; i<arrayList.size(); i++) { //Удаление слов паразитов
            for (int j = 0; j<parasite.length; j++) {
                if (Objects.equals(arrayList.get(i), parasite[j])) {
                    arrayList.remove(i);
                }
            }
        }

        int number = arrayList.indexOf("Куб"); //Счёт и вывод
        System.out.print("Result: ");
        if (number != -1) {
            System.out.println(number + 1);
        } else {
            System.out.println("NO");
        }
    }
}