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
	 * 
	 * @return devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre para cambiar el valor opcionalmente.
	 * 
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
	 * 
	 * @param edad el nuevo valor de edad.
	 * @throws Exception Deuelve una excepción si el peso sobrepasa el límite
	 */
	public void setEdad(int edad) throws Exception {
		if (edad > 0 && edad < 100) {
			this.edad = edad;
		} else
			throw new Exception("La edad es incorrecta.");
	}

	/**
	 * Getter del peso para poder recoger el valor.
	 * 
	 * @return devuelve el valor del peso.
	 */

	public int getPeso() {
		return peso;
	}

	/**
	 * Setter del peso que permite opcionalmente cambiar su valor.
	 * 
	 * @param peso es el nuevo valor de peso.
	 * @throws Exception Deuelve una excepción si el peso sobrepasa el límite.
	 */
	public void setPeso(int peso) throws Exception {
		if (peso > 0 && peso <= 100) {
			this.peso = peso;
		} else
			throw new Exception("El peso no es correcto.");
	}

	/**
	 * Getter que permite recoger el valor de Altura.
	 * 
	 * @return el valor de altura.
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Setter del valor altura que permite cambiar su valor opcionalmente.
	 * 
	 * @param altura es el nuevo valor de altura.
	 * @throws Exception Deuelve una excepción si el peso sobrepasa el límite.
	 */
	public void setAltura(int altura) throws Exception {
		if (altura > 0 && altura < 200) {
			this.altura = altura;
		} else
			throw new Exception("La altura es incorrecta.");
	}

	/**
	 * Constructor parametrizado de la persona.
	 * 
	 * @param nombre Nombre de la persona.
	 * @param edad   Edad de la persona.
	 * @param peso   Peso de la persona.
	 * @param altura Altura de la persona.
	 * @throws Exception Deuelve una excepción según el error que haya.
	 */
	public Persona(String nombre, int edad, int peso, int altura) throws Exception {
		this.nombre = nombre;
		setEdad(edad);
		setPeso(peso);
		setAltura(altura);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
