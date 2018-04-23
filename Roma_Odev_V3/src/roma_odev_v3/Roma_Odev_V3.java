
package roma_odev_v3;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class Roma_Odev_V3 {


    public static void main(String[] args) {       
        
        String girdi = "ZoSo";
        Donusturucu donusturucu1 = new Donusturucu();
        Kontrolcu kontrolcu1 = new Kontrolcu();
       
  
     try {
        girdi = JOptionPane.showInputDialog("Toplanicak Olan Ilk Roma Rakamini Giriniz");
     }
     catch(HeadlessException e){
         System.out.println("Programi Kapattiniz veya Beklenmedik Bir Hata Olustu");
         System.exit(0);
     }
    
     try{
     while(kontrolcu1.rakamlar_dogrumu(girdi)==false || kontrolcu1.rakamlar_uyusuyomu(girdi)==false ||girdi.equals(donusturucu1.s_donusturme(donusturucu1.donusturme(girdi))) == false || donusturucu1.donusturme(girdi) > 3000  ){
          JOptionPane.showMessageDialog(null,"Roma Rakami Girisinizde Bir Hata Var Lutfen Tekrar Giriniz.","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
        girdi = JOptionPane.showInputDialog("Ilk Roma Rakamini Giriniz");
     }
     }  
     catch(Exception e){
          System.out.println("Programi Kapattiniz veya Beklenmedik Bir Hata Olustu");
          System.exit(0);
      }
        
     RomaRakami roma1 = new RomaRakami(girdi);
     roma1.set_deger(donusturucu1.donusturme(girdi));
     System.out.println("Ilk Roma Rakaminin Degeri = "+donusturucu1.donusturme(girdi));
     System.out.println("Ilk Roma Rakaminin Gosterilisi = "+girdi);
    
     
     
     try {
        girdi = JOptionPane.showInputDialog("Toplanicak Olan Ikinci Roma Rakamini Giriniz");
     }
     catch(HeadlessException e){
         System.out.println("Programi Kapattiniz veya Beklenmedik Bir Hata Olustu");
         System.exit(0);
     }

     try{
     while(kontrolcu1.rakamlar_dogrumu(girdi)==false || kontrolcu1.rakamlar_uyusuyomu(girdi)==false ||girdi.equals(donusturucu1.s_donusturme(donusturucu1.donusturme(girdi))) == false || donusturucu1.donusturme(girdi)> 3000){
          JOptionPane.showMessageDialog(null,"Roma Rakami Girisinizde Bir Hata Var Lutfen Tekrar Giriniz.","HATALI GIRIS",JOptionPane.INFORMATION_MESSAGE);
        girdi = JOptionPane.showInputDialog("Ikinci Roma Rakamini Giriniz");
     }
     }  
     catch(Exception e){
          System.out.println("Programi Kapattiniz veya Beklenmedik Bir Hata Olustu");
          System.exit(0);
      }
   
     RomaRakami roma2 = new RomaRakami(girdi);
     roma2.set_deger(donusturucu1.donusturme(girdi));
     System.out.println("\nIkinci Roma Rakaminin Degeri = "+roma2.get_deger());
     System.out.println("Ikinci Roma Rakaminin Gosterilisi = "+roma2.get_sembol());
     
     
     RomaRakami roma3 = new RomaRakami(donusturucu1.s_donusturme(roma1.deger+roma2.deger));
     roma3.set_deger(roma1.deger+roma2.deger);
     System.out.println("\nToplam Roma Rakaminin Degeri = "+roma3.get_deger());
     System.out.println("Roma Rakaminin Gosterilisi = "+ roma3.get_sembol());
     
            
   }
   }
  

