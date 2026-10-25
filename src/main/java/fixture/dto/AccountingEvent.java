package fixture.dto;

/**
 * Accounting event published on topic accounting.events toward Accounting.
 * data_category: ACCOUNTING_EVENT
 */
public record AccountingEvent(String tradeId, String book, String amount, String currency) {}
