package az.hafizrzazade.brickbreakergame.main;

import javax.swing.JFrame;

import az.hafizrzazade.brickbreakergame.game.GamePlay;

public class MainClass {
   public static void main(String[] args) {
       JFrame obj = new JFrame();
       GamePlay gameplay = new GamePlay();
       obj.setBounds(10,10,700,600);
       obj.setTitle("BrickBreaker");
       obj.setResizable(false);
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gameplay);
   }
}
