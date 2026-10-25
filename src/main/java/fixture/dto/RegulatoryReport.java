package fixture.dto;

/**
 * EMIR-style transaction report published on exchange regulatory.reports toward Regulatory.
 * data_category: REGULATORY_REPORT
 */
public record RegulatoryReport(String tradeId, String reportingParty, String instrumentId, String notional) {}
