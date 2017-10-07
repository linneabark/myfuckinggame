package com.company;

import java.awt.*;
import java.util.Random;

/**
 * Created by linneabark on 2017-10-05.
 */
public class MapGenerator {
    public int map [][];
    public int brickWidth;
    public int brickHeight;
    public Random rand = new Random();
    public Color rC;


    public MapGenerator(int row, int col){
        map = new int[row][col];

        for(int i = 0; i< map.length; i++){
            for(int j =0; j<map[0].length; j++){
                map[i][j] =1;
            }
        }
        brickWidth = 540/col;
        brickHeight = 150/row;
    }
    public void draw(Graphics2D g){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] > 0){
                    rC = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
                    g.setColor(rC);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.white);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth,brickHeight);

                }
            }
        }
    }
    public void setBrickValue (int value, int row, int col){
        map[row][col] = value;
    }
}
