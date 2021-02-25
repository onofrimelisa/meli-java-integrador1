import java.util.*;

public class Guardarropa {
    private Integer contador;
    private Map<Integer, List<Prenda>> diccionarioPrendas;

    public Guardarropa() {
        this.contador = 0;
        this.diccionarioPrendas = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        diccionarioPrendas.put(this.contador, listaDePrendas);
        return this.contador++;
    }

    public void mostrarPrendas() {
        diccionarioPrendas.entrySet().forEach(entry->{
            System.out.println("Identificador " +
                    entry.getKey() +
                    ": " +
                    entry.getValue());
        });
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return this.diccionarioPrendas.remove(numero);
    }
}
