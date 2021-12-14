import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Spiral {
    int R;
    int r;
    int O;

    public Spiral(int R, int r, int O){
        this.R = R;
        this.r = r;
        this.O = O;
    }

    public ArrayList<int[]> generateCoordinates(){
        int[] firstXY = {(R-r) + O, 0};
        int[] newXY = new int[2];
        double t = 0;
        ArrayList<int[]> coords = new ArrayList<>();
        coords.add(convertCoords(firstXY));
        while (!(compare(newXY, firstXY))){
            int[] XY = new int[2];
            XY[0] = (int) Math.round((R-r)*cos(t) + O*cos(((double) (R-r)/r)*t));
            XY[1] = (int) Math.round((R-r)*sin(t) - O*sin(((double) (R-r)/r)*t));
            t += 0.1;
            if (!(compare(coords.get(coords.size() - 1), convertCoords(XY)))){
                coords.add(convertCoords(XY));
                System.out.println(Arrays.toString(XY));
                newXY = XY;
                    }
        }
        return coords;
    }
    private boolean compare(int[] XY1, int[] XY2){
        for (int i = 0; i < XY1.length; i++){
            if(XY1[i] != XY2[i]){
                return false;
            }
        }
        return true;
    }

    private int[] convertCoords(int[] XY){
        return new int[]{XY[0] + 250, XY[1] + 250};
    }

}
