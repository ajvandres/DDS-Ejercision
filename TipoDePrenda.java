public enum TipoDePrenda {
	ZAPATO(Categoria.CALZADO),
    CAMISA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR);
	
	Categoria categoria;
	
	TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
	}
}