/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyvattu;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QL_VatTu {
    private ArrayList<VatTu> vatu = new ArrayList<>();
    private int index = 0;
    public void ThemSP (VatTu vt)
    {
        vatu.add(vt);
        index = vatu.size()-1;
    }
    public void XoaSP(VatTu vt)
    {
        for(int i = 0; i < vatu.size(); i++)
        {
             
            if(vatu.get(i).getTenVT().equals(vt.getTenVT()))
            {
                vatu.remove(i);
            }
        }
        if(index > vatu.size()-1)
            
                index= vatu.size()-1;
    }
    
   public void Truoc()
   {
       if(index == 0)
       {
           return ;
       }
       else
      index--;
   }
   public void Sau()
   {
       if(index > vatu.size())
       {
           return;
       }
       else
           index--;
   }
   public VatTu HienThi()
   {
       return vatu.get(index);
   }
   public String HienThiTT()
   {
       return (index+1)+"/"+vatu.size();
   }
}
