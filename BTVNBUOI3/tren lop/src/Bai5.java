import jdk.jshell.execution.JdiInitiator;

import java.util.Scanner;

public class Bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static int input(){
        System.out.println("Nhập 1 số n bất kì: ");
        return sc.nextInt();
    }
    public static void print(int [][]arr, int n){
        System.out.println("Ma trân xoắn ốc kích thước n x n: ");
        int tren = 0, trai = 0, phai = n - 1, duoi = n - 1;
        int diChuyen = 1;
        while(diChuyen <= Math.pow(n, 2)){
            // trai sang phai
            for(int i = trai; i <= phai; i++){
                arr[tren][i] = diChuyen;
                diChuyen++;
            }
            tren++;
            // tren xuong duoi
            for(int i = tren; i <= duoi; i++){
                arr[i][phai] = diChuyen;
                diChuyen++;
            }
            phai--;
            //phai sang trai
            for(int i = phai; i >= trai; i--){
                arr[duoi][i] = diChuyen;
                diChuyen++;
            }
            duoi--;
            //duoi len tren
            for(int i = duoi; i >= tren; i--){
                arr[i][trai] = diChuyen;
                diChuyen++;
            }
            trai++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int cheoChinh(int[][] arr, int n){
        int tongCheoChinh = 0;
        for(int i = 0; i < n; i++){
            tongCheoChinh += arr[i][i];
        }
        return tongCheoChinh;
    }
    public static int cheoPhu(int[][] arr, int n){
        int tongCheoPhu = 0;
        for(int i = 0; i < n; i++)
        {
            tongCheoPhu += arr[i][n - 1 - i];
        }
        return tongCheoPhu;
    }
    public static void main(String[] args) {
        int n = input();
        int[][] arr = new int[n][n];
        print(arr, n);
        System.out.println("Tổng đường chéo chính: " + cheoChinh(arr, n));
        System.out.println("Tổng đường chéo phụ: " + cheoPhu(arr, n));
    }
}
