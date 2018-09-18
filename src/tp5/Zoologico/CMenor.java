package tp5.Zoologico;

public class CMenor extends Condicion{
    
    public CMenor(String n, Object v){
        super(n,v);
    }
    
    @Override
    public boolean cumplir(ElementoAtributoMultiple e){
        if((double)this.valor > (double)e.getAtributo().get(this.nombre)){
            return false;
        }else{
            return true;
        }
    }
}
