/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemaps;

/**
 *
 * @author ghostdaddy16
 */
import java.awt.geom.Point2D;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


public class GoogleMapsViewer extends JFXPanel {

    private final ArrayList<Marker> markers = new ArrayList<>();
    private WebEngine engine = null;
    private WebView webView = null;
    private final Set<Point2D> coordinateSet = new HashSet<>();
    private final Random random = new Random();

    public void loadMap(String mapLocation) {
        Platform.runLater(() -> {
            webView = new WebView();
            engine = webView.getEngine();
            engine.setJavaScriptEnabled(true);
            setScene(new Scene(webView));
            File f = new File(getClass().getClassLoader().getResource(mapLocation).getFile());
            engine.load(f.toURI().toString());
        });

    }


    public void addMarker(Marker marker) {

        Platform.runLater(() -> {
            engine.executeScript("addMarker(" + marker.getLat() + "," + marker.getLng() + ",'" + marker.getLabel() + "','" + marker.getInfo() + "'" + ")");
        });
    }
    
    

    /**
     * @return the coordinateSet
     */
    public Set<Point2D> getCoordinateSet() {
        return coordinateSet;
    }

}
