/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatortesting;

/**
 *
 * @author aster
 */
public class CalculatorTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
       
        
        Calculator.openBrowser();
        Thread.sleep(4000);
        Calculator.sumTwoNumbers();
        Thread.sleep(4000);
        Calculator.checkResultSum();
        Thread.sleep(4000);
        Calculator.clearAll();
        Thread.sleep(4000);
        Calculator.trigonometricSelection();
        Thread.sleep(4000);
        Calculator.cosCompute();
        Thread.sleep(4000);
        Calculator.checkResultCos();
        Thread.sleep(4000);
        Calculator.divideTwoNumbers();
        Thread.sleep(4000);
        Calculator.currencyCalculator();
        Thread.sleep(8000);
        Calculator.findCurrency();
        Thread.sleep(5000);
        Calculator.closeChrome();
        
    }
    
}
