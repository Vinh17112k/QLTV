/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import quanly.QLTV;
import java.util.Scanner;

/**
 *
 * @author Quang Vinh
 */
public class menu {

    public static void main(String[] args) {
        QLTV q = new QLTV();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("0: thoat. ");
            System.out.println("1: nhap sach. ");
            System.out.println("2: viet DS. ");
            System.out.println("3: xoa sach. ");
            System.out.println("4: sua sach. ");
            System.out.println("5: tim kiem theo ma. ");
            System.out.println("6: tim kiem theo NXB. ");
            System.out.println("7: tim kiem theo so ban. ");
            System.out.println("8: sap xep theo ma. ");
            System.out.println("9: sap xep theo NXB. ");
            System.out.println("10: sap xep theo so ban. ");
            int choise = Integer.parseInt(in.nextLine());
            switch (choise) {
                case 0:
                    System.out.println("thoat.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("nhap sach");
                    q.nhapSach();
                    break;
                case 2:
                    System.out.println("viet DS");
                    q.vietDS();
                    break;
                case 3:
                    System.out.println("xoa sach");
                    String Ma = in.nextLine();
                    q.xoa(Ma);
                    break;
                case 4:
                    System.out.println("sua sach");
                    Ma = in.nextLine();
                    q.sua(Ma);
                    break;
                case 5:
                    System.out.println("tim kiem theo ma");
                    Ma = in.nextLine();
                    q.tkTheoMa(Ma);
                    break;
                case 6:
                    System.out.println("tim kiem theo ten NXB");
                    String tenNXB = in.nextLine();
                    q.tkTheoNXB(tenNXB);
                    break;
                case 7:
                    System.out.println("tim kiem theo so ban");
                    int start = Integer.parseInt(in.nextLine());
                    int end = Integer.parseInt(in.nextLine());
                    q.tkTheoSoBan(start, end);
                    break;
                case 8:
                    System.out.println("sap xep theo ma");
                    q.sxTheoMa();
                    break;
                case 9:
                    System.out.println("sap xep theo NXB");
                    q.sxTheoNXB();
                    break;
                case 10:
                    System.out.println("sap xep theo so ban");
                    q.sxTheoSoBan();
                    break;
            }
        }
    }
}
