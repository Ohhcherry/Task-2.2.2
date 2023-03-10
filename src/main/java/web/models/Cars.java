package web.models;



public class Cars {
    private String model;
    private String series;
    private int horsePower;

    public Cars(java.lang.String model, java.lang.String series, int horsePower) {
        this.model = model;
        this.series = series;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
