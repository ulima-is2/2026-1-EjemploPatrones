package pe.edu.ulima.is2.patrones.bridge;

public class Main {
    static void main() {
        Ventana ven = new VentanaTriangular(new Implementor() {
            @Override
            public void dibujar() {
                System.out.println("Se dibujara una Venta Trianguar en Windows");
            }
        });

        ven.draw();

        Ventana ven2 = new VentanaTriangular(new Implementor() {
            @Override
            public void dibujar() {
                System.out.println("Se dibujara una Venta Trianguar en Mac");
            }
        });

        ven2.draw();
    }
}
