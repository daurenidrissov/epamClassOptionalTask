package kz.idrissov.classOT.report;

import kz.idrissov.classOT.action.AbiturientAction;
import kz.idrissov.classOT.entity.Abiturient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AbiturientReport {
    private static final float PASSING_GRADE = 50.0f;
    public StringBuilder badPerformanceList(ArrayList<Abiturient> list) {
        StringBuilder sb = new StringBuilder();
        for(Abiturient abiturient : list) {
            for(int i = 0; i < abiturient.getGrades().length; i++) {
                if(abiturient.getGrades()[i] < PASSING_GRADE) {
                    sb.append(abiturient.getId() + " " + abiturient.getSurname() + " " + abiturient.getName());
                    sb.append("\n");
                    break;
                }
            }
        }
        return sb;
    }

    public StringBuilder moreThanGiven(float given, ArrayList<Abiturient> list) {
        StringBuilder sb = new StringBuilder();
        AbiturientAction action = new AbiturientAction();
        for(Abiturient abiturient : list) {
            if(action.averageGrade(abiturient) > given) {
                sb.append(abiturient.getId() + " " + abiturient.getSurname() + " " + abiturient.getName());
                sb.append("\n");
            }
        }
        return sb;
    }

    public StringBuilder topNAbiturients(int n, ArrayList<Abiturient> list) {
        StringBuilder sb = new StringBuilder();
        AbiturientAction action = new AbiturientAction();
        Comparator<Abiturient> compareByGrade = (Abiturient a1, Abiturient a2) -> Float.compare(action.averageGrade(a1), action.averageGrade(a2));
        Collections.sort(list, compareByGrade.reversed());
        for(Abiturient abiturient : list.stream().limit(n).collect(Collectors.toList())) {
            sb.append(abiturient.getId() + " " + abiturient.getSurname() + " " + abiturient.getName());
            sb.append("\n");
        }
        return sb;
    }
}
