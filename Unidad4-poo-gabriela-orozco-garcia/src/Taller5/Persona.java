package Taller5;

 class Persona {

     private String nombre;
     int edad;

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }


     class PruebaPersona {
         public static void main(String[] args) {
             Persona persona = new Persona();

             // Se puede acceder a edad porque es default
             persona.edad = 21;
             System.out.println("Edad: " + persona.edad);

             // No se puede acceder a nombre porque es private
             // p.nombre = "Gabriela";

             // Se puede acceder a nombre mediante el get y el set
             persona.setNombre("Gabriela");
             System.out.println("Nombre: " + persona.getNombre());
         }
     }
 }
