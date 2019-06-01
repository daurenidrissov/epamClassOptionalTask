package kz.idrissov.classOT.action;

import kz.idrissov.classOT.entity.Abiturient;

import java.math.BigDecimal;

public class AbiturientAction {
    public float averageGrade(Abiturient abiturient) {
        float sum = 0.0f;
        float mean;
        for(int i = 0; i < abiturient.getGrades().length; i++) {
            sum += abiturient.getGrades()[i];
        }
        mean = sum / abiturient.getGrades().length;
        return mean;
    }
}
