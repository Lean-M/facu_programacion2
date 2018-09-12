package tp4.CoperativaCeleales;

import java.util.ArrayList;

public class Lote {
    private ArrayList<String> minerales;
    private double superficie;

    public Lote(double superficie) {
        this.superficie = superficie;
    }

    public ArrayList<String> getMinerales() {
        return minerales;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setMinerales(String m) {
        
        if(!tieneMineral(m)){
            this.minerales.add(m);
        }
        
    }
    
    public boolean tieneMineral(String m){
        int i=0;
        
        while(i<this.minerales.size()){
            if(this.minerales.get(i).equals(m)){
                return true;
            }
            i++;
        }
        
        return false;
    }
    
}
