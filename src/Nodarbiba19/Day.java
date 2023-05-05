package Nodarbiba19;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Day getDayLv(String dayName) {
        switch (dayName.toUpperCase()) {
            case "PIRMDIENA":
                return MONDAY;
            case "OTRDIENA":
                return TUESDAY;
            case "TRESDIENA":
                return WEDNESDAY;
            case "CETRUDEINA":
                return THURSDAY;
            case "PIEKTDIENA":
                return FRIDAY;
            case "SESTDIENA":
                return SUNDAY;
            case "SVETDIENA":
                return SUNDAY;
        }
        return MONDAY;
    }
}
