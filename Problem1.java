/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Administrator
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n,choice;
        char ans;
        System.out.println("enter size of array");
        n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("enter values for array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        
        
            
        do
        {
        System.out.println("1.Shallow copy\n2.deep copy\n3.copy of\n4.copyof range\n5.tostring\n6.sort\n7.binary search\n8.fill");
        System.out.println("enter your choice");
        choice=scan.nextInt();
        
            
        
        switch(choice){
            case 1:
                System.out.println("Shallow copy");
                int arr1[]=arr;
                for(int i:arr1)
                {
                    System.out.println(i);
                }
                break;
            case 2:
                System.out.println("Deep copy");
                int[] arr2=arr.clone();
              for(int i:arr2)
                {
                    System.out.println(i);
                }
                break;
            case 3:
                System.out.println("copyof");
                int[] arr3=Arrays.copyOf(arr,2);
                for(int i:arr3)
                {
                    System.out.println(i);
                }
                break;
            case 4:
                System.out.println("copyofRange");
                int[] arr4=Arrays.copyOfRange(arr,1,3);
                 for(int i:arr4)
                {
                    System.out.println(i);
                }
                 break;
            case 5:
                System.out.println("tostring");
                System.out.println(Arrays.toString(arr));
                break;
            case 6:
                System.out.println("sorting");
                 Arrays.sort(arr);
                 for(int i:arr)
                 {
                     System.out.println(i);
                 }
                 break;
            case 7:
                System.out.println("binary search");
                Arrays.sort(arr);
                System.out.println("enter number want to search");
                int key;
                key=scan.nextInt();
                System.out.println(Arrays.binarySearch(arr, key));
                break;
            case 8:
                System.out.println("fill");
                System.out.println("enter number you want to fill with");
                int fill;
                fill=scan.nextInt();
                Arrays.fill(arr, 5);
               break;
        }
         System.out.println("do you want to continue:(y/n)");
            
            ans=scan.next().charAt(0);
    }
           
            while(ans=='y');
        
    };
        
    
}
