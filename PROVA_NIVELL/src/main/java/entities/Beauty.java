package entities;

import enums.Season;

public class Beauty extends Product {
    private boolean vegan;
    private Season season;

    public Beauty(String name, float price, boolean vegan, Season season) {
        super(name, price);
        this.vegan = vegan;
        this.season = season;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
