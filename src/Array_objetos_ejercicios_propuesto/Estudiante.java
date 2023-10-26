package Array_objetos_ejercicios_propuesto;
public class Estudiante{
    private String NomApe;
    private int Code;
    private int semestre;
    private int NotaF;
    public Estudiante(String NomApe,int Code,int semestre,int NotaF){
        this.NomApe = NomApe;
        this.Code = Code;
        this.semestre = semestre;
        this.NotaF = NotaF;
    }
    public int getCode() {
        return Code;
    }
    public String getNomApe() {
        return NomApe;
    }
    public int getSemestre() {
        return semestre;
    }
    public int getNotaF() {
        return NotaF;
    }
}