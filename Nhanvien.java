/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class Nhanvien 
{
    String Ten;
    int tuoi;
    String diaChi;
    double tienluong;
    int tongGiolam;
    
    
    public Nhanvien()
    {
        
    }
    
     public Nhanvien(String Ten, int tuoi, String diaChi, double tienluong, int tongGiolam)
    {
        this.Ten = Ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienluong = tienluong;
        this.tongGiolam = tongGiolam;
    }
     public String getTen()
    {
         return Ten;
    }
     public int getuoi()
     {
         return tuoi;
     }
     public String getdiaChi()
     {
         return diaChi;
     }
     public double gettienluong()
     {
         return tienluong;
     }
     public int gettongGiolam()
     {
         return tongGiolam;
     }
     
     public void setTen(String Ten)
     {
         this.Ten = Ten;
     }
     public void settuoi(int tuoi)
     {
         this.tuoi=tuoi ;
     }
     public void  setdiaChi(String diaChi)
     {
         this.diaChi=diaChi;
     }
     public void settienluong(double tienluong)
     {
         this.tienluong= tienluong;
     }
     public void settongGiolam(int tongGiolam)
     {
         this.tongGiolam = tongGiolam;
     }
     public String thongtin()
     {
         return  "Ten " + Ten + "; Tuoi " + tuoi + "; Đia chi " + diaChi + "; Tien luong " + tienluong + "; Tong gio lam " + tongGiolam;
     }
     public double tienthuong()
    {
     
         if (tongGiolam>=200) return tienluong *0.2;
         else if (tongGiolam>=100 && tongGiolam< 200) return tienluong *0.1 ;
         return 0;
    }
}
