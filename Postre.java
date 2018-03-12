
package Hosteleria.model;

public class Postre {
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Postre extends Consumicion {

    private Temperatura temperatura;
    private Gusto gusto;
    private String ingredientes;

    public Postre(Temperatura temperatura, Gusto gusto, String ingredientes, double precio, String nombre) {
        super(precio, nombre);
        this.temperatura = temperatura;
        this.gusto = gusto;
        this.ingredientes = ingredientes;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Gusto getGusto() {
        return gusto;
    }

    public void setGusto(Gusto gusto) {
        this.gusto = gusto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void ordenarAlimentos() {
        String ingre = this.ingredientes;
        String orden = "";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(ingre);
        while (matcher.find()) {
            //System.out.println(matcher.group());
            orden = orden + matcher.group() + "\n";
            this.ingredientes = orden;
        }

    }

}

