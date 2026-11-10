public class Revista extends Material{

    public int edicion;
    public String tematica;
    public Revista (String title, int publicYear, boolean stateDispo, int edicion, String tematica){
        super(title, publicYear, stateDispo);
        this.edicion = edicion;
        this.tematica = tematica;
    }

    @Override
    public String getCodigo() {
        return "";
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

}
}
