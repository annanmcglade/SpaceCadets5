import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class MyPanel  extends javax.swing.JPanel {
    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
      ArrayList<String[]> input = UserInput.getInput();
      if (input.size() == 0){
          System.exit(0);
      }
      for (String[] spiral: input) {
          g2D.setPaint(Color.decode(spiral[4]));
          g2D.setStroke(new BasicStroke(parseInt(spiral[3])));
          Spiral s = new Spiral(parseInt(spiral[0]), parseInt(spiral[1]), parseInt(spiral[2]));
          ArrayList<int[]> List = s.generateCoordinates();
          for (int i = 0; i < List.size() - 1; i++) {
              g2D.drawLine(List.get(i)[0], List.get(i)[1], List.get(i + 1)[0], List.get(i + 1)[1]);
          }
      }

    }
}
