package tp5.Zoologico;

import java.util.Map;

public class Animal extends ElementoAtributoMultiple{
    private Condicion condiciones;
    
    public Animal(Condicion c){
        super();
        this.condiciones = c;
    }
    
    @Override
    public boolean acepta(ElementoAtributoMultiple e){
        if(this.condiciones.cumplir(e)){
            return true;
        }
        
        return false;
    }
}
