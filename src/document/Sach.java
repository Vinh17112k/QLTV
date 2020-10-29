/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package document;

/**
 *
 * @author Quang Vinh
 */
public class Sach extends TaiLieu implements TinhAnPham{
    private String tenS,tenTG;
    private int soTrang;
    public Sach(){
        
    }
    public Sach(String Ma,String nxBan,int soBan,String tenS,String tenTG,int soTrang)
    {
        super(Ma,nxBan,soBan);
        this.tenS=tenS;
        this.tenTG=tenTG;
        this.soTrang=soTrang;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public String toString(){
        return getMa()+"\t"+getNxBan()+"\t"+getSoBan()+"\t"+tenS+"\t"+tenTG+"\t"+soTrang;
    }
    public double getGia()
    {
        if(soTrang<200) return 200*soTrang*0.95;
        else return 200*soTrang*0.9;
    }
}