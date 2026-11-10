public class Libro extends Material{

    public String autor;
    public String isbn;
    public Libro (String title, int publicYear, boolean stateDispo, String autor, String isbn){
        super(title, publicYear, stateDispo);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String getCodigo() {
        return "";
    }

    @Override
    public String getTipo() {
        return "Libro";
    }

}
