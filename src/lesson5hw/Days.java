package lesson5hw;

public enum Days {
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П’ятниця"),
    SATURDAY("Субота"),
    SUNDAY("Неділя");

    private String ukrainianTranslation;

    Days() {
    }

    Days(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }

    public String getUkrainianTranslation() {
        return ukrainianTranslation;
    }

    public void setUkrainianTranslation(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }

    @Override
    public String toString() {
        return "Days{" +
                "ukrainianTranslation='" + ukrainianTranslation + '\'' +
                "} " + super.toString();
    }
}
