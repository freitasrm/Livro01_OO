package livraria;

@FunctionalInterface
public interface Promocional {
	
	public abstract boolean aplicaDescontoDe(double porcentagem);
	
	default boolean aplicaDescontoDe10PorCento() {
		return aplicaDescontoDe(0.1);
	}

}
