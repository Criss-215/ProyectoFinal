
/**
 * Write a description of class Arcilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.Serializable;
public class Arcilla extends Insumo implements Serializable
{
    public Arcilla(int cant,double precio){
        super(cant,"Arci",precio);
    }
    
}
