package web.model;

public class Car {
    private String brand;
    private String series;
    private int year;

    public Car() {}

    public Car(String brand, String series, int year) {
        this.brand = brand;
        this.series = series;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                '}';
    }
}
