
package Hosteleria.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plato extends Consumicion {

    private TipoPlato TipoPlato;
    private String ingredientes;

    public Plato(TipoPlato TipoPlato, String ingredientes, double precio, String nombre) {
        super(precio, nombre);
        this.TipoPlato = TipoPlato;
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void getTipo() {
        this.TipoPlato = TipoPlato;
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

