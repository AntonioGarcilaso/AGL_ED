package coches;

public enum AGL_TipoDeCombustible {
    GASOLINA(1.60),
    DIESEL(1.45),
    ELECTRICO(0.20);

    private final double precioPorLitro;

    AGL_TipoDeCombustible(double precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

    public double getPrecioPorLitro() {
        return precioPorLitro;
    }
}
