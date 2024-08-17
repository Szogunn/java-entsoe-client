package com.entsoe.inputs;

/**
 *
 * @author Boczek Mateusz
 * Data copied from https://transparency.entsoe.eu/content/static_content/Static%20content/web%20api/Guide.html#_contract_marketagreement_type_type_marketagreement_type
 *
 */
public enum TimeIntervalType {
    DAILY("A01", "Daily"),
    WEEKLY("A02", "Weekly"),
    MONTHLY("A03", "Monthly"),
    YEARLY("A04", "Yearly"),
    TOTAL("A05", "Total"),
    LONG_TERM("A06", "Long term"),
    INTRADAY("A07", "Intraday"),
    HOURLY("A13", "Hourly (Type_MarketAgreement.Type only)");

    private final String code;
    private final String meaning;

    TimeIntervalType(String code, String meaning) {
        this.code = code;
        this.meaning = meaning;
    }

    public String getCode() {
        return code;
    }

    public String getMeaning() {
        return meaning;
    }
}