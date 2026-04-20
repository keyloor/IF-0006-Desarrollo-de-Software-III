
public class Main {

    public static void main(String[] args) {
        CocinaService cocinaService = new CocinaService(); //1
        FacturaService facturaService = new FacturaService(); //2
        MesaService mesaService = new MesaService(); //3
        NotificacionService notificacionService = new NotificacionService(); //4

        RestaurantFacade restaurantFacade = new RestaurantFacade(cocinaService, facturaService, mesaService, notificacionService);
        restaurantFacade.realizarPedido("Rafa", "Vaso de Agua");

    }
}
