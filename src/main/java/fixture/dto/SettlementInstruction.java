package fixture.dto;

/**
 * Settlement instruction published on exchange settlement.instructions toward Settlement.
 * data_category: SETTLEMENT_INSTRUCTION
 */
public record SettlementInstruction(String tradeId, String settlementDate, String currency, String amount) {}
