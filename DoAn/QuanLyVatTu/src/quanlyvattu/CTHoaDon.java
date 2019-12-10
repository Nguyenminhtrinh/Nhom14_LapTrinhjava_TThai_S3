/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyvattu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;
import javax.swing.JFileChooser;
/**
 *
 * @author Administrator
 */
public class CTHoaDon implements Comparable<CTHoaDon>{

    String slBan;
     String donGia;
     String soHD;
     String maVT;
     HoaDon hoadon;
     VatTu vattu;
     String ThanhTien;
    
    

    /**
     * @return the ThanhTien
     */
    public String getThanhTien() {
        int temp = Integer.parseInt(getDonGia()) * Integer.parseInt(getSlBan());
        ThanhTien = String.valueOf(temp);
        return ThanhTien;
    }

    /**
     * @param ThanhTien the ThanhTien to set
     */
    public void setThanhTien(String ThanhTien) {
        int temp = Integer.parseInt(getDonGia()) * Integer.parseInt(getSlBan());
        this.ThanhTien = String.valueOf(temp);
    }

    /**
     * @return the hoadon
     */
    public HoaDon getHoadon() {
        return hoadon;
    }

    /**
     * @param hoadon the hoadon to set
     */
    public void setHoadon(HoaDon hoadon) {
        this.hoadon = hoadon;
    }

    /**
     * @return the vattu
     */
    public VatTu getVattu() {
        return vattu;
    }

    /**
     * @param vattu the vattu to set
     */
    public void setVattu(VatTu vattu) {
        this.vattu = vattu;
    }

    /**
     * @return the slBan
     */
    public String getSlBan() {
        return slBan;
    }

    /**
     * @param slBan the slBan to set
     */
    public void setSlBan(String slBan) {
        this.slBan = slBan;
    }

    /**
     * @return the donGia
     */
    public String getDonGia() {
        return donGia;
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    /**
     * @return the soHD
     */
    public String getSoHD() {
        return soHD;
    }

    /**
     * @param soHD the soHD to set
     */
    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    /**
     * @return the maVT
     */
    public String getMaVT() {
        return maVT;
    }

    /**
     * @param maVT the maVT to set
     */
    public void setMaVT(String maVT) {
        this.maVT = maVT;
    }
     
    
//constructor khong tham so 
    public CTHoaDon()
    {
        
    }
    //constructor co tham so
    public CTHoaDon(String sohd,String mavt,String slban,String dongia)
    {
        
        this.soHD = sohd;
        this.maVT =mavt;
        this.slBan = slban;
        this.donGia = dongia;
    }
   
     @Override
    public int compareTo(CTHoaDon CT) {
       return slBan.compareTo(CT.getSlBan());
    } 
    
     public static ArrayList<CTHoaDon> DSCTHD = new ArrayList<>();
    private static int index = -1;

    /**
     *
     */
    public static void ghi() {
        String sPath = "CTHoaDon.txt";
        try {
            File f = new File(sPath);
            FileWriter fw = new FileWriter(f);
            for (CTHoaDon PX : DSCTHD) {
                fw.write(PX.getSoHD() + "#" + PX.getMaVT()+ "#" + PX.getSlBan()+ "#" + PX.getDonGia()+ "\r\n");
            }
            fw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return;
        }
    }

    public static void doc() {
           DSCTHD.clear();
        String sPath = "CTHoaDon.txt";
        try {
            File f = new File(sPath);
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] s = line.split("#");
                    DSCTHD.add(new CTHoaDon(s[0], s[1], s[2],s[3]));
                }
                br.close();
                fr.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return;
        }
    }

    public static int lenth() {
        return DSCTHD.size();
    }

    public static void xoa() {
        DSCTHD.remove(index);
    }

    public static void them(CTHoaDon PX) {
        DSCTHD.add(PX);
    }
 public static void SapXep()
 {
     Collections.sort(DSCTHD);
     index = -1;
 }
    public static CTHoaDon getPX() {
        try {
            return DSCTHD.get(index);
        } catch (Exception ex) {
            return null;
        }
       
    }
     public static int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public static void setIndex(int index) {
        CTHoaDon.index = index;
    }

    /**
     *
     * @return
     */
   
    
    
    public static void update(CTHoaDon hd)
     {
         for(int i =0;i< DSCTHD.size();i ++)
         {
             if(DSCTHD.get(i).getSoHD().equals(hd.getSoHD()))
             {
                DSCTHD.get(i).setSlBan(hd.getSlBan());
               DSCTHD.get(i).setDonGia(hd.getDonGia());
               
             }
             
         }
     }
   
    
}
