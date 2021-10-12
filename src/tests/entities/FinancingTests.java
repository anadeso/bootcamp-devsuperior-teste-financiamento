package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        Financing financingTests = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, financingTests.getTotalAmount());
        Assertions.assertEquals(2000.0, financingTests.getIncome());
        Assertions.assertEquals(80, financingTests.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financingTests = new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidaData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidaData() {
        Financing financing = new Financing(100000.0, 3000.0, 80);

        financing.setIncome(2000.0);

        Assertions.assertEquals(2000.0, financing.getIncome());
    }

    @Test
    public void setIncomeThrowIllegalArgumentExceptionWhenInvalidData() {
       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 3000.0, 80);
            financing.setIncome(1000.0);
       });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidaData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setMonths(81);

        Assertions.assertEquals(81, financing.getMonths());
    }

    @Test
    public void settMonthsThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setMonths(20);
        });
    }

    @Test
    public void entryShouldSetDataWhenValidaData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldSetDataWhenValidaData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(1000.0, financing.quota());
    }
}
