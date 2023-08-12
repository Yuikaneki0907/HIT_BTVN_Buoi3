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
public class Bai4 {

    static void KtraDx(String a) {
        int index = 0;
        int dem = 0;
        double sl = Math.floor(a.length() / 2);
        for (int i = (a.length() - 1); i >= sl; i--) {
            if (a.charAt(i) == (a.charAt(index))) {
                dem++;
            }
            index++;
        }
        if (a.length() % 2 != 0) {
            dem--;
        }
        if (dem == sl) {
            System.out.println("Chuoi doi xung.");
        } else {
            System.out.println("Chuoi khong doi xung.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = sc.nextLine();
        KtraDx(a);
    }
}
