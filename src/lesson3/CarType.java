package lesson3;

import lesson2.Drawable;

public enum CarType implements Drawable {

    // public static final CarType HATCHBACK = new CarType():
//    HATCHBACK, SEDAN, SUV;
    // public static final CarType HATCHBACK = new CarType("Хетчбек"):
    HATCHBACK("Хетчбек"){
        @Override
        public String draw() {
            return "Hatchbacks are green - Override in enum";
        }
    },
    SEDAN("Седан"){
        @Override
        public String draw() {
            return "Sedans are black - Override in enum";
        }
    },
    SUV("Кросовер"){
        @Override
        public String draw() {
            return "SUVs are blue - Override in enum";
        }
    };

    private String ukrainianTranslation;

    CarType(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }

    public String getUkrainianTranslation() {
        return ukrainianTranslation;
    }

    public void setUkrainianTranslation(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "ukrainianTranslation='" + ukrainianTranslation + '\'' +
                "} " + super.toString();
    }
}
