package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Books the trade from Trading/Pricing and fans it out to Analytics, Documentation, and Settlement.
 *
 * <p>data_category per flow — see fixture.flow.TransitDataTypes:
 * TRADE_CAPTURE, POSITION_SNAPSHOT, TRADE_CONFIRMATION, SETTLEMENT_INSTRUCTION.
 */
@RestController
@RequestMapping("/api/v1/trades")
public class IntegrationHints {

  // Inbound POST from Trading/Pricing — data_category TRADE_CAPTURE
  // KafkaTemplate.send("positions.snapshot", PositionSnapshot) — POSITION_SNAPSHOT toward Analytics
  // HTTP POST documentation /api/v1/confirmations — TRADE_CONFIRMATION
  // RabbitTemplate settlement.instructions — SETTLEMENT_INSTRUCTION toward Settlement
}
