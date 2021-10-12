package entities;

public class Financing {

    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing(Double totalAmount, Double income, Integer months) {
        validaPrestacao(totalAmount, income, months);
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        validaPrestacao(totalAmount, income, months);
        this.totalAmount = totalAmount;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        validaPrestacao(totalAmount, income, months);
        this.income = income;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        validaPrestacao(totalAmount, income, months);
        this.months = months;
    }

    public Double entry() {
        return totalAmount * 0.20;
    }

    public Double quota() {
        return (totalAmount - entry()) / months;
    }

    private void validaPrestacao(double totalAmount, double income, int months) {
        // 80% valor total e metade da renda
        if(totalAmount * 0.8 / months > income / 2.0) {
            throw new IllegalArgumentException("A parcela não pode ser maior que a metade da renda");
        }
    }

}
