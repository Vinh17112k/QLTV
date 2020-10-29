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
public class TapChi extends TaiLieu implements TinhAnPham{
    private int soPH,thang;
    public TapChi()
    {
        
    }
    public TapChi(String Ma, String nxBan,int soBan,int soPH, int thang)
    {
        super(Ma,nxBan,soBan);
        this.soPH=soPH;
        this.thang=thang;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }
    public double getGia()
    {
        if(thang<9) return 200*thang*0.95;
        else return 200*thang*0.9;
    }
    public String toString()
    {
        return getMa()+"\t"+getNxBan()+"\t"+getSoBan()+"\t"+soPH+"\t"+thang;
    }
}
