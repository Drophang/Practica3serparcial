package Array_objetos_ejercicios_propuesto;
import java.util.ArrayList;
import java.util.Scanner;

public class Clace{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Estudiante> C = new ArrayList();
    int M;
    Boolean repetido = false;
    do {
        System.out.println("¿Que desea hacer?");
        System.out.println("1)Añadir estudiante");
        System.out.println("2)Buscar Estudiante");
        M = sc.nextInt();
        switch (M){
            case 1:
            repetido = false;
            System.out.print("inserte el nombre");
            String nom = sc.nextLine();
            System.out.print("inserte el codigo (no puede ser repetido)");
            int cod = sc.nextInt();
            System.out.println("inserte el semestre en el que se encuentra");
            int sem = sc.nextInt();
            System.out.println("ingrese su nota Final");
            int Not = sc.nextInt();
            Estudiante NE = new Estudiante(nom, cod, sem, Not);
            for(int i = 0;i <  C.size();i++){
                if(C.get(i).getCode() == cod){
                    repetido = true;
                }
            }
            if(repetido == true){
                System.out.println("Codigo repetido no se puede ingresar al estudiante");
            }else{
                C.add(NE);
            }
            repetido = false;
            break;
            case 2:
            System.out.println("Inserte el codigo del estudiante");
            int serch = sc.nextInt();
            for(int i = 0;i <  C.size();i++){
                if(C.get(i).getCode() == serch){
                    repetido = true;
                    System.out.println("Nombre " + C.get(i).getNomApe() + " Semestre " + C.get(i).getSemestre()+ " Nota " + C.get(i).getNotaF());
                }
            }
            if(repetido = false){
                System.out.println("No se encuentra ese estudiante");
            }
            repetido = false;
            break;
        }
    } while (M<6);
}
}