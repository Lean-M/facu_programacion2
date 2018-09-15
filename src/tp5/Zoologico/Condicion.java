package tp5.Zoologico;

public class Condicion {
    protected String nombre;
    protected Object valor;
    
    public Condicion(){}
    
    public Condicion(String n, Object v){
        this.nombre = n;
        this.valor = v;
    }
    
    public boolean cumplir(ElementoAtributoMultiple e){
        return false;
    }
}
