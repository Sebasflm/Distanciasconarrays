
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CalculadorDistancias {
    public static List<Punto> leerPuntos(int n, Scanner scanner) {
        List<Punto> puntos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las coordenadas para el punto " + (i + 1) + ":");
            System.out.print("Coordenada x: ");
            int x = scanner.nextInt();
            System.out.print("Coordenada y: ");
            int y = scanner.nextInt();
            Punto punto = new Punto(x, y);
            puntos.add(punto);
        }
        return puntos;
    }

    public static double calcularDistanciaMenor(List<Punto> puntos) {
        double distanciaMenor = Double.MAX_VALUE;
        for (int i = 0; i < puntos.size(); i++) {
            for (int j = i + 1; j < puntos.size(); j++) {
                Punto punto1 = puntos.get(i);
                Punto punto2 = puntos.get(j);
                double distancia = calcularDistancia(punto1, punto2);
                if (distancia < distanciaMenor) {
                    distanciaMenor = distancia;
                }
            }
        }
        return distanciaMenor;
    }

    public static double calcularDistancia(Punto punto1, Punto punto2) {
        int dx = punto2.getX() - punto1.getX();
        int dy = punto2.getY() - punto1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void mostrarDistanciaMenor(double distanciaMenor, List<Punto> puntos) {
        System.out.println("Distancia menor: " + distanciaMenor);
        for (int i = 0; i < puntos.size(); i++) {
            for (int j = i + 1; j < puntos.size(); j++) {
                Punto punto1 = puntos.get(i);
                Punto punto2 = puntos.get(j);
                double distancia = calcularDistancia(punto1, punto2);
                if (distancia == distanciaMenor) {
                    System.out.println("Punto 1: (" + punto1.getX() + ", " + punto1.getY() + ")");
                    System.out.println("Punto 2: (" + punto2.getX() + ", " + punto2.getY() + ")");
                }
            }
        }
    }
}