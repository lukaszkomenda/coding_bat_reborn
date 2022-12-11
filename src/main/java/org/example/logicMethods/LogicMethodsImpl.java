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

    @Override
    public int dateFashion(int you, int date) {
        if(you <= 2 || date <= 2)
            return 0;

        if(you >= 8 || date >= 8)
            return 2;

        return 1;
    }

    @Override
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer){
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    @Override
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday){
            if (speed <= 65){
                return 0;
            } else if (speed <= 85){
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 60){
                return 0;
            } else if (speed <= 80){
                return 1;
            } else {
                return 2;
            }
        }
    }

    @Override
    public int sortaSum(int a, int b) {
        int sum = a +b;

        if (sum >= 10 && sum <= 19){
            return 20;
        } else {
            return sum;
        }
    }

    @Override
    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day <= 5 && day != 0){
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (day <= 5 && day != 0){
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }
}
