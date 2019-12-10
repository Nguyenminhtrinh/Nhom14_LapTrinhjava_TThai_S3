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
import static quanlyvattu.HoaDon.sPath;

/**
 *
 * @author Administrator
 */
public class LoaiVT implements Comparable<LoaiVT> {

    /**
     * @return the key
     */
   
    private String maLoai = " ";
    private String tenLoai = " ";
    static String sPath = "";
   
    /**
     * @return the maLoai
     */
    public LoaiVT(String maloai, String tenloai) {
        this.maLoai = maloai;
        this.tenLoai = tenloai;
        
    }
    public String getMaLoai() {
        return maLoai;
    }

    /**
     * @param maLoai the maLoai to set
     */
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    /**
     * @return the tenLoai
     */
    public String getTenLoai() {
        return tenLoai;
    }

    /**
     * @param tenLoai the tenLoai to set
     */
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    
    @Override
    public int compareTo(LoaiVT Loaivt) {
        return maLoai.compareTo(Loaivt.getMaLoai());
    }
    
     public static ArrayList<LoaiVT> DSLOAIVT = new ArrayList<>();
    private static int index = -1;

    /**
     *
     */
    public static void ghi() {
       
        try {
            File f = new File(sPath);
            FileWriter fw = new FileWriter(f);
            for (LoaiVT SP : DSLOAIVT) {
                fw.write(SP.getMaLoai()+ "#" + SP.getTenLoai()+ "\r\n");
            }
            fw.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return;
        }
    }

    public static void doc() {
       DSLOAIVT.clear();
       
        try {
            File f = new File(sPath);
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] s = line.split("#");
                   DSLOAIVT.add(new LoaiVT(s[0], s[1]));
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
        return DSLOAIVT.size();
    }

    public static void xoa() {
       DSLOAIVT.remove(index);
    }

    public static void them(LoaiVT SP) {
        DSLOAIVT.add(SP);
    }

    public static LoaiVT getSP() {
        try {
            return DSLOAIVT.get(index);
        } catch (Exception ex) {
            return null;
        }
    }

    public static void SapXep()
    {
        Collections.sort(DSLOAIVT);
        index = -1;
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
        LoaiVT.index = index;
    }
    
     public static void update(LoaiVT vt)
     {
         for(int i =0;i< DSLOAIVT.size();i ++)
         {
             if(DSLOAIVT.get(i).getMaLoai().equals(vt.getMaLoai()))
             {
                DSLOAIVT.get(i).setMaLoai(vt.getMaLoai());
                DSLOAIVT.get(i).setTenLoai(vt.getTenLoai());
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
}
       

   
    
    

