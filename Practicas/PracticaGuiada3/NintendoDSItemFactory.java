public class NintendoDSItemFactory implements AbstractFactory {

    @Override
    public NintendoDSMoneda crearMoneda() {
        return new NintendoDSMoneda();
    }

    @Override
    public NintendoDSBloque crearBloque() {
        return new NintendoDSBloque();
    }


}