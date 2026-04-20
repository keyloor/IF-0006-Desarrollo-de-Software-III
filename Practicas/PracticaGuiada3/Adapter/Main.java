
public class Main {

    public static void main(String[] args) {
        Enchufe enchufe = new Adaptador(new Extranjero());

        enchufe.conectar();

    }
}
