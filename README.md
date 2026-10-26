# Booking (fixture)

Business function: `MIDDLE_OFFICE` (`app.business_function`).
Pillar: `Booking & PNL & REG` (`app.pillar`).

Trade booking system of record.

## Integrations (topology)

- REST API `/api/v1/trades` called by **Trading/Pricing**.
- Publishes AMQP `settlement.cashflows` for **Settlement**.
- Posts the trade to **Documentation** over HTTP.
- Posts the end-of-day trade to **DataHub** on `/api/v1/eod-trades`.
- Posts the end-of-day cashflow to **DataHub** on `/api/v1/eod-cashflows`.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| Trading/Pricing | inbound | API | /api/v1/trades | `trade` | `real-time` |
| Settlement | outbound | MQ | settlement.cashflows | `cashflow` | `daily` |
| Documentation | outbound | API | /api/v1/confirmations | `trade` | `real-time` |
| DataHub | outbound | API | /api/v1/eod-trades | `trade` | `daily` |
| DataHub | outbound | API | /api/v1/eod-cashflows | `cashflow` | `daily` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
