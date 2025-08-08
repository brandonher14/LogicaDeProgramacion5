import java.util.*;

public class CatalogoDiccionario {

    public static void main(String[] args) {


     HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("escuela", "school");
        diccionario.put("maestro", "teacher");
        diccionario.put("amigo", "friend");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("familia", "family");
        diccionario.put("carro", "car");
        diccionario.put("trabajo", "work");
        diccionario.put("juego", "game");
        diccionario.put("niño", "child");
        diccionario.put("ciudad", "city");
        diccionario.put("música", "music");


    List<String> claves = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(claves); // Mezclar aleatoriamente
    List<String> cincoPalabras = claves.subList(0, 5);
    //Instruccion al usuario
        System.out.println("Traduce al inglés las siguientes palabras en español:");
        for (String palabra : cincoPalabras) {
            System.out.println("- " + palabra);
        }
        Scanner sc = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        for (String palabraEsp : cincoPalabras) {
            System.out.print("Traducción al inglés de '" + palabraEsp + "': ");
            String respuestaUsuario = sc.nextLine().trim();

            String traduccionCorrecta = diccionario.get(palabraEsp);

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("Correcto");
                correctas++;
            } else {
                System.out.println("Incorrecto");
                incorrectas++;
            }
        }

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("correctas: " + correctas);
        System.out.println(" incorrectas: " + incorrectas);
    }
}




