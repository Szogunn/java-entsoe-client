package com.entsoe.inputs;

/**
 *
 * @author Boczek Mateusz
 * Data copied from https://transparency.entsoe.eu/content/static_content/Static%20content/web%20api/Guide.html#_processtype
 *
 */
public enum ProcessType implements Param {
    DAY_AHEAD("A01", "Day ahead"),
    INTRA_DAY_INCREMENTAL("A02", "Intra day incremental"),
    REALISED("A16", "Realised"),
    INTRA_DAY_TOTAL("A18", "Intraday total"),
    WEEK_AHEAD("A31", "Week ahead"),
    MONTH_AHEAD("A32", "Month ahead"),
    YEAR_AHEAD("A33", "Year ahead"),
    SYNCHRONISATION_PROCESS("A39", "Synchronisation process"),
    INTRADAY_PROCESS("A40", "Intraday process"),
    REPLACEMENT_RESERVE("A46", "Replacement reserve"),
    MANUAL_FREQUENCY_RESTORATION_RESERVE("A47", "Manual frequency restoration reserve"),
    AUTOMATIC_FREQUENCY_RESTORATION_RESERVE("A51", "Automatic frequency restoration reserve"),
    FREQUENCY_CONTAINMENT_RESERVE("A52", "Frequency containment reserve"),
    FREQUENCY_RESTORATION_RESERVE("A56", "Frequency restoration reserve"),
    SCHEDULED_ACTIVATION_MFRR("A60", "Scheduled activation mFRR"),
    DIRECT_ACTIVATION_MFRR("A61", "Direct activation mFRR"),
    CENTRAL_SELECTION_AFRR("A67", "Central Selection aFRR"),
    LOCAL_SELECTION_AFRR("A68", "Local Selection aFRR");

    private final String code;
    private final String description;

    private ProcessType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getParamValue() {
        return this.code;
    }

    @Override
    public String getParamName() {
        return "processType";
    }
}
