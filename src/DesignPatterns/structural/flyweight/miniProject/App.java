package DesignPatterns.structural.flyweight.miniProject;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        MapMarker marker1 = new MapMarker(10, 20, MarkerStyleFactory.getStyle("Hospital", "Red"));
        MapMarker marker2 = new MapMarker(30, 40, MarkerStyleFactory.getStyle("Hospital", "Red"));
        MapMarker marker3 = new MapMarker(50, 60, MarkerStyleFactory.getStyle("Restaurant", "Orange"));

        marker1.render();
        marker2.render();
        marker3.render();
    }
}

class MarkerStyle {
    private final String iconName;
    private final String color;

    public MarkerStyle(String iconName, String color) {
        this.iconName = iconName;
        this.color = color;
    }

    public void render(int x, int y) {
        System.out.println(iconName + " marker at " + x + "," + y + " color=" + color);
    }
}

class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<String, MarkerStyle>();

    public static MarkerStyle getStyle(String iconName, String color) {
        String key = iconName + "-" + color;
        MarkerStyle style = styles.get(key);
        if (style == null) {
            style = new MarkerStyle(iconName, color);
            styles.put(key, style);
            System.out.println("Created marker style: " + key);
        }
        return style;
    }
}

class MapMarker {
    private final int x;
    private final int y;
    private final MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        style.render(x, y);
    }
}
