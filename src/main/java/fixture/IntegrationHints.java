package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Books the trade from Trading/Pricing and fans it out to the downstream chain.
 *
 * <p>data_category per flow — see fixture.flow.TransitDataTypes:
 * TRADE_CAPTURE, POSITION_SNAPSHOT, TRADE_CONFIRMATION, SETTLEMENT_INSTRUCTION,
 * TRADE_ECONOMICS, REGULATORY_REPORT, ACCOUNTING_EVENT.
 */
@RestController
@RequestMapping("/api/v1/trades")
public class IntegrationHints {

  // Inbound POST from Trading/Pricing — data_category TRADE_CAPTURE
  // KafkaTemplate.send("positions.snapshot", PositionSnapshot) — POSITION_SNAPSHOT toward Analytics
  // HTTP POST documentation /api/v1/confirmations — TRADE_CONFIRMATION
  // RabbitTemplate settlement.instructions — SETTLEMENT_INSTRUCTION toward Settlement
  // KafkaTemplate.send("trade.economics", TradeEconomics) — TRADE_ECONOMICS toward PNL
  // RabbitTemplate regulatory.reports — REGULATORY_REPORT toward Regulatory
  // KafkaTemplate.send("accounting.events", AccountingEvent) — ACCOUNTING_EVENT toward Accounting
}
