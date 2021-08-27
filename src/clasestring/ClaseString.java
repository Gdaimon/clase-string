package clasestring;

public class ClaseString {

    public static void main(String[] args) {

        // Declaracion
        String hola = "Hola Mundo";
        String adios = new String("Adios Mundo");
        char caracter = 'A';
        
       // System.out.println(hola);
       // System.out.println(adios);
        
        // Concatenacion + .concat()
       // System.out.println(hola + " " + adios + " " +caracter);
        
        for(int index = 0; index < hola.length(); index++){
            System.out.print(hola.charAt(index));
        }
        System.out.println("");
        
        // Metodos
        int cantidad = hola.length();
        System.out.println(cantidad);
        
        boolean existe = hola.contains("hola");
        System.out.println(existe);
        
        // Minusculas
        System.out.println(hola.toLowerCase());
        // Mayusculas
        System.out.println(hola.toUpperCase());
        
        existe = hola.toLowerCase().contains("hola");
        System.out.println(existe);
        
        // Concatenacion
        String nombre = "Bruce" + "Wayne";
        System.out.println(nombre);
        
        nombre = nombre.concat("es batman");
        System.out.println(nombre);
        System.out.println(nombre.concat(" es batman"));
        

        
        //System.out.println(stringBuilder);
        System.out.println(union(nombre));
        
        boolean inicia  = nombre.startsWith("B");
        System.out.println(inicia);
        
        boolean finaliza  = nombre.endsWith("a");
        System.out.println(finaliza);
        
        System.out.println("  Hola  ".trim());
        System.out.println("  Hola  ".replace("o", "e"));
        
        // Formato
        float valor = 10.824578f;
        String mensaje = String.format("%.2f", valor);
        System.out.println(mensaje);
        System.out.printf("%.2f", valor);
        
        // Comparacion
        String cadena1 = new String("Hola");
        String cadena2 = "hola";
        System.out.println(cadena1);
        System.out.println(cadena2);
        // Comparacion
        System.out.println(cadena1.equals(cadena2));
        // Comparacion ignorando mayusculas
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        
    }
    
    public static String union (String name){
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bruce");
        stringBuilder.append(" ").append("Wayne");
        return stringBuilder.toString();
    }
    
}
