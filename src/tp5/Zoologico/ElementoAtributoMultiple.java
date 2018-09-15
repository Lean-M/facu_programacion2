package tp5.Zoologico;

import java.util.HashMap;

public class ElementoAtributoMultiple {
    private HashMap atributo;
    
    public ElementoAtributoMultiple(){
        this.atributo = new HashMap();
    }
    
    public void setAtributo(String nombre, Object valor){
        this.atributo.putIfAbsent(nombre, valor);
    }
    
    public ElementoAtributoMultiple get(String nombre){
        return (ElementoAtributoMultiple)this.atributo.get(nombre);
    }
    
    public boolean acepta(ElementoAtributoMultiple e){
        return false;
    }
}
