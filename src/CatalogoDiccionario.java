import java.util.*;

public class CatalogoDiccionario {
    private final Map<String, String> diccionario;

    public CatalogoDiccionario() {
        diccionario = new HashMap<>();
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
    }

    public List<String> obtenerClavesAleatorias() {
        List<String> claves = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(claves);
        List<String> palabrasEscogidas = claves.subList(0,5);
        return claves;
    }
    System.out.println("Traduce las siguientes palabras al ingles: ");
    for (String)


}

