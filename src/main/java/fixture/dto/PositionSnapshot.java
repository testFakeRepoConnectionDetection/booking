package fixture.dto;

/**
 * Position snapshot published on topic positions.snapshot toward Analytics.
 * data_category: POSITION_SNAPSHOT
 */
public record PositionSnapshot(String book, String instrumentId, String quantity, String asOfDate) {}
