package Callculator;

import Logger.Logger;


public class ComCal implements Calculator {
    private Logger log;

    public ComCal(Logger log){
        this.log = log;
    }

    @Override
    public Operation add(Operation n1, Operation n2) {
        Operation result = n1.add(n2);
        log.Resultat(n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public Operation multiply(Operation n1, Operation n2) {
        Operation result = n1.multiplication(n2);
        log.Resultat(n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public Operation divide(Operation n1, Operation n2) {
        Operation result = n1.divide(n2);
        log.Resultat(n1 + " / " + n2 + " = " + result);
        return result;
    }
}
