
package roma_odev_v3;


public class Donusturucu {
       
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
    
    public int donusturme(String x){
      int deger = 0;
      char s_deger[] = new char[2];
       if(x.length()>1){
           for(int i = 0; i < x.length();i++){
               if(i+1<x.length() && deger(x.charAt(i))<deger(x.charAt(i+1))){
                       s_deger[0] = x.charAt(i);
                       s_deger[1] = x.charAt(i+1);
                       String deger_str = new String(s_deger);
                       deger = deger+ikili_degerler(deger_str);
                       i++;
               }
               else{
                  deger = deger+deger(x.charAt(i));
               }
           }   
           return deger;
       }
       return deger(x.charAt(0));
    }
    
    // GIRILEN ROMA RAKAMININ DEGERINI BU FONKSIYONA SOKUP CIKAN STRING DEGERIYLE GIRDIYI KARSILASTIRIYORUM AYNI DEILLERSE BASAMAK HATASI VAR.
    public String s_donusturme(int x){
        String donen = "";     
        String ekleme;
        while(x>0){
            while(x>=1000){
                x=x-1000;
                ekleme="M";
                donen = donen+ekleme;
            }
            if(x>=900){
                x=x-900;
                ekleme="CM";
                donen = donen+ekleme;
            }
            if(x>=500){
                x=x-500;
                ekleme="D";
                donen=donen+ekleme;
            }
            if(x>=400){
                x=x-400;
                ekleme="CD";
                donen = donen+ekleme;
            }
            while(x>=100){
                x=x-100;
                ekleme="C";
                donen=donen+ekleme;
            }
            if(x>=90){
                x=x-90;
                ekleme="XC";
                donen=donen+ekleme;
            }
            if(x>=50){
                x=x-50;
                ekleme="L";
                donen=donen+ekleme;
            }
            if(x>=40){
              x=x-40;
              ekleme="XL";
              donen=donen+ekleme;
            }
            while(x>9){
                x=x-10;
                ekleme="X";
                donen = donen+ekleme;
            }
            if(x>=9){
                x=x-9;
                ekleme="IX";
                donen = donen+ekleme;
            }
            if(x>=5){
                x=x-5;
                ekleme="V";
                donen=donen+ekleme;
            }
           if(x>=4){
               x=x-4;
               ekleme="IV";
               donen = donen+ekleme;
           }
           while(x>0){
               x=x-1;
               ekleme="I";
               donen=donen+ekleme;
               if(x==0){
                   return donen;
               }
           }
        }
        return donen;
    }
    
    
    
}

