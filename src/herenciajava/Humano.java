/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciajava;

/**
 *
 * @author 1006845179
 */
public class Humano {
    private String nombre;
    public void comer (String nombre){
        System.out.println(nombre+"Esta comiendo desde la clase humano");
    }
    public void dormir (){
        System.out.println(nombre +"Esta durmiendo desde la clase humano");
    }
        public String getNombre(){
        return nombre;
    }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
}
