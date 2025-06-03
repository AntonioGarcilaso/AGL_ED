package coches;

public class AGL_Moto {
    private String Matricula;
    private String Modelo;
    private int NumeroPlazas;
    private double VelocidadMedia;
    private AGL_TipoDeCombustible TipoCombustible;
    private double Consumo;

    public AGL_Moto() {
        super();
    }

    public AGL_Moto(String matricula, String modelo, int numeroPlazas, double velocidadMedia,
                    AGL_TipoDeCombustible tipoCombustible, double consumo) {
        super();
        Matricula = matricula;
        Modelo = modelo;
        NumeroPlazas = numeroPlazas;
        VelocidadMedia = velocidadMedia;
        TipoCombustible = tipoCombustible;
        Consumo = consumo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getNumeroPlazas() {
        return NumeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        NumeroPlazas = numeroPlazas;
    }

    public double getVelocidadMedia() {
        return VelocidadMedia;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        VelocidadMedia = velocidadMedia;
    }

    public AGL_TipoDeCombustible getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(AGL_TipoDeCombustible tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double consumo) {
        Consumo = consumo;
    }


    public double calcularTiempo(double distancia) {
        return distancia / this.VelocidadMedia;
    }


    public double calcularCoste(double distancia) {
        double precio = this.TipoCombustible.getPrecioPorLitro();
        return (distancia * this.Consumo / 100) * precio;
    }

  
    public double calcularRendimiento(double coste) {
        return coste / this.NumeroPlazas;
    }

    @Override
    public String toString() {
        return "AGL_Moto [Matricula=" + Matricula + ", Modelo=" + Modelo + ", NumeroPlazas=" + NumeroPlazas
                + ", VelocidadMedia=" + VelocidadMedia + ", TipoCombustible=" + TipoCombustible + ", Consumo=" + Consumo
                + "]";
    }
}
