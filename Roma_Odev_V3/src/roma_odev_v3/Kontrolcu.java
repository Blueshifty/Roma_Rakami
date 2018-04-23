
package roma_odev_v3;

import javax.swing.JOptionPane;


public class Kontrolcu {
      public int deger(char x){
        switch(x){
          case 'I':{
                return 1;
          }
          case 'V':{
                return 5;
          }
          case 'X':{
              return 10;
          }
          case 'L':{
              return 50;
          }
          case 'C':{
              return 100;
          }
          case 'D':{
              return 500;
          }
          case 'M':{
              return 1000;
          }
          default:
              return 0;
        }
    }
    
    public boolean roma_mi(char x){
        switch(x){
          case 'I':{
                return true;
          }
          case 'V':{
                return true;
          }
          case 'X':{
              return true;
          }
          case 'L':{
              return true;
          }
          case 'C':{
              return true;
          }
          case 'D':{
              return true;
          }
          case 'M':{
              return true;
          }
          default:
              return false;
        }
    }
        public int ikili_degerler(String x){
        switch(x){
            case "CM":{
                return 900;
            }
            case "CD":{
                return 400;
            }
            case "XC":{
                return 90;
            }
            case "XL":{
                return 40;
            }
            case "IX":{
                return 9;
            }
            case "IV":{
                return 4;
            }
    }
        return 0;
    }
    
    public boolean rakamlar_dogrumu(String x){
       for(int i = 0; i < x.length();i++){
           if(roma_mi(x.charAt(i)) == false ){
               JOptionPane.showMessageDialog(null,"Sadece 'I' 'V' 'X'  'L' 'C' 'D' 'M' Karekterlerinden Birini Girebilirsiniz","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
               return false; 
           }
       }
        return true;
}
    // BU METHOD ILK KONTROLCUM DAHA ETKILI BI YOL BULSAMDA , NERDE HATA YAPILDIGI CIKTISINI VEREBILIYOR DIYE BUNADA SOKUYORUM GELEN GIRDIYI
    public boolean rakamlar_uyusuyomu(String x){
        int cikartma_deger = 0;
        if(x.length()>1){
        for(int i = 0; i < x.length();i++){
          if(i+1 < x.length()){  
            if(deger(x.charAt(i))<deger(x.charAt(i+1))){
                if(deger(x.charAt(i)) != 1 && deger(x.charAt(i)) != 10 && deger(x.charAt(i)) != 100){
                      JOptionPane.showMessageDialog(null,"Sadece 'I', 'X', 'C' Karekterleri Cikarma Islemi Icin Kullanilabilir","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                    return false;
             }
             if(deger(x.charAt(i+1)) > 10*deger(x.charAt(i))){
                 JOptionPane.showMessageDialog(null,"Bir Sayiyi Kendisinin 10 Katından Daha Buyuk Olan Bir Sayidan Cikartamazsiniz.","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                 return false;
           }
           int  y=i;
           cikartma_deger = deger(x.charAt(i+1));
           while(y+2 <x.length() && deger(x.charAt(y+2))>=deger(x.charAt(y+1))){
               cikartma_deger = cikartma_deger + deger(x.charAt(y+2));
               if(cikartma_deger> 10*deger(x.charAt(i))){
                  JOptionPane.showMessageDialog(null,"Bir Sayiyi Kendisinin 10 Katından Daha Buyuk Olan Bir Sayidan Cikartamazsiniz.","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                 return false; 
               }
               y++;
           } 
        }
         if(i<x.length()-2){
            if(deger(x.charAt(i))<deger(x.charAt(i+2))&& deger(x.charAt(i+1))<deger(x.charAt(i+2))){
                  JOptionPane.showMessageDialog(null,"Bir Sayidan Sadece Bir Tane Sayi Cikartilabilir","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                 return false;
            }
         } 
          if(i < x.length()-3){
           if(x.charAt(i)== x.charAt(i+1) && x.charAt(i)==x.charAt(i+2) && x.charAt(i)==x.charAt(i+3)){
              JOptionPane.showMessageDialog(null,"Bir Harf En Fazla 3 Kere Tekrar Edebilir.","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
               return false;
            }
            }
    }
        return true;
    }         
}
  return true;
}
    
    /*  ILK BASAMAK KONTROLCUM OLARAK BOYLE BISEY DUSUNMUSTUM.
       ARTIK GIRILEN DEGERDEKI ROMA RAKAMINI KENDIM UGRETIP KARSILASTIRIYORUM.
    public boolean basamaklar_dogrumu(String x){
        if(x.contains("M")){
            if(x.contains("D")){
                if(x.indexOf("M")>x.indexOf("D")){
                    JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA M DEN ONCE D YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
                }
            }
            if(x.contains("L")){
                if(x.indexOf("M")>x.indexOf("L")){
                     JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA M DEN ONCE L YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
                }
            }
            if(x.contains("V")){
                if(x.indexOf("M")>x.indexOf("V")){
                    JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA M DEN ONCE V YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
                }
            }
            if(x.contains("X")){
                if(x.indexOf("M")>x.indexOf("X")){
                   JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA M DEN ONCE X YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;  
                }
            }
            if(x.contains("I")){
                if(x.indexOf("M")> x.indexOf("I")){
                    JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA M DEN ONCE I YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
                }
            }
        }
      if(x.contains("D")){
          if(x.contains("L")){
              if(x.indexOf("D")>x.indexOf("L")){
                    JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA D DEN ONCE L YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
              }
          }
          if(x.contains("X")){
              if(x.indexOf("D")>x.indexOf("X")){
                   JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA D DEN ONCE X YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
              }
          }
         if(x.contains("V")){
             if(x.indexOf("D")>x.indexOf("V")){
                   JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA D DEN ONCE V YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
             }
         }
         if(x.contains("I")){
             if(x.indexOf("D")>x.indexOf("I")){
                   JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA D DEN ONCE I YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                   return false;
             }
         }
      }  
      if(x.contains("C")){
          if(x.contains("L")){
              if(x.indexOf("C")>x.indexOf("L")){
                  JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA C DEN ONCE L YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                  return false;
              }
          }
          if(x.contains("V")){
              if(x.indexOf("C")>x.indexOf("V")){
                  JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA C DEN ONCE V YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                  return false;
          }
      }
          if(x.contains("I")){
              if(x.indexOf("C")>x.indexOf("I")){
                  JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA C DEN ONCE I YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                  return false;   
              }
          }
    }
      if(x.contains("X")){
          if(x.contains("V")){
              if(x.indexOf("X")>x.indexOf("V")){
                  JOptionPane.showMessageDialog(null,"ROMA RAKAMLARINDA X DEN ONCE V YAZILAMAZ","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
                  return false;  
              } 
              }
          }
      return true;
      }
    */
}
