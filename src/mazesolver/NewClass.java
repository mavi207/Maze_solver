package mazesolver;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NewClass extends JFrame {

    private int[][] maze=
            {
                    {1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,1,0,1,0,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,1,0,1,1,1,0,1},
                    {1,0,1,1,1,1,1,0,0,0,0,0,1},
                    {1,0,0,1,0,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,0,1},
                    {1,0,1,0,1,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,0,0,0,0,0,0,0,0,1,9,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1},
            };
    public List<Integer> path=new ArrayList<Integer>();

    public NewClass(){
        setTitle("Maze Solver");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This will close the whole operation
        DepthFirst.searchPath(maze,1,1,path);
    }

    @Override
    public void paint(Graphics g){
        // design of grid
        g.translate(100,100);
        // this will push te grid and start grid from x,y coordinate
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                Color color;
                switch (maze[i][j]){
                    case 1:color=Color.BLACK;break;
                    case 9:color=Color.RED;break;
                    default:color=Color.GRAY;break;
                }
                g.setColor(color);
                g.fillRect(30*j,30*i,30,30);
                g.setColor(Color.RED);
                g.drawRect(30*j,30*i,30,30);
            }
        }

        for(int i=0;i<path.size();i+=2){
            int pathx=path.get(i);
            int pathy=path.get(i+1);

            g.setColor(Color.blue);
            g.fillRect(pathx*30,pathy*30,20,20);
        }
    }

    public static void main(String[] args){
        NewClass view=new NewClass();
        view.setVisible(true);
    }

}
