package molgrp.logging.loggingtest;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class LoggingTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.setProperty("log4j2.configurationFile", "/home/eaicdci/NetBeansProjects/LoggingTest/doc/log4j2.xml");
        
        System.setProperty("log4j.configurationFile", "/home/eaicdci/NetBeansProjects/LoggingTest/doc/logCfg_FCBC_Interfaces.xml");
        
//        System.setProperty("log4j1.compatibility", "true");
        
//        org.apache.logging.log4j.Logger log2 =  LogManager.getLogger("test.log4j2migration_log4j2");
        
        org.apache.log4j.Logger log1 = org.apache.log4j.Logger.getLogger("hu.mol.eai.rdbmsPoller");
        
        
        
//        log2.info("Nyiri Imre xxx");
        
        log1.info("Ez log4j 1 üzenet xxx");
        
        
       
        
        
        
        
    }
}
