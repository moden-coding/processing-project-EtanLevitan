
//#region Useless
import java.awt.Color;
import java.util.Random;

import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    int total = 0;

    public void settings() {
        size(1200, 810);
    }

    public void setup() {
        background(75);
    }

    // #endregion
    public void draw() {
        background(75);
        yellowlines();
        fence();
        car();
    }

    int teleport = 0;
    int color = 0;
    int down = 0;
    int left = 0;
    int right = 0;
    int tp2 = 550 + teleport;

    @Override
    public void keyPressed() {
        if (keyCode == LEFT) {
            teleport -= 50;
        } else if (keyCode == RIGHT) {
            teleport += 50;
        }
    }



    public void Collisions(){
        if(){

        }
    }
    
    
    
    
    public void car() {
        noStroke();
        fill(0,0,225);
        rect(550 + teleport, 550, 75, 150);
        triangle(550+teleport, 550, 625+teleport, 550, 587+teleport, 540);
        fill(0);
        circle(540+teleport, 585, 40);
        circle(540+teleport, 665, 40);
        circle(630+teleport, 585, 40);
        circle(630+teleport, 665, 40);
        fill(120);
        rect(570+teleport,700,10,10);
        rect(590+teleport,700,10,10);

    }

    // #region Fence
    int cnt = 0;
    int randomNumber = (int) (Math.random() * 3) + 1;

    public void fence() {
        noStroke();
        if (cnt == 910) {
            cnt = 0;
            randomNumber = (int) (Math.random() * 3) + 1;
        }
        if (randomNumber == 1) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(0, -100 + cnt, 400, 100);
                cnt++;
                fill(75);
                rect(0, -200 + cnt, 400, 100);
            }
        } else if (randomNumber == 2) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(410, -100 + cnt, 390, 100);
                cnt++;
                fill(75);
                rect(410, -200 + cnt, 390, 100);
            }
        } else if (randomNumber == 3) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(810, -100 + cnt, 400, 100);
                cnt++;
                fill(75);
                rect(810, -200 + cnt, 400, 100);
            }

        }
    }

    // #endregion
    // #region yellowlines
    int count = 0;
    int count2 = 40;
    int count3 = 80;
    int count4 = 120;
    int count5 = 160;
    int c6 = 200;
    int c7 = 240;
    int c8 = 280;
    int c9 = 320;
    int c10 = 360;
    int c11 = 400;
    int c12 = 440;
    int c13 = 480;
    int c14 = 520;
    int c15 = 560;
    int c16 = 600;
    int c17 = 640;
    int c18 = 680;
    int c19 = 720;
    int c20 = 760;
    int c21 = 800;

    public void yellowlines() {
        if (count != 810) {
            noStroke();
            fill(225, 225, 0);
            rect(400, count, 10, 20);
            rect(800, count, 10, 20);
            count++;
            fill(75);
            rect(400, -20 + count, 10, 20);
            rect(800, -20 + count, 10, 20);
        } else if (count == 810) {
            count = 0;
        }
        if (count2 != 810) {
            fill(225, 225, 0);
            rect(400, count2, 10, 20);
            rect(800, count2, 10, 20);
            count2++;
            fill(75);
            rect(400, -20 + count2, 10, 20);
            rect(800, -20 + count2, 10, 20);
        } else if (count2 == 810) {
            count2 = 0;
        }
        if (count3 != 810) {
            fill(225, 225, 0);
            rect(400, count3, 10, 20);
            rect(800, count3, 10, 20);
            count3++;
            fill(75);
            rect(400, -20 + count3, 10, 20);
            rect(800, -20 + count3, 10, 20);
        } else if (count3 == 810) {
            count3 = 0;
        }
        if (count4 != 810) {
            fill(225, 225, 0);
            rect(400, count4, 10, 20);
            rect(800, count4, 10, 20);
            count4++;
            fill(75);
            rect(400, -20 + count4, 10, 20);
            rect(800, -20 + count4, 10, 20);
        } else if (count4 == 810) {
            count4 = 0;
        }
        if (count5 != 810) {
            fill(225, 225, 0);
            rect(400, count5, 10, 20);
            rect(800, count5, 10, 20);
            count5++;
            fill(75);
            rect(400, -20 + count5, 10, 20);
            rect(800, -20 + count5, 10, 20);
        } else if (count5 == 810) {
            count5 = 0;
        }
        if (c6 != 810) {
            fill(225, 225, 0);
            rect(400, c6, 10, 20);
            rect(800, c6, 10, 20);
            c6++;
            fill(75);
            rect(400, -20 + c6, 10, 20);
            rect(800, -20 + c6, 10, 20);
        } else if (c6 == 810) {
            c6 = 0;
        }
        if (c7 != 810) {
            fill(225, 225, 0);
            rect(400, c7, 10, 20);
            rect(800, c7, 10, 20);
            c7++;
            fill(75);
            rect(400, -20 + c7, 10, 20);
            rect(800, -20 + c7, 10, 20);
        } else if (c7 == 810) {
            c7 = 0;
        }
        if (c8 != 810) {
            fill(225, 225, 0);
            rect(400, c8, 10, 20);
            rect(800, c8, 10, 20);
            c8++;
            fill(75);
            rect(400, -20 + c8, 10, 20);
            rect(800, -20 + c8, 10, 20);
        } else if (c8 == 810) {
            c8 = 0;
        }
        if (c9 != 810) {
            fill(225, 225, 0);
            rect(400, c9, 10, 20);
            rect(800, c9, 10, 20);
            c9++;
            fill(75);
            rect(400, -20 + c9, 10, 20);
            rect(800, -20 + c9, 10, 20);
        } else if (c9 == 810) {
            c9 = 0;
        }
        if (c10 != 810) {
            fill(225, 225, 0);
            rect(400, c10, 10, 20);
            rect(800, c10, 10, 20);
            c10++;
            fill(75);
            rect(400, -20 + c10, 10, 20);
            rect(800, -20 + c10, 10, 20);
        } else if (c10 == 810) {
            c10 = 0;
        }
        if (c11 != 810) {
            fill(225, 225, 0);
            rect(400, c11, 10, 20);
            rect(800, c11, 10, 20);
            c11++;
            fill(75);
            rect(400, -20 + c11, 10, 20);
            rect(800, -20 + c11, 10, 20);
        } else if (c11 == 810) {
            c11 = 0;
        }
        if (c12 != 810) {
            fill(225, 225, 0);
            rect(400, c12, 10, 20);
            rect(800, c12, 10, 20);
            c12++;
            fill(75);
            rect(400, -20 + c12, 10, 20);
            rect(800, -20 + c12, 10, 20);
        } else if (c12 == 810) {
            c12 = 0;
        }
        if (c13 != 810) {
            fill(225, 225, 0);
            rect(400, c13, 10, 20);
            rect(800, c13, 10, 20);
            c13++;
            fill(75);
            rect(400, -20 + c13, 10, 20);
            rect(800, -20 + c13, 10, 20);
        } else if (c13 == 810) {
            c13 = 0;
        }
        if (c14 != 810) {
            fill(225, 225, 0);
            rect(400, c14, 10, 20);
            rect(800, c14, 10, 20);
            c14++;
            fill(75);
            rect(400, -20 + c14, 10, 20);
            rect(800, -20 + c14, 10, 20);
        } else if (c14 == 810) {
            c14 = 0;
        }
        if (c15 != 810) {
            fill(225, 225, 0);
            rect(400, c15, 10, 20);
            rect(800, c15, 10, 20);
            c15++;
            fill(75);
            rect(400, -20 + c15, 10, 20);
            rect(800, -20 + c15, 10, 20);
        } else if (c15 == 810) {
            c15 = 0;
        }
        if (c16 != 810) {
            fill(225, 225, 0);
            rect(400, c16, 10, 20);
            rect(800, c16, 10, 20);
            c16++;
            fill(75);
            rect(400, -20 + c16, 10, 20);
            rect(800, -20 + c16, 10, 20);
        } else if (c16 == 810) {
            c16 = 0;
        }
        if (c17 != 810) {
            fill(225, 225, 0);
            rect(400, c17, 10, 20);
            rect(800, c17, 10, 20);
            c17++;
            fill(75);
            rect(400, -20 + c17, 10, 20);
            rect(800, -20 + c17, 10, 20);
        } else if (c17 == 810) {
            c17 = 0;
        }
        if (c18 != 810) {
            fill(225, 225, 0);
            rect(400, c18, 10, 20);
            rect(800, c18, 10, 20);
            c18++;
            fill(75);
            rect(400, -20 + c18, 10, 20);
            rect(800, -20 + c18, 10, 20);
        } else if (c18 == 810) {
            c18 = 0;
        }
        if (c19 != 810) {
            fill(225, 225, 0);
            rect(400, c19, 10, 20);
            rect(800, c19, 10, 20);
            c19++;
            fill(75);
            rect(400, -20 + c19, 10, 20);
            rect(800, -20 + c19, 10, 20);
        } else if (c19 == 810) {
            c19 = 0;
        }
        if (c20 != 810) {
            fill(225, 225, 0);
            rect(400, c20, 10, 20);
            rect(800, c20, 10, 20);
            c20++;
            fill(75);
            rect(400, -20 + c20, 10, 20);
            rect(800, -20 + c20, 10, 20);
        } else if (c20 == 810) {
            c20 = 0;
        }
    }
    // #endregion
}
