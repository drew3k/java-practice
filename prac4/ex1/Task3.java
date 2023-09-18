package prac4.ex1;

enum Seasonss {
    SPRING("средняя температура весной: 15°C"),
    SUMMER("средняя температура летом: 25°C"),
    AUTUMN("средняя температура осенью: 15°C"),
    WINTER("средняя температура зимой: -5°C");

    private final String temperature;

    Seasonss(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Seasonss favoriteSeason = Seasonss.SUMMER;

        System.out.println("Мое любимое время года - это " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getTemperature());
    }
}
