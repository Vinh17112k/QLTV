/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

/**
 *
 * @author Quang Vinh
 */
public interface QLChucNang {
    //chuc nang 1: nhap sach
    public void nhapSach();
    //chuc nang 2: viet DS
    public void vietDS();
    //chuc nang 3: xoa sach
    public void xoa(String Ma);
    //chuc nang 4: sua sach
    public void sua(String Ma);
    //chuc nagn 5: tim kiem theo ma
    public void tkTheoMa(String Ma);
    //chuc nang 6: tim kiem theo ten NXB
    public void tkTheoNXB(String tenNXB);
    //chuc nang 7: tim kiem theo so ban
    public void tkTheoSoBan(int begin, int off);
    //chuc nang 8: sap xep theo ma
    public void sxTheoMa();
    //chuc nang 9: sap xep theo NXB
    public void sxTheoNXB();
    //chuc nang 10: sap xep theo so ban
    public void sxTheoSoBan();
}
