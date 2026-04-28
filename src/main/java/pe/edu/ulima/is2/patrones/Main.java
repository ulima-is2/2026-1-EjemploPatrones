package pe.edu.ulima.is2.patrones;

import pe.edu.ulima.is2.patrones.factory_method.Aplicacion;
import pe.edu.ulima.is2.patrones.factory_method.Documento;
import pe.edu.ulima.is2.patrones.factory_method.HojaCalculo;
import pe.edu.ulima.is2.patrones.factory_method.ProcesadorTexto;


public class Main {

    static void main() {
        Aplicacion app = new HojaCalculo();
        Documento doc = app.crear();
        ejecutarFactoryMethod(doc);
    }

    public static void ejecutarFactoryMethod(Documento doc) {
        doc.abrir();
        doc.cerrar();
    }
}
