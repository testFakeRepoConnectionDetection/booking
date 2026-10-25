# Booking (fixture)

Trade booking system of record. Captures the trade, then fans it out across the chain.

## Integrations (topology)

- REST API `/api/v1/trades` called by **Trading/Pricing**.
- Produces Kafka topic `positions.snapshot` consumed by **Analytics**.
- Posts the confirmation to **Documentation** over HTTP.
- Publishes AMQP `settlement.instructions` for **Settlement**.
- Produces Kafka topic `trade.economics` consumed by **PNL**.
- Publishes AMQP `regulatory.reports` for **Regulatory**.
- Produces Kafka topic `accounting.events` consumed by **Accounting**.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | Channel | data_category |
|------|------|---------|---------------|
| Trading/Pricing | API (inbound) | /trades | `TRADE_CAPTURE` |
| Analytics | KAFKA | positions.snapshot | `POSITION_SNAPSHOT` |
| Documentation | API | /confirmations | `TRADE_CONFIRMATION` |
| Settlement | MQ | settlement.instructions | `SETTLEMENT_INSTRUCTION` |
| PNL | KAFKA | trade.economics | `TRADE_ECONOMICS` |
| Regulatory | MQ | regulatory.reports | `REGULATORY_REPORT` |
| Accounting | KAFKA | accounting.events | `ACCOUNTING_EVENT` |

Constants: `fixture.flow.TransitDataTypes`.
