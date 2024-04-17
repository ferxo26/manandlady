
package herenciajava;


public class Herenciajava {

    
    public static void main(String[] args) {
        // crear objeto clase padre
        Humano adulto=new Humano();
        adulto.setNombre("juan");
        adulto.comer(adulto.getNombre());
        adulto.dormir(); 
        System.out.println();
        //crear objeto Clase hija -> hombre
        Hombre padre=new Hombre();
        padre.setNombre("juan");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        System.out.println();
         //crear objeto clase hija-> mujer
        Mujer madre=new Mujer();
        madre.setNombre("gloria");
       madre.comer(madre.getNombre());
       madre.dormir();
       madre.maquillarse(madre.getNombre());
    }
    
}
