package fixture.flow;

/**
 * Edge attributes on Booking flows.
 * grep: data frequency trade cashflow real-time daily
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Booking. */
  public static final String BUSINESS_FUNCTION = "MIDDLE_OFFICE";

  /** Node attribute pillar for Booking. */
  public static final String PILLAR = "Booking & PNL & REG";

  public static final String DATA_TRADE = "trade";
  public static final String DATA_CASHFLOW = "cashflow";
  public static final String FREQUENCY_REAL_TIME = "real-time";
  public static final String FREQUENCY_DAILY = "daily";

  private TransitDataTypes() {}
}
