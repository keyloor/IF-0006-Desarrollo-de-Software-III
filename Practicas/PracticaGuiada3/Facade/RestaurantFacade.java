
public class RestaurantFacade {

    private CocinaService cocinaService;
    private FacturaService facturaService;
    private MesaService mesaService;
    private NotificacionService notificacionService;

    public RestaurantFacade(CocinaService cocinaService, FacturaService facturaService, MesaService mesaService, NotificacionService notificacionService) {
        this.cocinaService = cocinaService;
        this.facturaService = facturaService;
        this.mesaService = mesaService;
        this.notificacionService = notificacionService;
    }

    public void realizarPedido(String cliente, String platillo) {
        cocinaService.registrarOrden(platillo);
        facturaService.generarFactura(cliente, platillo);
        mesaService.verificarMesaDisponible();
        notificacionService.enviarNotificacion(cliente);
    }

    public CocinaService getCocinaService() {
        return cocinaService;
    }

    public void setCocinaService(CocinaService cocinaService) {
        this.cocinaService = cocinaService;
    }

    public FacturaService getFacturaService() {
        return facturaService;
    }

    public void setFacturaService(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    public MesaService getMesaService() {
        return mesaService;
    }

    public void setMesaService(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    public NotificacionService getNotificacionService() {
        return notificacionService;
    }

    public void setNotificacionService(NotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RestaurantFacade{");
        sb.append("cocinaService=").append(cocinaService);
        sb.append(", facturaService=").append(facturaService);
        sb.append(", mesaService=").append(mesaService);
        sb.append(", notificacionService=").append(notificacionService);
        sb.append('}');
        return sb.toString();
    }

}
