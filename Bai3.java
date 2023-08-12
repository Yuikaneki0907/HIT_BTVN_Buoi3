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
public class Bai3 {

    static void SapXep(int[] a, int n) {
        for (int i = 0; i < 0; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] > a[j]) {
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        SapXep(a, n);
    }
}
