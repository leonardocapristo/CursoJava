package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    protected LocalDate duedate;
    protected Double amount;

    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Installment() {
    }

    public Installment(LocalDate duedate, Double amount) {
        this.duedate = duedate;
        this.amount = amount;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return " parcelas : " + duedate + " R$ : "+ amount;
    }
}
