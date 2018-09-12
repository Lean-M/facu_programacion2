package tp4.CoperativaCeleales;


public class Pastura extends Cereal{
    private double superficieMin;
    
    public Pastura(String nombre, double supMin){
        super(nombre);
        this.superficieMin = supMin;
    }
    
    @Override
    public boolean aceptaLote(Lote lote){
        if(lote.getSuperficie()<superficieMin){
            return false;
        }else{
            return super.aceptaLote(lote);
        }
    }
    
}
