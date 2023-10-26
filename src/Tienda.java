import java.util.ArrayList;
public class Tienda{
    String Nombre;
    String Propietario;
    int identificador;
    ArrayList<Computadoras> C = new ArrayList();
    public Tienda(String Nombre,String Propietario,int identificador){
        this.Nombre = Nombre;
        this.Propietario = Propietario;
        this.identificador = identificador;
        this.C = C;
    }
    public void addcomputador1(){
        Computadoras compu1 = new Computadoras ("pepe",1.000,"core","Mac",500);
        C.add(compu);
    }
    public void addcomputador2(){
        Computadoras compu2 = new Computadoras ("pro",2.000,"itm","Mac",500);
        C.add(compu);
    }
}