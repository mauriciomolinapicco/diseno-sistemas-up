class PreparacionCafe extends PreparacionBebida {
    
    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando café molido");
    }
    
    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche");
    }
    
    @Override
    protected boolean clienteQuiereCondimentos() {
        // Podría implementarse con una pregunta real al cliente
        return true;
    }
}
