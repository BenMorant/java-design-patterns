package com.benmorant.designpatterns.structural.facade;

import java.sql.Connection;

/*
Facade pattern provides a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a
higher-level interface that makes the subsystem easier to use.

Suppose we have an application with set of interfaces to use MySql/Oracle database and to generate different types of
 reports, such as HTML report, PDF report etc.

So we will have different set of interfaces to work with different types of database. Now a client application can
use these interfaces to get the required database connection and generate reports.

But when the complexity increases or the interface behavior names are confusing, client application will find it
difficult to manage it.

So we can apply Facade design pattern here and provide a wrapper interface on top of the existing interface to help
client application.
 Notice the use of Java Enum for type safety.
 */
public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbType) {
        case MYSQL:
            con = MySqlHelper.getMySqlDBConnection();
            MySqlHelper mySqlHelper = new MySqlHelper();
            switch (reportType) {
            case HTML:
                mySqlHelper.generateMySqlHTMLReport(tableName, con);
                break;
            case PDF:
                mySqlHelper.generateMySqlPDFReport(tableName, con);
                break;
            }
            break;
        case ORACLE:
            con = OracleHelper.getOracleDBConnection();
            OracleHelper oracleHelper = new OracleHelper();
            switch (reportType) {
            case HTML:
                oracleHelper.generateOracleHTMLReport(tableName, con);
                break;
            case PDF:
                oracleHelper.generateOraclePDFReport(tableName, con);
                break;
            }
            break;
        }

    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }
}

