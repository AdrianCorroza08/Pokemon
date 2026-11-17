/**
 * Clase Poder: un ataque que puede usar un pokemon. Usarlo cuesta energía.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poder
{
    private String nombre;
    private String tipo;
    private int potencia;
    private int energiaConsumida;
    /**
     * Constructor con los cuatro datos del poder.
     */
    public Poder(String nombre, String tipo, int potencia, int energiaConsumida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.energiaConsumida = energiaConsumida;
    }

    /**
     * Constructor sin energía consumida.
     */
    public Poder(String nombre, String tipo, int potencia){
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        energiaConsumida = potencia / 3;
        // TODO: la energía consumida es la tercera parte de la potencia (potencia / 3).
    }

    /**
     * Constructor solo con nombre y tipo.
     */
    public Poder(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        potencia = 25;
        energiaConsumida = 8;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public int getPotencia(){
        return potencia;
    }

    public int getEnergiaConsumida(){
        return energiaConsumida;
    }

    public void setPotencia(int nuevaPotencia){
        potencia = nuevaPotencia;
    }

    public void setEnergiaConsumida(int nuevaEnergia){
        energiaConsumida = nuevaEnergia;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("***" + nombre + "***" + "\n");
        sb.append("Tipo: " + tipo + "\n");
        sb.append("Potencia: " + potencia + "\n");
        sb.append("Energia: " + energiaConsumida + "\n");
        sb.append("\n");
        return sb.toString();
    }
}
