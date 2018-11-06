
package hattertarolokoop;

 class Fajl {
    
     private String nev;
     private int meret;

    public Fajl(String nev, int meret) {
        this.nev = nev;
        this.meret = meret;
    }
    
    public String getNev(){
        return nev;
    }
    public int getbMeret(){
        return this.meret*1024;
    
    }
     public int getKbMeret(){
        return this.meret;
    
    }
    public int getMbMeret(){
        return this.meret/1024;
    
    }
    public int getGbMeret(){
        return this.getMbMeret()/1024;
    }
    
    public String normalizaltMeret(){
        if (this.getGbMeret()>1) {
            return this.getGbMeret()+"GB";
        }
        else if (this.getMbMeret()>1) {
            return this.getMbMeret()+"MB";
        }
        else if (this.getKbMeret()>1) {
            return this.getKbMeret()+"KB";
        }
        else return this.getbMeret()+"b";  
        
    }
    
    
    
    @Override
     public String toString(){
     
         return String.format("%-25s %12s",this.nev,this.normalizaltMeret());
     
     }
     
}
