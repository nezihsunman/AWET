package com.awet_integrated.crawling;

import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.StateVertex;
import com.awet_integrated.subjects.Config;
import com.awet_integrated.subjects.SetupApp;
import com.awet_integrated.utils.Properties;
import org.apache.log4j.Logger;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class CrawlApp {

    private final static Logger logger = Logger.getLogger(CrawlApp.class.getName());
    public static List<StateVertex> finalState = new ArrayList<>();
    public static List<Eventable> finalEvents = new ArrayList<>();
    //public static Graph finalGraph = new SingleGraph("FinalGraph");
    private static String stylesheet = "" +
            "node {" +
            " shape: rounded-box;" +
            " fill-color: grey;" +
            " fill-mode: dyn-plain;" +
            " size-mode: fit;" +
            " size: 20px;" +
            " text-alignment: under; text-color: black; text-style: bold; text-size: 20;" +
            "}" +
            "node.active {" +
            " fill-color: green;" +
            " size:40px;" +
            "}" +
            "edge {" +
            " shape: cubic-curve;" +
            " size: 3px;" +
            " arrow-shape: arrow;" +
            " text-alignment: under; text-color: #74d4c0; text-size:20;" +
            "}" +
            "edge.active {" +
            " fill-color: green;" +
            " size: 5px;" +
            "}";


    /**
     * Run this method to start the crawl.
     *
     * @throws IOException when the output folder cannot be created or emptied.
     */
    public static void main(String[] args) {
		/*System.setProperty("org.graphstream.ui.renderer.mvn gs.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		PetClinicStateConfiguration stateConfiguration = null;

		finalGraph.addAttribute("ui.quality");
		finalGraph.addAttribute("ui.antialias");
		finalGraph.addAttribute("ui.stylesheet", stylesheet);
*/
        config();

        Properties.getInstance().checkPropertyNotEmpty(Properties.CRAWL_PATH_SEPARATOR,
                "crawl_path_separator");

        Config config = SetupApp.getConfig();
        CrawljaxConfigurationBuilder builder = config.getCrawljaxConfig();

        CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());

        try {
            crawljax.call();
        } catch (Exception ex) {
            logger.error("Exception in crawljax: " + ex);
        }

    }

    private static void config() {
        instantiateProperties();
    }

    private static void instantiateProperties() {
        Properties.getInstance().createPropertiesFile();
    }
}
