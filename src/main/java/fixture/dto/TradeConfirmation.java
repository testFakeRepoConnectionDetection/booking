package fixture.dto;

/**
 * Confirmation posted to Documentation after the trade is booked.
 * data_category: TRADE_CONFIRMATION
 */
public record TradeConfirmation(String tradeId, String counterparty, String instrumentId, String terms) {}
