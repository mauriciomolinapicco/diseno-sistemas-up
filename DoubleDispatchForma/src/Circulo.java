class Circulo implements Forma {
    private double radio;
    private double x, y; // centro
    
    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    @Override
    public boolean colisionaCon(Forma otra) {
        // Primera parte del dispatch: delegamos al otro objeto
        // pasando este círculo como argumento
        return otra.colisionaConCirculo(this);
    }
    
    @Override
    public boolean colisionaConCirculo(Circulo otro) {
        // Lógica para detectar colisión entre dos círculos
        double distancia = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
        return distancia < (this.radio + otro.radio);
    }
    
    @Override
    public boolean colisionaConRectangulo(Rectangulo rectangulo) {
        // Lógica para detectar colisión entre un círculo y un rectángulo
        // (Implementación simplificada)
        return rectangulo.colisionaConCirculo(this);
    }
    
    // Getters
    public double getRadio() { return radio; }
    public double getX() { return x; }
    public double getY() { return y; }
}
