package pacote;

import java.math.BigInteger;

public class Moedas {

	private String name;
	private String symbol; 
	private BigInteger volume;
	private Double Preco;
	private BigInteger market_cap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public BigInteger getVolume() {
		return volume;
	}
	public void setVolume(BigInteger volume) {
		this.volume = volume;
	}
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double Preco) {
		this.Preco = Preco;
	}
	public BigInteger getMarket_cap() {
		return market_cap;
	}
	public void setMarket_cap(BigInteger market_cap) {
		this.market_cap = market_cap;
	}
	
	
}
