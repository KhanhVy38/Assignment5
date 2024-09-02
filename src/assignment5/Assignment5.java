package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {
    // câu 1
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int size = sc.nextInt();
        for(int i=0; i<size;i++){
            System.out.println("numbers"+ (i+1)+":");
            int value = sc.nextInt();
            numbers.add(value); // them so nguyen vào arrayList
        }
        return numbers;
    }
   // câu 2
    public static void PrintData(ArrayList<Integer> numbers){
        System.out.println("numbers[]"+Arrays.toString(numbers.toArray()));
    }
    // câu 3
    public static int findMax2(ArrayList<Integer>numbers){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int value : numbers){
            if(value>max1){
                max2 = max1;
                max1=value;
            }else if(value>max2||value!=max1){
                max2 = value;
            }
        }
        return max2;
    }
    // câu 4
    public static void deleteOddNumber(ArrayList<Integer> numbers){
        int count = 0;
        for(int value : numbers){
            if(value%2==0){
                count++;
            }
        }
        int []index = new int[count];
        int pus = 0;
        for(int value : numbers){
            if(value%2==0){
                index[pus++]=value;
            }
        }
         System.out.println("xoa phan tu le trong mang:"+Arrays.toString(index));
    }
}