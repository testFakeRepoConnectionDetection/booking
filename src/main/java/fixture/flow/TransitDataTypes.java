package fixture.flow;

/**
 * Data categories produced or consumed by Booking integrations.
 * grep: data_category TRADE_CAPTURE POSITION_SNAPSHOT TRADE_CONFIRMATION
 * SETTLEMENT_INSTRUCTION TRADE_ECONOMICS REGULATORY_REPORT ACCOUNTING_EVENT
 */
public final class TransitDataTypes {

  public static final String REST_TRADE_CAPTURE = "TRADE_CAPTURE";
  public static final String KAFKA_POSITION_SNAPSHOT = "POSITION_SNAPSHOT";
  public static final String HTTP_TRADE_CONFIRMATION = "TRADE_CONFIRMATION";
  public static final String MQ_SETTLEMENT_INSTRUCTION = "SETTLEMENT_INSTRUCTION";
  public static final String KAFKA_TRADE_ECONOMICS = "TRADE_ECONOMICS";
  public static final String MQ_REGULATORY_REPORT = "REGULATORY_REPORT";
  public static final String KAFKA_ACCOUNTING_EVENT = "ACCOUNTING_EVENT";

  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";
  public static final String MQ_PAYLOAD_FORMAT = "JSON";
  public static final String HTTP_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
