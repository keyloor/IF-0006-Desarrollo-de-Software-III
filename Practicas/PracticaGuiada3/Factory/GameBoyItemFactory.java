public class GameBoyItemFactory implements AbstractFactory{

    @Override
    public GameBoyMoneda crearMoneda() {
        return new GameBoyMoneda();
    }

    @Override
    public GameBoyBloque crearBloque() {
        return new GameBoyBloque();
    }

}