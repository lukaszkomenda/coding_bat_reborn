package org.example.logicMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicMethodsImplTest {

    LogicMethods logicMethods = new LogicMethodsImpl();

    @Test
    void cigarPartyThirdNoWeekendTest() {
        //given
        int cigars = 30;
        boolean isWeekend = false;
        //when
        boolean isInRange = logicMethods.cigarParty(cigars, isWeekend);
        //then
        assertFalse(isInRange);
    }

    @Test
    void cigarPartyFiftyNoWeekendTest(){
        //given
        int cigars = 50;
        boolean isWeekend = false;
        //when
        boolean isInRange = logicMethods.cigarParty(cigars, isWeekend);
        //then
        assertTrue(isInRange);
    }
}