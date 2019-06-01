package kz.idrissov.classOT.main;

import kz.idrissov.classOT.action.AbiturientAction;
import kz.idrissov.classOT.entity.Abiturient;
import kz.idrissov.classOT.report.AbiturientReport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Abiturient> list = new ArrayList<>();
        Abiturient a1 = new Abiturient(101, "Nazarbaev", "Nursultan", "Abishuly", "Nur-Sultan", "0001", 78.4f, 32.3f);
        Abiturient a2 = new Abiturient(102, "Idrissov", "Dauren", "Almasuly", "Almaty", "4321", 55.2f, 34.4f);
        Abiturient a3 = new Abiturient(103, "Qasym", "Zhomart", "Askaruly", "Nur-Sultan", "0002", 99.5f, 78.4f, 83.9f);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        AbiturientReport report = new AbiturientReport();

        System.out.println("Students with bad performance:");
        System.out.println(report.badPerformanceList(list));

        System.out.println("Students who got more than 60%:");
        System.out.println(report.moreThanGiven(60f, list));

        System.out.println("Top 2 students:");
        System.out.println(report.topNAbiturients(2, list));
    }
}
