/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.salon.util;

import java.sql.*;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.print.JRPrinterAWT;

/**
 *
 * @author SAK
 */
public class ReportAdministration {

    public static void runReport(Connection jdbcConnection, String reportFile, HashMap parameter) throws JRException {
        //JasperPrint jasperPrint = JasperFillManager.fillReport(String.class.getResourceAsStream(reportFile), parameter, jdbcConnection);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportFile, parameter, jdbcConnection);
        JasperViewer.viewReport(jasperPrint,false);
    }

    public static void printReport (Connection jdbcConnection, String reportFile, HashMap parameter, int firstPageIndex, int lastPageIndex, Boolean printdialog) throws JRException {
        //JasperPrint jasperPrint = JasperFillManager.fillReport(String.class.getResourceAsStream(reportFile), parameter, jdbcConnection);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportFile, parameter, jdbcConnection);
        JRPrinterAWT.printPages(jasperPrint, firstPageIndex, lastPageIndex, printdialog);
    }

   public static String getReportFile () {
       return "src/com/salon/reports/";
   }
}
