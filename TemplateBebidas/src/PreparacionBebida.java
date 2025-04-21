abstract class PreparacionBebida {
    
    // Este es el método template que define el algoritmo
    public final void prepararBebida() {
        hervirAgua();
        agregarIngredientePrincipal();
        verterEnTaza();
        
        // Paso opcional que puede ser personalizado
        if (clienteQuiereCondimentos()) {
            agregarCondimentos();
        }
        
        finalizarPreparacion();
    }
    
    // Métodos comunes para todas las bebidas
    private void hervirAgua() {
        System.out.println("Hirviendo agua");
    }
    
    private void verterEnTaza() {
        System.out.println("Vertiendo en taza");
    }
    
    private void finalizarPreparacion() {
        System.out.println("¡Bebida lista para servir!");
    }
    
    // Métodos abstractos que deben implementar las subclases
    protected abstract void agregarIngredientePrincipal();
    protected abstract void agregarCondimentos();
    
    // Hook method (método gancho) con implementación predeterminada
    // Las subclases pueden sobrescribirlo si es necesario
    protected boolean clienteQuiereCondimentos() {
        return true; // Por defecto, se agregan condimentos
    }
}
