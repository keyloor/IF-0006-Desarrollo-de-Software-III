public class Main {
    public static void main(String[] args) {
        GameBoyItemFactory gameBoyItemFactory = new GameBoyItemFactory();
        NintendoDSItemFactory nintendoDSItemFactory = new NintendoDSItemFactory();

        GameBoyBloque gameBoyB = gameBoyItemFactory.crearBloque();
        GameBoyMoneda gameBoyM = gameBoyItemFactory.crearMoneda();

        NintendoDSBloque nintendoB = nintendoDSItemFactory.crearBloque();
        NintendoDSMoneda nintendoM = nintendoDSItemFactory.crearMoneda();

        System.out.println("---   GameBoy   ---");
        gameBoyB.golpear();
        gameBoyM.recolectar();
        System.out.println("");

        System.out.println("---  NintendoDS ---");
        nintendoB.golpear();
        nintendoM.recolectar();
        System.out.println("");

    }
}