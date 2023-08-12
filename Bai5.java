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
public class Bai5 {
    static String Tach(String a){
        String f1 = a.substring(0,a.lastIndexOf(" "));
        String f2 = a.substring(a.lastIndexOf(" "));
        String s1 = f2.substring(0,1);
        String s2 = f2.substring(1,f2.length());
        f2=(s1.toUpperCase()).concat(s2);
        return f2;
    }
    static void SuaTen(String a){
        a= a.trim();
        a=a.toLowerCase();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        SuaTen(a);
    }
}
