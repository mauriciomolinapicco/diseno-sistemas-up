class PreparacionTe extends PreparacionBebida {
    
    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando hojas de té");
    }
    
    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando limón");
    }
    
    @Override
    protected boolean clienteQuiereCondimentos() {
        // Por ejemplo, algunos clientes prefieren té sin limón
        return false;
    }
}
