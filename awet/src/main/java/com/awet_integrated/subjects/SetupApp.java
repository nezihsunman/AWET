package com.awet_integrated.subjects;

import com.awet_integrated.subjects.config.DefaultConfig;
import com.awet_integrated.subjects.config.DimeshiftConfig;
import com.awet_integrated.subjects.config.EcommerceConfig;
import com.awet_integrated.subjects.config.PagekitConfig;
import com.awet_integrated.subjects.config.PetclinicConfig;
import com.awet_integrated.subjects.config.PhoenixConfig;
import com.awet_integrated.subjects.config.RetroboardConfig;
import com.awet_integrated.subjects.config.SplittypieConfig;
import com.awet_integrated.utils.Properties;
import org.apache.log4j.Logger;

public class SetupApp {

    private final static Logger logger = Logger.getLogger(SetupApp.class.getName());

    public static Config getConfig() {
        String applicationName = Properties.APPLICATION_NAME;
        for (String name: ApplicationNames.getValues()){
            if (name.equals(ApplicationNames.Name.ECOMMERCE.getName())
                    && name.equals(applicationName)) {
                return new EcommerceConfig();
            } else if(name.equals(ApplicationNames.Name.PETCLINIC.getName())
                    && name.equals(applicationName)) {
                return new PetclinicConfig();
            } else if(name.equals(ApplicationNames.Name.DIMESHIFT.getName())
                    && name.equals(applicationName)) {
                return new DimeshiftConfig();
            } else if(name.equals(ApplicationNames.Name.SPLITTYPIE.getName())
                    && name.equals(applicationName)) {
                return new SplittypieConfig();
            } else if(name.equals(ApplicationNames.Name.RETROBOARD.getName())
                    && name.equals(applicationName)) {
                return new RetroboardConfig();
            } else if(name.equals(ApplicationNames.Name.PHOENIX.getName())
                    && name.equals(applicationName)) {
                return new PhoenixConfig();
            } else if(name.equals(ApplicationNames.Name.PAGEKIT.getName())
                    && name.equals(applicationName)) {
                return new PagekitConfig();
            }
        }

        logger.warn("Unknown application name " + applicationName + ". See "
                + ApplicationNames.class + " for reference. Running with default configuration...");
        return new DefaultConfig();
    }


}
