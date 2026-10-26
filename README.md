# Booking (fixture)

Business function: `MIDDLE_OFFICE` (`app.business_function`).
Pillar: `Booking & PNL & REG` (`app.pillar`).

Trade booking system of record.

## Integrations (topology)

- REST API `/api/v1/trades` called by **Trading/Pricing**.
- Produces Kafka topic `positions.snapshot` consumed by **Analytics**.
- Posts the confirmation to **Documentation** over HTTP.
- Publishes AMQP `settlement.instructions` for **Settlement**.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | Channel | data_category |
|------|------|---------|---------------|
| Trading/Pricing | API (inbound) | /trades | `TRADE_CAPTURE` |
| Analytics | KAFKA | positions.snapshot | `POSITION_SNAPSHOT` |
| Documentation | API | /confirmations | `TRADE_CONFIRMATION` |
| Settlement | MQ | settlement.instructions | `SETTLEMENT_INSTRUCTION` |

Constants: `fixture.flow.TransitDataTypes`.
