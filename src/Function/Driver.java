/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import GUI.Home;

/**
 *
 * @author mtauf
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home h = new Home();
        double data[][] = new double[][]{{0, 0, 1.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.38, 0, 0, 0, 0, 0},
                                         {1.1, 0, 0, 0, 0, 0, 0.36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.68, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0.22, 0, 0, 0.45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.17, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0.22, 0, 0.41, 0, 0, 0, 0, 0, 0, 0, 0.99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0.41, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0.36, 0, 0, 0, 0, 0.55, 0.74, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0.45, 0, 0, 0.55, 0, 0, 0, 0, 0.76, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0.74, 0, 0, 0.59, 0, 0, 0, 0, 0.16, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0.59, 0, 0.36, 0, 0, 0, 0.78, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0.36, 0, 0.21, 0, 0, 0, 0.69, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0.76, 0, 0, 0.21, 0, 0.48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.48, 0, 0.13, 0, 0, 0.52, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0.99, 0, 0, 0, 0, 0, 0, 0, 0.13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.94, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0.16, 0.78, 0, 0, 0, 0, 0, 0, 0, 0.85, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.69, 0, 0, 0, 0, 0, 0.32, 1.37, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.52, 0, 0, 0.32, 0, 0, 0, 0, 0.67, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.85, 1.37, 0, 0, 0, 1.4, 0, 0, 0, 0},
                                         {0, 0.38, 0.68, 0.17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.4, 0, 0, 1, 0, 0, 1.5},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.67, 0, 0, 1, 0, 0.1, 0, 0},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1, 0, 0.62, 0.38},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.94, 0, 0, 0, 0, 0, 0, 0, 0.62, 0, 1},
                                         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0.38, 1, 0},
                                        };
        h.setMatrix(data);
        h.setVisible(true);
    }
    
}
