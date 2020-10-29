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
public class TaiLieu implements Comparable{
    private String Ma,nxBan;
    private int soBan;
    public TaiLieu()
    {
        
    }
    public TaiLieu(String Ma, String nxBan,int soBan)
    {
        this.Ma=Ma;
        this.nxBan=nxBan;
        this.soBan=soBan;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getNxBan() {
        return nxBan;
    }

    public void setNxBan(String nxBan) {
        this.nxBan = nxBan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    public int compareTo(Object o)
    {
        return Ma.compareToIgnoreCase(((TaiLieu) o).Ma);
    }
}
