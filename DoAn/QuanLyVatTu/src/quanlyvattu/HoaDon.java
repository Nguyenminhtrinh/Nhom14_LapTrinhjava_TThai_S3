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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    private String soHD;
    private String ngayHD;
    private String khachHang;
    private String NhanVien;
    static String sPath = "";
    public HoaDon()
    {
        
    }
    public HoaDon(String sohd,String ngayhd,String khachhang,String nhanvien)
    {
        this.soHD = sohd;
        this.ngayHD = ngayhd;
        this.NhanVien = nhanvien;
        this.khachHang = khachhang;
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
     * @return the ngayHD
     */
    public String getNgayHD() {
        return ngayHD;
    }

    /**
     * @param ngayHD the ngayHD to set
     */
    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    /**
     * @return the khachHang
     */
    public String getKhachHang() {
        return khachHang;
    }

    /**
     * @param khachHang the khachHang to set
     */
    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }

    /**
     * @return the NhanVien
     */
    public String getNhanVien() {
        return NhanVien;
    }

    /**
     * @param NhanVien the NhanVien to set
     */
    public void setNhanVien(String NhanVien) {
        this.NhanVien = NhanVien;
    }
    
    public static ArrayList<HoaDon> DSHD = new ArrayList<>();
    private static int index = -1;

    /**
     *
     */
    public static void ghi() {
        try {
            File f = new File(sPath);
            FileWriter fw = new FileWriter(f);
            for (HoaDon SP : DSHD) {
                fw.write(SP.getSoHD()+ "#" + SP.getNgayHD()+ "#" + SP.getKhachHang() + "#" + SP.getNhanVien()+ "\r\n");
            }
            fw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return;
        }
    }

    public static void doc() {
        DSHD.clear();
        try {
            File f = new File(sPath);
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] s = line.split("#");
                    DSHD.add(new HoaDon(s[0], s[1], s[2], s[3]));
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
        return DSHD.size();
    }

    public static void xoa() {
        DSHD.remove(index);
    }

    public static void them(HoaDon SP) {
        DSHD.add(SP);
    }

    public static HoaDon getSP() {
        try {
            return DSHD.get(index);
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * @return the index
     */
    public static int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public static void setIndex(int index) {
        HoaDon.index = index;
    }
    
     public static void update(HoaDon hd)
     {
         for(int i =0;i< DSHD.size();i ++)
         {
             if(DSHD.get(i).getSoHD().equals(hd.getSoHD()))
             {
                DSHD.get(i).setNgayHD(hd.getNgayHD());
                DSHD.get(i).setKhachHang(hd.getKhachHang());
                DSHD.get(i).setNhanVien(hd.getNhanVien());
             }
             
         }
     }
     public static void Open()
    {
        JFileChooser c = new JFileChooser();
        int rVal;
        rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String filename = c.getSelectedFile().getName();
            String dir = c.getCurrentDirectory().toString();
            sPath = dir+"\\"+filename;
            doc();
        }
    }
       public static void Save()
    {
        JFileChooser c = new JFileChooser();
        int rVal;
        rVal = c.showSaveDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String filename = c.getSelectedFile().getName();
            String dir = c.getCurrentDirectory().toString();
            sPath = dir+"\\"+filename;
            ghi();
            JOptionPane.showMessageDialog(null, "Đã Lưu");
        }
    }
     
}
    
    

