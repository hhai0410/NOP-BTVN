import java.util.Scanner;
// Bài này khó quá em có dùng chat GPT ặ
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước n của xoắn ốc: ");
        int n = sc.nextInt();
        int soDiChuyen = 1;
        int[][] arr = new int[n][n];
        int tren = 0, trai = 0;
        int duoi = n - 1, phai = n - 1;
        while (soDiChuyen <= Math.pow(n, 2)) {
            for (int i = trai; i <= phai; i++) {
                arr[tren][i] = soDiChuyen++;
            }
            tren++;
            for (int i = tren; i <= duoi; i++) {
                arr[i][phai] = soDiChuyen++;
            }
            phai--;
            if (tren <= duoi) {
                for (int i = phai; i >= trai; i--) {
                    arr[duoi][i] = soDiChuyen++;
                }
                duoi--;
            }
            if (trai <= phai) {
                for (int i = duoi; i >= tren; i--) {
                    arr[i][trai] = soDiChuyen++;
                }
                trai++;
            }
        }
        System.out.println("Ma trận xoắn ốc:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
