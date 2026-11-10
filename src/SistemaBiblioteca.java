import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();

    public void registrarMaterial(Material material) {
        catalogo.put(material.getCodigo(), material);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }
}