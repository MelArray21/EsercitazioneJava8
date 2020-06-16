public class Trade {
	
	
private String tradeId;
private String trader;
private int notional;
private String currency;
private String region;


public Trade(String tradeId, String trader, int notional, String currency, String region) {
	super();
	this.tradeId = tradeId;
	this.trader = trader;
	this.notional = notional;
	this.currency = currency;
	this.region = region;
}
public String getTradeId() {
	return tradeId;
}
public void setTradeId(String tradeId) {
	this.tradeId = tradeId;
}
public String getTrader() {
	return trader;
}
public void setTrader(String trader) {
	this.trader = trader;
}



public int getNotional() {
	return notional;
}
public void setNotional(int notional) {
	this.notional = notional;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
@Override
public String toString() {
	return "Trade [tradeId=" + tradeId + ", trader=" + trader + ", notional=" + notional + ", currency=" + currency
			+ ", region=" + region + "]";
}



}
