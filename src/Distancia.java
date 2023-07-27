
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distancia {

    public Distancia() {
    }
    List<Punto> puntos = new ArrayList<>();
    List<Double> distancias = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void leerPuntos() {
        System.out.println("Ingrese la cantidad de puntos");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las coordenadas para el punto " + (i + 1) + ":");
            System.out.print("Coordenada x: ");
            int x = scanner.nextInt();
            System.out.print("Coordenada y: ");
            int y = scanner.nextInt();
            Punto punto = new Punto(x, y);
            puntos.add(punto);
        }
    }
    public void calcularDistancia() {
        for (int j = 0; j < puntos.size(); j++) {
            for (int k = j+1; k < puntos.size(); k++) {
                double dx = puntos.get(j).getX() - puntos.get(k).getX();
                double dy = puntos.get(j).getY() - puntos.get(k).getY();
                double distanciapuntos = Math.sqrt(dx * dx + dy * dy);
                distancias.add(distanciapuntos);
            }
        }
        System.out.println("Distancias: "+distancias);
        }
    public void calcularDistanciaMenor() {
        double distanciaMenor=distancias.get(0);
        for(int l=1; l<distancias.size();l++){
        if(distanciaMenor>distancias.get(l)){
            distanciaMenor=distancias.get(l);
        }
    }
        System.out.println("La distancia Menor es: "+distanciaMenor);
    }


}