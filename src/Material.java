public abstract class Material implements Catalogable{

    @Override
    public String getCodigo() {
        return "";
    }
    public abstract String getTipo();

    public String title;
    public int publicYear;
    public boolean stateDispo;

    public Material (){

    }

    public Material (String title, int publicYear, boolean stateDispo){
        this.title = title;
        this.publicYear = publicYear;
        this.stateDispo = stateDispo;
    }

    public String getTitle () {
        return title;
    }

    public int getPublicYear () {
        return publicYear;
    }

    public boolean isStateDispo() {
        return stateDispo;
    }

    public String mostrarInfo (String getTipo, String getCodigo, String title, int publicYear, boolean stateDispo) {
        return ("Tipo: [" + getTipo + "] | Titulo: " + title
                + " | Año de publicación: " + publicYear + " — Disponible/Prestado: " + stateDispo);
    }
}
