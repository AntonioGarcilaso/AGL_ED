package coches;

public class Main {

    public static void main(String[] args) {

        AGL_Coche coche1 = new AGL_Coche("1234ABC", "Toyota", 5, 100, AGL_TipoDeCombustible.GASOLINA, 6.5);
        AGL_Coche coche2 = new AGL_Coche("5678DEF", "Honda", 4, 110, AGL_TipoDeCombustible.DIESEL, 5.8);

 
        AGL_Moto moto1 = new AGL_Moto("9999XYZ", "Yamaha", 2, 90, AGL_TipoDeCombustible.GASOLINA, 3.5);
        AGL_Moto moto2 = new AGL_Moto("8888UVW", "Suzuki", 2, 85, AGL_TipoDeCombustible.GASOLINA, 4.0);

        double distancia = 150.0; 

        mostrarResultados(coche1, distancia);
        mostrarResultados(coche2, distancia);

        mostrarResultados(moto1, distancia);
        mostrarResultados(moto2, distancia);
    }

    private static void mostrarResultados(AGL_Coche coche, double distancia) {
        double tiempo = coche.calcularTiempo(distancia);
        double coste = coche.calcularCoste(distancia);
        double rendimiento = coche.calcularRendimiento(coste);

        System.out.println(coche);
        System.out.println("Tiempo: " + tiempo + " horas");
        System.out.println("Coste: " + coste + " euros");
        System.out.println("Rendimiento: " + rendimiento + " euros/persona");
        System.out.println("-------------------------");
    }

    private static void mostrarResultados(AGL_Moto moto, double distancia) {
        double tiempo = moto.calcularTiempo(distancia);
        double coste = moto.calcularCoste(distancia);
        double rendimiento = moto.calcularRendimiento(coste);

        System.out.println(moto);
        System.out.println("Tiempo: " + tiempo + " horas");
        System.out.println("Coste: " + coste + " euros");
        System.out.println("Rendimiento: " + rendimiento + " euros/persona");
        System.out.println("-------------------------");
    }
}
