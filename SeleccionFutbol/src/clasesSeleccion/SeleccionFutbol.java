package clasesSeleccion;

public abstract class SeleccionFutbol{
	private int Id;
	private String Nombres;
	private String Apellidos;
	private int Edad;
	
	
	public SeleccionFutbol() {}
	public SeleccionFutbol(int id,String nombres, String apellidos, int edad) {
		this.Id = id;
		this.Nombres = nombres;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}
	
	
	public void Viajar() {
		System.out.println("La persona " + this.Nombres +" " + this.Apellidos + " con el identificador " + this.Id + " y Edad "+ this.Edad + " años, debe Viajar para el proximo partido.");
	}
	public void Concentrarse() {
		System.out.println("La persona " + this.Nombres +" " + this.Apellidos + " con el identificador " + this.Id + " y Edad "+ this.Edad + " años, debe Concentrarse para el proximo partido.");
	}
	public void PartidoFutbol() {
		System.out.println("La persona " + this.Nombres +" " + this.Apellidos + " con el identificador " + this.Id + " y Edad "+ this.Edad + " años, esta convocado para el proximo partido.");
	}
	
	public abstract void Entrenamiento();
	
	public void setId(int id) {
		this.Id = id;
	}
	public int getId() {
		return this.Id;
	}
	
	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}
	public String getNombres() {
		return this.Nombres;
	}
	
	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}
	public String getApellidos() {
		return this.Apellidos;
	}
	
	public void setEdad(int edad) {
		this.Edad = edad;
	}
	public int getEdad() {
		return this.Edad;
	}
	
}
