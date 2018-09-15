package tp5.Zoologico;

public class Jaula extends ElementoAtributoMultiple{
    private static int contador = 1;
    
    public Jaula(){
        super();
        this.setAtributo("posicion", new Integer(contador));
        contador++;
    }
    
    @Override
    public boolean acepta(ElementoAtributoMultiple e){
        if(e.acepta(this)){
            return true;
        }
        
        return false;

    }
}
