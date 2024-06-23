public class shortestPath {

    public static String path(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'E' -> x++;
                case 'W' -> x--;
                case 'N' -> y++;
                case 'S' -> y--;
                default -> {
                }
            }
        }
        String newPath = "";
        if (x>0) {
            for (int i = 0; i < x; i++) {
            newPath += "E";
        }
        }
        else if (x<0) {
            x = -x;
            for (int i = 0; i < x; i++) {
            newPath += "W";
        }
        }
        if (y>0) {
            for (int i = 0; i < y; i++) {
            newPath += "N";
        }
        }
        else if (y<0) {
            y = -y;
            for (int i = 0; i < y; i++) {
            newPath += "S";
        }
        }
        return newPath;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(displacement(path));
    }

    public static float displacement(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'E' -> x++;
                case 'W' -> x--;
                case 'N' -> y++;
                case 'S' -> y--;
                default -> {
                }
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }    

}
