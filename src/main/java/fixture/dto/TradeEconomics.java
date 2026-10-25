package fixture.dto;

/**
 * Trade economics published on topic trade.economics toward PNL.
 * data_category: TRADE_ECONOMICS
 */
public record TradeEconomics(String tradeId, String book, String instrumentId, String price, String quantity) {}
