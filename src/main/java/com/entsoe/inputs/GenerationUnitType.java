package com.entsoe.inputs;

/**
 *
 * @author Boczek Mateusz
 * Data copied from https://transparency.entsoe.eu/content/static_content/Static%20content/web%20api/Guide.html#_psrtype
 *
 */
public enum GenerationUnitType {
    MIXED("A03", "Mixed"),
    GENERATION("A04", "Generation"),
    LOAD("A05", "Load"),
    BIOMASS("B01", "Biomass"),
    FOSSIL_BROWN_COAL_LIGNITE("B02", "Fossil Brown coal/Lignite"),
    FOSSIL_COAL_DERIVED_GAS("B03", "Fossil Coal-derived gas"),
    FOSSIL_GAS("B04", "Fossil Gas"),
    FOSSIL_HARD_COAL("B05", "Fossil Hard coal"),
    FOSSIL_OIL("B06", "Fossil Oil"),
    FOSSIL_OIL_SHALE("B07", "Fossil Oil shale"),
    FOSSIL_PEAT("B08", "Fossil Peat"),
    GEOTHERMAL("B09", "Geothermal"),
    HYDRO_PUMPED_STORAGE("B10", "Hydro Pumped Storage"),
    HYDRO_RUN_OF_RIVER_AND_POUNDAGE("B11", "Hydro Run-of-river and poundage"),
    HYDRO_WATER_RESERVOIR("B12", "Hydro Water Reservoir"),
    MARINE("B13", "Marine"),
    NUCLEAR("B14", "Nuclear"),
    OTHER_RENEWABLE("B15", "Other renewable"),
    SOLAR("B16", "Solar"),
    WASTE("B17", "Waste"),
    WIND_OFFSHORE("B18", "Wind Offshore"),
    WIND_ONSHORE("B19", "Wind Onshore"),
    OTHER("B20", "Other"),
    AC_LINK("B21", "AC Link"),
    DC_LINK("B22", "DC Link"),
    SUBSTATION("B23", "Substation"),
    TRANSFORMER("B24", "Transformer");

    private final String code;
    private final String meaning;

    GenerationUnitType(String code, String meaning) {
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
