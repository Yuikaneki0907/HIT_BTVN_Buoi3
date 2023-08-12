/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Bai2 {

    static void XoaPtu(int[] a, int n, int x) {
        for (int i = (x - 1); i < n; i++) {
            a[i] = a[i + 1];
        }
        for (int i = 0; i < (n - 1); i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void ThemPtu(int[] a, int n, int x, int y) {
        for (int i = n; i >= (x - 1); i--) {
            if (i == (x - 1)) {
                a[i] = y;
            } else {
                a[i] = a[i - 1];
            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Xoa phan tu nhap 1");
        System.out.println("Them phan tu nhap 2");
        int chon = sc.nextInt();
        if (chon == 1) {
            System.out.print("Nhap vi tri phan tu can xoa: ");
            int xoa = sc.nextInt();
            if (xoa > n) {
                System.out.println("Vi tri khong hop le.");
            } else {
                XoaPtu(a, n, xoa);
            }
        } else {
            System.out.print("Nhap vi tri can them phan tu: ");
            int vtri = sc.nextInt();
            if (vtri > n) {
                System.out.println("Vi tri khong hơp le");
            } else {
                System.out.print("Nhap gia tri phan tu moi: ");
                int them = sc.nextInt();
                ThemPtu(a, n, vtri, them);
            }
        }
    }
}
