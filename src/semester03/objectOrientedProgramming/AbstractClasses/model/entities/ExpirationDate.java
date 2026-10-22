package semester03.objectOrientedProgramming.AbstractClasses.model.entities;

import semester03.objectOrientedProgramming.AbstractClasses.model.interfaces.Validator;

public class ExpirationDate implements Validator {
    private int expirationDay, expirationMonth, expirationYear;

    public ExpirationDate(int expirationDay, int expirationMonth, int expirationYear) {
        this.expirationDay = expirationDay;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isValid(int currentDay, int currentMonth, int currentYear) {

        if (expirationYear != currentYear)
            return currentYear < expirationYear;
        if (expirationMonth != currentMonth)
            return currentMonth < expirationMonth;
        if (expirationDay != currentDay)
            return currentDay < expirationDay;

        return true;
    }
}
