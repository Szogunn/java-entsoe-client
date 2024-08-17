package com.entsoe.inputs;

/**
 *
 * @author Boczek Mateusz
 * Data copied from https://transparency.entsoe.eu/content/static_content/Static%20content/web%20api/Guide.html#_areas
 *
 */
public class AreaWithParamName implements Param {
    private final Area area;
    private final AreaParamName areaParamName;

    public AreaWithParamName(Area area, AreaParamName areaParamName) {
        this.area = area;
        this.areaParamName = areaParamName;
    }

    @Override
    public String getParamValue() {
        return this.area.code;
    }

    @Override
    public String getParamName() {
        return this.areaParamName.paramName;
    }

    public enum Area {
        MONTENEGRO("10YCS-CG-TSO---S", "BZN|ME, CTA|ME, Montenegro (ME), MBA|ME, SCA|ME, LFA|ME"),
        ITALY_CENTRE_SOUTH("10Y1001A1001A71M", "BZN|IT-Centre-South, SCA|IT-Centre-South, MBA|IT-Z-Centre-South"),
        BOSNIA("10YBA-JPCC-----D", "LFA|BA, BZN|BA, CTA|BA, Bosnia and Herz. (BA), SCA|BA, MBA|BA"),
        SERBIA("10YCS-SERBIATSOV", "LFA|RS, SCA|RS, MBA|RS, Serbia (RS), CTA|RS, BZN|RS"),
        KOSOVO("10Y1001C--00100H", "BZN|XK, CTA|XK, Kosovo (XK), MBA|XK, LFB|XK, LFA|XK"),
        ALBANIA("10YAL-KESH-----5", "LFB|AL, LFA|AL, BZN|AL, CTA|AL, Albania (AL), SCA|AL, MBA|AL"),
        CZECHY("10YCZ-CEPS-----N", "LFB|AL, LFA|AL, BZN|AL, CTA|AL, Albania (AL), SCA|AL, MBA|AL");

        private final String code;
        private final String meaning;

        Area(String code, String meaning) {
            this.code = code;
            this.meaning = meaning;
        }
    }

    public enum AreaParamName {
        BIDDING_ZONE("biddingZone_Domain"),
        OUT_BIDDING_ZONE("outBiddingZone_Domain"),
        IN_DOMAIN("in_Domain"),
        OUT_DOMAIN("out_Domain");

        private final String paramName;

        AreaParamName(String paramName) {
            this.paramName = paramName;
        }
    }
}
