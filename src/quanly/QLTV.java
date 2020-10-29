/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;
import document.TaiLieu;
import document.Sach;
import document.TapChi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Quang Vinh
 */
public class QLTV implements QLChucNang{
    private List<TaiLieu> list;
    private Scanner in;
    public QLTV()
    {
        list =new ArrayList<>();
        in=new Scanner(System.in);
        list.add(new Sach("AT942","Kim Dong",123,"Bien Ca","Kim Lan",232));
        list.add(new Sach("ST942","Bao Moi",423,"Tuoi Tre","Van Xuan",423));
        list.add(new Sach("KT942","Kim Dong",393,"Nui Song","Nam Cao",974));
        list.add(new Sach("UP942","Thoi Dai",473,"Dau Bep","Van Cao",423));
        list.add(new TapChi("RT234","Kim Dong",324,5,6));
    }
    private boolean getTaiLieuByMa(String ID)
    {
        for(TaiLieu i:list)
            if(i.getMa().equalsIgnoreCase(ID))
                return true;
        return false;
    }
    public TaiLieu Doc()
    {
        String Ma, nxBan;
        int soBan;
        while(true)
        {
            System.out.print("Ma: ");
            Ma=in.nextLine().toUpperCase();
            if(Ma.matches("^[A-Z]{2}\\d{3}")&&(!getTaiLieuByMa(Ma))) 
                break;
            else 
                System.out.println("Nhap lai");
        }
        System.out.print("NXB: ");
        nxBan=in.nextLine();
        System.out.print("so ban: ");
        soBan=Integer.parseInt(in.nextLine());
        return new TaiLieu(Ma, nxBan,soBan);
    }
    @Override
    public void nhapSach()
    {
        TaiLieu d=Doc();
        String tenS,tenTG;
        int soTrang;
        System.out.print("ten sach");
        tenS=in.nextLine();
        System.out.print("ten TG: ");
        tenTG=in.nextLine();
        System.out.print("so trang: ");
        soTrang=Integer.parseInt(in.nextLine());
        Sach b=new Sach(d.getMa(),d.getNxBan(),d.getSoBan(),tenS,tenTG,soTrang);
        list.add(b);
    }
    @Override 
    public void vietDS()
    {
        System.out.println("Ma\tNXB\tso ban\ttenS\ttenTG\tsotrang");
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) instanceof Sach)
                System.out.println(list.get(i).toString());
        }
        System.out.println("Ma\tNXB\tso ban\tsoPH\tthang");
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) instanceof TapChi)
                System.out.println(list.get(i).toString());
        }
    }
    private int getVTMa(String Ma)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getMa().equalsIgnoreCase(Ma))
                return i;
        }
        return -1;
    }
    @Override 
    public void xoa(String Ma)
    {
        int VT=getVTMa(Ma);
        if(VT==-1) System.out.println("khong tim thay");
        else
        {
            list.remove(VT);
        }
    }
    @Override
    public void sua(String Ma)
    {
        int VT=getVTMa(Ma);
        if(VT==-1) System.out.println("khong tim thay");
        else
        {
            Sach b = (Sach) list.get(VT);
            System.out.print("ten sach: ");
            String tenMoi = in.nextLine();
            b.setTenS(tenMoi);
            System.out.print("ten TG: ");
            String tenTG=in.nextLine();
            b.setTenTG(tenTG);
            System.out.print("so Trang");
            int soTrang=Integer.parseInt(in.nextLine());
            b.setSoTrang(soTrang);
            System.out.println("sua thanh cong");
        }
    }
    @Override
    public void tkTheoMa(String Ma)
    {
        int VT=getVTMa(Ma);
        if(VT==-1) System.out.println("khong tim thay");
        else
        {
            System.out.println(list.get(VT).toString());
        }
    }
    @Override 
    public void tkTheoNXB(String ten)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getNxBan().indexOf(ten)>=0)
                System.out.println(list.get(i).toString());
        }
    }
    @Override
    public void tkTheoSoBan(int start, int end)
    {
        for(int i=0;i<list.size();i++)
        {
            if((list.get(i).getSoBan()>=start)&&(list.get(i).getSoBan()<=end))
                System.out.println(list.get(i).toString());
        }
    }
    @Override 
    public void sxTheoMa()
    {
        Collections.sort(list);
    }
    public void sxTheoNXB()
    {
        Collections.sort(list,new Comparator<TaiLieu>(){//sap xep theo ten
           @Override
           public int compare(TaiLieu d1,TaiLieu d2)
           {
               return d1.getNxBan().compareToIgnoreCase(d2.getNxBan());
           }
        });
    }
    //launcher gun321 huyen thoai
    public void sxTheoSoBan()
    {
        Collections.sort(list,new Comparator<TaiLieu>()
        {
            @Override
            public int compare(TaiLieu d1,TaiLieu d2) //so sanh co dieu kien
            {
                return d1.getSoBan()-d2.getSoBan();//lon hon khong thi sap xep tang 
                //nguoc lai xap xep giam
            }
        });
        
    }
}
