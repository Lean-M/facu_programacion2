package tp5.Zoologico;

public class COr extends Condicion{
    private Condicion c1;
    private Condicion c2;
    
    public COr(Condicion c1, Condicion c2){
        super();
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
    public boolean cumplir(ElementoAtributoMultiple e){
        if(this.c1.cumplir(e) || this.c2.cumplir(e)){
           return true; 
        }
        return false;
    }
}
