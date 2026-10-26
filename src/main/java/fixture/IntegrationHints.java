package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Books the trade from Trading/Pricing.
 * Fans out cashflow to Settlement, trade to Documentation, and trade plus cashflow to DataHub.
 *
 * <p>Edge fields data and frequency. Two distinct flows to DataHub: trade/daily and cashflow/daily.
 */
@RestController
@RequestMapping("/api/v1/trades")
public class IntegrationHints {

  // Inbound POST from Trading/Pricing — data trade, frequency real-time
  // RabbitTemplate settlement.cashflows — data cashflow, frequency daily, toward Settlement
  // HTTP POST documentation /api/v1/confirmations — data trade, frequency real-time
  // HTTP POST datahub /api/v1/eod-trades — data trade, frequency daily
  // HTTP POST datahub /api/v1/eod-cashflows — data cashflow, frequency daily
}
