package peaksoft;

public enum DaysOfTheWeek {
    DUISHOMBU("Java lesson болот"),
    SHEISHEMBI("Practice and Soft Skill болот "),
    SHARSHEMBI("Java lesson and english language болот"),
    BEISHEMBI("Soft Skill and English language болот"),
    JUMA("Practice and lesson болот"),
    ISHENBI("practice and tennis болот"),
    JEKSHENBI("weekend");

    private String method;

    DaysOfTheWeek(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "DaysOfTheWeek{" +
                "Расписание: " + method +" " + super.toString();
    }
}
