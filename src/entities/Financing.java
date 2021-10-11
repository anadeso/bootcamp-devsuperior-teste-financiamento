package entities;

public class Financing {

    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing() {
    }

    public Financing(Double totalAmount, Double income, Integer months) {
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    private Double entry() {
        return totalAmount * 0.20;
    }

    private Double quota() {
        return (totalAmount - entry()) / months;
    }

    private void validaPrestacao(double income, int months, double totalAmount) {
        if(totalAmount * 0.8 / months > income) {
            throw new IllegalArgumentException("A parcela não pode ser maior que a metade da renda");
        }
    }

}
