
package roma_odev_v3;


public class RomaRakami {
    public String sembol;
    public int deger;
    
    RomaRakami(String sembol){
        this.sembol = sembol;      
    }
    
    public String get_sembol(){
        return sembol;
    }
    
    public int get_deger(){
        return deger;
    }
    
    public void set_deger(int deger){
       this.deger= deger;
    }
 
}
