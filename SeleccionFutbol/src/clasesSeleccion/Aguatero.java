package clasesSeleccion;

import java.util.ArrayList;

public class Aguatero extends SeleccionFutbol{

	private int NumeroBotellasInicial;
	private int NumeroBotellasGastadas;
	private int NumeroPersonasCancha;
	private int NumeroPersonasHidratadas;
	
	public Aguatero() {}
	
	public Aguatero(int id,String nombres, String apellidos, int edad, 
			int numBtIni, int numBtGast, int numPerCancha, int numPerHi) {
		
		this.setId(id);
		this.setNombres(nombres);
		this.setApellidos(apellidos);
		this.setEdad(edad);
		this.NumeroBotellasInicial = numBtIni;
		this.NumeroBotellasGastadas = numBtGast;
		this.NumeroPersonasCancha = numPerCancha;
		this.NumeroPersonasHidratadas = numPerHi;
	}
	
	
	@Override
	public void Entrenamiento() {
		System.out.println("El Entrenador " + this.getNombres() +" " + this.getApellidos() + " con el identificador " + this.getId() + " con la Edad de "+ this.getEdad() + "  "+
				" debe hidratar a "+this.NumeroPersonasCancha+" encontradas en el Entrenamiento del equipo.");	
	}
	
	
	public void ResultadoDeHidratacion() {
		
		System.out.println("El se�or " + this.getNombres() + " tenia " +  this.NumeroBotellasInicial + " Botellas con agua y gasto "+ 
					this.NumeroBotellasGastadas + " hidratando a " + this.NumeroPersonasCancha + " de " + this.NumeroPersonasHidratadas + ".");
	}
	
	public static void IterarListaAguateros(ArrayList<Aguatero> lstAguateros) {
		
		for (Aguatero aguatero : lstAguateros) {
			System.out.println("==== AGUATERO ====");
			aguatero.Viajar();
			aguatero.Concentrarse();
			aguatero.PartidoFutbol();
			aguatero.Entrenamiento();
			aguatero.ResultadoDeHidratacion();
			System.out.println("=================");
		}
		
	}
	
	
	public void setNumeroBotellasInicial(int numBtIni) {
		this.NumeroBotellasInicial = numBtIni;
	}
	public int getNumeroBotellasInicial() {
		return this.NumeroBotellasInicial;
	}
	
	public void setNumeroBotellasGastadas(int numBtGast) {
		this.NumeroBotellasGastadas = numBtGast;
	}
	public int getNumeroBotellasGastadas() {
		return this.NumeroBotellasGastadas;
	}
	
	public void setNumeroPersonasCancha(int numPerCancha) {
		this.NumeroPersonasCancha = numPerCancha;
	}
	public int getNumeroPersonasCancha() {
		return this.NumeroPersonasCancha;
	}
	
	public void setNumeroPersonasHidratadas(int numPerHi) {
		this.NumeroPersonasHidratadas = numPerHi;
	}
	public int getNumeroPersonasHidratadas() {
		return this.NumeroPersonasHidratadas;
	}
	

}
