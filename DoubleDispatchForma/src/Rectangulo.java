class Rectangulo implements Forma {
    private double x, y; // esquina superior izquierda
    private double ancho, alto;
    
    public Rectangulo(double x, double y, double ancho, double alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public boolean colisionaCon(Forma otra) {
        // Primera parte del dispatch: delegamos al otro objeto
        return otra.colisionaConRectangulo(this);
    }
    
    @Override
    public boolean colisionaConCirculo(Circulo circulo) {
        // Lógica para detectar colisión entre un rectángulo y un círculo
        // (Implementación simplificada)
        double cercanoX = Math.max(this.x, Math.min(circulo.getX(), this.x + this.ancho));
        double cercanoY = Math.max(this.y, Math.min(circulo.getY(), this.y + this.alto));
        
        double distancia = Math.sqrt(Math.pow(cercanoX - circulo.getX(), 2) + 
                                  Math.pow(cercanoY - circulo.getY(), 2));
        
        return distancia < circulo.getRadio();
    }
    
    @Override
    public boolean colisionaConRectangulo(Rectangulo otro) {
        // Lógica para detectar colisión entre dos rectángulos
        return this.x < otro.x + otro.ancho &&
               this.x + this.ancho > otro.x &&
               this.y < otro.y + otro.alto &&
               this.y + this.alto > otro.y;
    }
    
    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getAncho() { return ancho; }
    public double getAlto() { return alto; }
}
