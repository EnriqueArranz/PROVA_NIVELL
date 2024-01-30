package entities;

import java.time.LocalDate;
import java.util.Date;

public class Electrodomestic extends Product {
    private int consumo;
    private LocalDate fabricDate;
    private int maxKgs;
    private Date garantia;


    public Electrodomestic(String name, float price, int consumo, LocalDate fabricDate, int maxKgs) {
        super(name, price);
        this.consumo = consumo;
        this.fabricDate = fabricDate;
        this.maxKgs = maxKgs;

    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public LocalDate getFabricDate() {
        return fabricDate;
    }

    public void setFabricDate(LocalDate fabricDate) {
        this.fabricDate = fabricDate;
    }

    public int getMaxKgs() {
        return maxKgs;
    }

    public void setMaxKgs(int maxKgs) {
        this.maxKgs = maxKgs;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantiaSumada) {
        this.garantia = garantiaSumada;
    }
}
