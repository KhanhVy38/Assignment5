package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String check;
        do {
            System.out.println("Menu: Nhap data (phim 1), xuat data(phim 2)),"
                    + " in ra so lon thu hai (phim 3), xoa so le (phim 4)");
            int choosi = Integer.parseInt(sc.nextLine());
            switch (choosi) {
                case 1:
                    numbers = Assignment5.EnterData(numbers);
                    break;
                case 2:
                    Assignment5.PrintData(numbers);
                    break;
                case 3:
                    int secondLargest = Assignment5.findMax2(numbers);
                    System.out.println("so lon thu hai: "+secondLargest );
                    break;
                case 4:
                    Assignment5.deleteOddNumber(numbers);
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");;
            }
            System.out.println("Nhap yes de tep tuc chuong trinh");
            check = sc.nextLine();
        }while (check.equals("yes"));         
    }
}