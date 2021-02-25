import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guardarropa guardarropa = new Guardarropa();
        List<Prenda> lista1 = new ArrayList<>();
        List<Prenda> lista2 = new ArrayList<>();
        Prenda prenda1 = new Prenda("COOK", "Top");
        Prenda prenda2 = new Prenda("MARKOVA", "Sweater");
        Prenda prenda3 = new Prenda("CHECA", "Jean");
        lista1.add(0, prenda1);
        lista1.add(1, prenda2);
        lista2.add(0, prenda3);

        Integer identificador1 = guardarropa.guardarPrendas(lista1);
        System.out.println("Las primeras prendas se guardaron con el identificador " + identificador1);
        Integer identificador2 = guardarropa.guardarPrendas(lista2);
        System.out.println("Las segundas prendas se guardaron con el identificador " + identificador2);
        System.out.println();

        System.out.println("Listado actual de prendas: ");
        guardarropa.mostrarPrendas();
        System.out.println();

        System.out.println("Devolviendo prendas con el identificador 0...");
        List<Prenda> prendasDevueltas = guardarropa.devolverPrendas(0);
        System.out.println("Prendas devueltas: " + prendasDevueltas.toString());
        System.out.println();

        System.out.println("Listado actual de prendas luego de la devolucion: ");
        guardarropa.mostrarPrendas();
    }
}
