package es.santander.ascender;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<String> valores = new ArrayList<>();

    public void add(String mensaje) {
        valores.add(mensaje);
    }

    public String get() {
        if (valores.size() == 0) {
            return null;
        }
        String res = valores.get(0);
        valores.remove(0);
        return res;
    }
}
