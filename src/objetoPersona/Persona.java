package objetoPersona;

public class Persona {

	/**
	 * Atributos o caracteristicas de la persona.
	 */
	private String nombre;
	private int edad;
	private int peso;
	private int altura;

	/**
	 * Getter del nombre para poder recoger el valor.
	 * @return devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre para cambiar el valor opcionalmente.
	 * @param nombre el nuevo valor de nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de la edad para poder recoger el valor.
	 * 
	 * @return devuelve la edad.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Setter de la edad para cambiar el valor opcionalmente.
	 * @param edad el nuevo valor de edad.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Getter del peso para poder recoger el valor.
	 * @return devuelve el valor del peso.
	 */

	public int getPeso() {
		return peso;
	}

	/**
	 * Setter del peso que permite opcionalmente cambiar su valor.
	 * @param peso es el nuevo valor de peso.
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Getter que permite recoger el valor de Altura.
	 * @return el valor de altura.
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Setter del valor altura que permite cambiar su valor opcionalmente.
	 * @param altura es el nuevo valor de altura.
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	/**
	 * Constructor parametrizado de la persona.
	 * @param nombre Nombre de la persona.
	 * @param edad Edad de la persona.
	 * @param peso Peso de la persona.
	 * @param altura Altura de la persona.
	 */
	public Persona(String nombre, int edad, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
