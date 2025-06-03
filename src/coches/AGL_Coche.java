package coches;

public class AGL_Coche {
	private String Matricula;
	private String Modelo;
	private int NumeroPlazas;
	private double VelocidadMedia;
	private String TipoCombustible;
	private double Consumo;
	public AGL_Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AGL_Coche(String matricula, String modelo, int numeroPlazas, double velocidadMedia, String tipoCombustible,
			double consumo) {
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
	public String getTipoCombustible() {
		return TipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		TipoCombustible = tipoCombustible;
	}
	public double getConsumo() {
		return Consumo;
	}
	public void setConsumo(double consumo) {
		Consumo = consumo;
	}
	@Override
	public String toString() {
		return "AGL_Coche [Matricula=" + Matricula + ", Modelo=" + Modelo + ", NumeroPlazas=" + NumeroPlazas
				+ ", VelocidadMedia=" + VelocidadMedia + ", TipoCombustible=" + TipoCombustible + ", Consumo=" + Consumo
				+ "]";
	}
	
	
	}


	
