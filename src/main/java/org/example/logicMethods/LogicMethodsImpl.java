package org.example.logicMethods;

public class LogicMethodsImpl implements LogicMethods{
    @Override
    public boolean cigarParty(int cigars, boolean isWeekend) {

        boolean isInRange = cigars >= 40 && cigars <= 60;

        if (isInRange){
            return true;
        } else {
            return isWeekend && cigars >= 40;
        }
    }
}
