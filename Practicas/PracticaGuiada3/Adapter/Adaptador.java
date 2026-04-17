class Adaptador implements Enchufe {
    
    private Extranjero extranjero;

    public Adaptador(Extranjero extranjero) {
        this.extranjero = extranjero;
    }

    @Override
    public void conectar() {
        extranjero.conectarCorriente();
    }
}