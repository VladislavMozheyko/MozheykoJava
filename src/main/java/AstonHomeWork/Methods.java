package AstonHomeWork;

import java.util.Scanner;

public class Methods {
    public void checkNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет.");
        }
    }
    public void checkName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя :");
        String name = scan.nextLine();
        if (name.equals("Вячеслав")) {
        System.out.println("Привет Вячеслав.");
        } else {
        System.out.println("Нет такого имени.");
        }
    }
    public void arrInfo(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
