package flappybirdinjava;

import java.net.URL;

public class Main {
    private static Frame frame;

    public static void main(String[] args) {
        frame = new Frame();
    }

    public static URL getPath(String path) {
        return Main.class.getResource(path);
    }

    public static Frame getFrame() {
        return frame;
    }

    public static int clamp(int number, int min, int max) {
        if (number < min) {
            return min;
        }
        else if (number > max) {
            return max;
        }
        return number;
    }
}