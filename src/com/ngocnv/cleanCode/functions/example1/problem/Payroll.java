package com.ngocnv.cleanCode.functions.example1.problem;

public class Payroll {

    private static final int COMMISSIONED = 1;
    private static final int HOURLY = 2;
    private static final int SALARIED = 3;

    /**
     * <p>
     *     There are several problems with this function.
     *     First, itÅfs large, and when new employee types are added, it will grow.
     *     Second, it very clearly does more than one thing.
     *     Third, it violates the Single Responsibility Principle7 (SRP) because there is more than one reason for it to change.
     *     Fourth, it violates the Open Closed Principle8 (OCP) because it must change whenever new types are added.
     *     But possibly the worst problem with this function is that there are an unlimited number of other functions that will have the same structure.
     *     For example we could have
     *          isPayday(IEmployee e, Date date),
     *      or
     *          deliverPay(IEmployee e, Money pay),
     *      or a host of others. All of which would have the same deleterious structure.
     * </p>
     * @param e
     * @return
     * @throws InvalidEmployeeType
     */
    public Double calculatePay(Employee e) throws InvalidEmployeeType {

        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    private Double calculateSalariedPay(Employee e) {
        return null;
    }

    private Double calculateHourlyPay(Employee e) {
        return null;
    }

    private Double calculateCommissionedPay(Employee e) {
        return null;
    }
}
