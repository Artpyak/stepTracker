package com.example.stepTracker;

public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    private int typeCode;
    //private String name1;
    Months(int typeCode) {
        this.typeCode = typeCode;
    }

    /*Months(String name) {
        this.name1 = name;
    }*/

    public static Months getTemplateByCode(int typeCode) {
        for (Months type : Months.values()){
            if (type.typeCode == typeCode) {
                return type;
            }
        }
        throw new RuntimeException("Вариант не найден");
    }

    /*public static Months getInstance(String month) {
        for (Months type : Months.values()) {
            if (type.name1 == month) {
                return type;
            }
        }
        throw new RuntimeException("!!!!");
    }*/
}

