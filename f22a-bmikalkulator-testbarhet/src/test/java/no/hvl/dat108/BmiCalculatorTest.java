package no.hvl.dat108;

import static no.hvl.dat108.BmiVektklasse.NORMALVEKT;
import static no.hvl.dat108.BmiVektklasse.UNDERVEKT;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BmiCalculatorTest {
    
    private BmiCalculator bmiCalc = new BmiCalculator(); 
    
    @Test
    public void bmiPaaAttenKommaFireSkalVaereUndervekt() {
        assertEquals(UNDERVEKT, bmiCalc.beregnVektklasse(18.4));
    }

    @Test
    public void bmiPaaAttenKommaFemSkalVaereNormalvekt() {
        assertEquals(NORMALVEKT, bmiCalc.beregnVektklasse(18.5));
    }
    
    //+ mange flere tester på denne metoden
    
    @Test
    public void avrundingAvKomma45SkalVaereKomma5() {
        assertEquals(20.5, bmiCalc.rundAvTilEnDesimal(20.45), Double.MIN_VALUE);
    }

    @Test
    public void avrundingAvKomma44SkalVaereKomma4() {
        assertEquals(20.4, bmiCalc.rundAvTilEnDesimal(20.44), Double.MIN_VALUE);
    }

    //+ flere tester på denne metoden
    
    /* 
     * osv ... på de andre metodene:
     * 
     *      double beregnBmi(double hoydeMeter, double vektKg)
     *      boolean gyldigHoydeMeter(double hoydeMeter)
     *      boolean gyldigVektKg(double vektKg)
     */
    
}
