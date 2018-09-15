package tp5.Zoologico;

public class CIgual extends Condicion{
    
    public CIgual(String n, Object v){
        super(n,v);
    }
    
    @Override
    public boolean cumplir(ElementoAtributoMultiple e){
        return false;
    }
}
