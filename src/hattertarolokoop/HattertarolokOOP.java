
package hattertarolokoop;


public class HattertarolokOOP {


    public static void main(String[] args) {
 
        Fajl f1 = new Fajl("recept.docx",689);
        Fajl f2 = new Fajl("Tronok_Harca_HD_S01", 252327323);
        Fajl f3 = new Fajl ("Rossz_lanyok.avi",30000);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
        Hattertarolo piciHDD= new Hattertarolo(1500000);
        piciHDD.hozzaAd(f1);
        piciHDD.hozzaAd(f2);
        piciHDD.hozzaAd(f3);
        
        Floppy kisFloppy = new Floppy();
        System.out.println(kisFloppy.szabadKapacitas());
        kisFloppy.hozzaAd(f1);
        System.out.println(kisFloppy.listaz());
        System.out.println(kisFloppy.szabadKapacitas());
        
    }
    
}
