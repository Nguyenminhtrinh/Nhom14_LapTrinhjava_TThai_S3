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
/**
 *
 * @author Administrator
 */
public class VatTu implements Comparable<VatTu>{

    /**
     * @return the maLoai
     */
    public String getMaLoai() {
        return maLoai;
    }

    /**
     * @param maLoai the maLoai to set
     */
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    
    private String maVT = "";
    private String TenVT = "";
    private String DVT = "";
    private String maLoai = "";
   
    

    /**
     * @return the maVT
     */
    //constructor khong tham so
    public VatTu()
    {
    }
    //constructor co tham so
    public VatTu(String mavt, String tenvt, String dvt, String maloai) {
        maVT = mavt;
        TenVT = tenvt;
        DVT = dvt;
        maLoai = maloai;
    }
    public String getMaVT() {
        return maVT;
    }

    /**
     * @param maVT the maVT to set
     */
    public void setMaVT(String maVT) {
        this.maVT = maVT;
    }

    /**
     * @return the TenVT
     */
    public String getTenVT() {
        return TenVT;
    }

    /**
     * @param TenVT the TenVT to set
     */
    public void setTenVT(String TenVT) {
        this.TenVT = TenVT;
    }

    /**
     * @return the DVT
     */
    public String getDVT() {
        return DVT;
    }

    /**
     * @param DVT the DVT to set
     */
    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    /**
     * @return the slTon
     */
   
    String setMaVT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public int compareTo(VatTu vt) {
       return maVT.compareTo(vt.getMaVT());
    }
    
      public static ArrayList<VatTu> DSVT = new ArrayList<>();
    private static int index = -1;

    /**
     *
     */
    public static void ghi() {
        String sPath = "VatTu.txt";
        try {
            File f = new File(sPath);
            FileWriter fw = new FileWriter(f);
            for (VatTu PX : DSVT) {
                fw.write(PX.getMaVT() + "#" + PX.getTenVT() + "#" + PX.getDVT() + "#" + PX.getMaLoai() + "\r\n");
            }
            fw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return;
        }
    }

    public static void doc() {
          DSVT.clear();
        String sPath = "VatTu.txt";
        try {
            File f = new File(sPath);
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] s = line.split("#");
                   DSVT.add(new VatTu(s[0], s[1], s[2],s[3]));
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
        return DSVT.size();
    }

    public static void xoa() {
       DSVT.remove(index);
    }

    public static void them(VatTu PX) {
       DSVT.add(PX);
    }
   
    public static  void SapXep()
    {
        Collections.sort(DSVT);
        index =-1;
    }
    public static VatTu getPX() {
        try {
            return DSVT.get(index);
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
        VatTu.index = index;
    }

    public static void update(VatTu vt)
     {
         for(int i =0;i< DSVT.size();i ++)
         {
             if(DSVT.get(i).getMaVT().equals(vt.getMaVT()))
             {
                DSVT.get(i).setTenVT(vt.getTenVT());
                DSVT.get(i).setDVT(vt.getDVT());
                DSVT.get(i).setMaLoai(vt.getMaLoai());
             }
             
         }
     }

}
