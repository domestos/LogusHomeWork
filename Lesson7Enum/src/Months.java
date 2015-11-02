
public enum  Months {

    JANUARY (Season.WINTER, 30),

    FEBRUARY (Season.WINTER, 29),

    MARCH (Season.SPRING, 31),

    APREIL (Season.SPRING, 28),

    MAY (Season.SPRING, 30),

    JUNE (Season.SUMMER, 30),

    JULY (Season.SUMMER, 31),

    AUGUST (Season.AUTUMN, 29),

    SEPTEMBER (Season.AUTUMN, 30),

    OCTOBER (Season.AUTUMN, 30),

    NOVEMBER (Season.WINTER, 30),

    DECEMBER (Season.WINTER, 29);

    private Season season;

    private int day;

    Months(Season season, int day) {
       this.day = day;
       this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public int getDay() {
        return day;
    }

}
