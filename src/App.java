
//#region Useless

import processing.core.*;

public class App extends PApplet {

    int stage = 0;

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
        if (stage == 0) {
            startscreen();
        } else if (stage == 1) {
            if (score <= 25) {
                background(75);
                yellowlines();
                fence1();
                car();
                score();
                speed();
                if (Collisions() == true) {
                    stage = 2;
                    score = 0;
                }
            } else if (score > 25 && score < 100) {
                background(75);
                yellowlines();
                fence1();
                fence2();
                car();
                score();
                speed();
                if (Collisions() == true || Collisions2() == true) {
                    stage = 2;
                    score = 0;
                }
            } else if (score >= 100) {
                stage = 3;
            }
        } else if (stage == 2) {
            background(75);
            Endscreen();
        } else if (stage == 3) {
            winscreen();
            if (mousePressed) {
                stage = 1;
            }
        }

    }

    int score = 0;
    int teleport = 0;
    int color = 0;
    int down = 0;
    int left = 0;
    int right = 0;
    int tp2 = 550 + teleport;

    int carupcounter = 0;

    public void winscreen() {
        yellowlines();
        car();
        score();
        textAlign(CENTER, CENTER);
        textSize(100);
        fill(225);
        text("You won! congrats!", 600, 405);
    }

    @Override
    public void keyPressed() {
        if (stage == 1) {
            if (keyCode == LEFT || key == 'a') {
                teleport -= 400;
            } else if (keyCode == RIGHT || key == 'd') {
                teleport += 400;
            }
        }
        if (teleport > 400) {
            teleport = 400;
        }
        if (teleport < -400) {
            teleport = -400;
        }

    }


    

    public void score() {
        fill(225);
        textAlign(400, 0);
        textSize(50);
        text(score, 600, 50);
    }

    public void startmouse() {
        stage = 1;
    }

    public void endmouse() {
        restart();
    }

    public void startscreen() {
        background(75);
        yellowlines();
        fill(225);
        textAlign(CENTER, CENTER);
        textSize(50);
        text("Press to play", 600, 405);
        mousePressed();
    }

    public void restart() {
        stage = 1;
        cnt = 0;

    }

    int randomtextcounter = 0;
    int randomNumber2 = (int) (Math.random() * 3) + 1;

    public void Myrandoms() {
        randomtext = (int) (Math.random() * 5) + 1;
        randomNumber = (int) (Math.random() * 3) + 1;
        randomNumber2 = (int) (Math.random() * 3) + 1;
    }

    int randomtext = (int) (Math.random() * 5) + 1;

    public void Endscreen() {
        score();
        cnt = 0;
        yellowlines();
        fill(225);
        textAlign(CENTER, CENTER);
        textSize(50);
        if (randomtext == 1) {
            text("Press to play again", 600, 405);
        } else if (randomtext == 2) {
            text("Dang get better", 600, 405);
        } else if (randomtext == 3) {
            text("Well... there is always next time", 600, 405);
        } else if (randomtext == 4) {
            text("Just close the game at this point", 600, 405);
        } else if (randomtext == 5) {
            text("Practice makes perfect", 600, 405);
        }
    }

    public void mousePressed() {
        if (stage == 0) {
            if (mousePressed) {
                startmouse();
            }
        } else if (stage == 2) {
            if (mousePressed) {
                endmouse();
                stage = 1;
            }
        } else if (stage == 3) {
            stage = 1;
        }
    }

    boolean Collisions = false;

    public boolean Collisions() {
        if (randomNumber == 1) {
            if ((587 + teleport > 0 && 587 + teleport < 400) && (540 == cnt)) {
                Myrandoms();
                return true;
            }
            if (0 <= 625 + teleport && 400 >= 550 + teleport && cnt >= 550 && -100 + cnt <= 700) {
                Myrandoms();
                return true;
            }
        }
        if (randomNumber == 2) {
            if ((587 + teleport >= 410 && 587 + teleport <= 800) && (540 == cnt)) {
                Myrandoms();
                return true;
            }
            if (410 <= 625 + teleport && 800 >= 550 + teleport && cnt >= 550 && -100 + cnt <= 700) {
                Myrandoms();
                return true;
            }
        }
        if (randomNumber == 3) {
            if ((587 + teleport >= 810 && 587 + teleport <= 1200) && (540 == cnt)) {
                Myrandoms();
                return true;
            }
            if (810 <= 625 + teleport && 1200 >= 550 + teleport && cnt >= 550 && -100 + cnt <= 700) {
                Myrandoms();
                return true;
            }
        }

        return false;
    }

    public boolean Collisions2() {
        if (randomNumber2 == 1) {
            if ((587 + teleport > 0 && 587 + teleport < 400) && (540 == cnt)) {
                Myrandoms();
                return true;
            }
            if (0 <= 625 + teleport && 400 >= 550 + teleport && cnt >= 550 && -100 + cnt <= 700) {
                Myrandoms();
                return true;
            }
        }
        if (randomNumber2 == 2) {
            if ((587 + teleport >= 410 && 587 + teleport <= 800) && (540 == cnt)) {
                Myrandoms();
                return true;
            }
            if (410 <= 625 + teleport && 800 >= 550 + teleport && cnt >= 550 && -100 + cnt <= 700) {
                Myrandoms();
                return true;
            }
        }
        if (randomNumber2 == 3) {
            if ((587 + teleport >= 810 && 587 + teleport <= 1200) && (540 == cnt)) {
                Myrandoms();
                return true;
            }
            if (810 <= 625 + teleport && 1200 >= 550 + teleport && cnt >= 550 && -100 + cnt <= 700) {
                Myrandoms();
                return true;
            }
        }

        return false;
    }

    public void speed() {
        if (score >= 0 && score <= 10) {
        } else if (score > 10 && score <= 20) {
            cnt += 2;
        } else if (score > 20 && score <= 30) {
            cnt += 4;
        } else if (score > 30 && score <= 40) {
            cnt += 6;
        } else if (score > 40 && score <= 50) {
            cnt += 8;
        } else if (score > 50 && score <= 60) {
            cnt += 10;
        } else if (score > 60 && score <= 70) {
            textAlign(CENTER, CENTER);
            textSize(50);
            text("Take a break.... but be prepared", 600, 405);
        } else if (score > 70 && score <= 80) {
            cnt += 12;
        } else if (score > 80 && score <= 90) {
            cnt += 14;
        } else if (score > 90 && score <= 100) {
            cnt += 18;
        }
    }

    int carup = 0;

    public void car() {
        noStroke();
        fill(0, 0, 225);
        rect(550 + teleport, 550 + carup, 75, 150);
        triangle(550 + teleport, 550 + carup, 625 + teleport, 550 + carup, 587 + teleport, 540 + carup);
        fill(0);
        circle(540 + teleport, 585 + carup, 40);
        circle(540 + teleport, 665 + carup, 40);
        circle(630 + teleport, 585 + carup, 40);
        circle(630 + teleport, 665 + carup, 40);
        fill(120);
        rect(570 + teleport, 700 + carup, 10, 10);
        rect(590 + teleport, 700 + carup, 10, 10);

    }

    // #region Fence
    int cnt = 0;
    int randomNumber = (int) (Math.random() * 3) + 1;

    public void fence1() {
        noStroke();
        if (cnt >= 910) {
            cnt = 0;
            Myrandoms();
            score ++;
        }
        if (randomNumber == 1) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(0, -100 + cnt, 400, 100);
                cnt += 8;
                fill(75);
                rect(0, -200 + cnt, 400, 100);
            }
        } else if (randomNumber == 2) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(410, -100 + cnt, 390, 100);
                cnt += 8;
                fill(75);
                rect(410, -200 + cnt, 390, 100);
            }
        } else if (randomNumber == 3) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(810, -100 + cnt, 400, 100);
                cnt += 8;
                fill(75);
                rect(810, -200 + cnt, 400, 100);
            }

        }
    }

    public void fence2() {
        noStroke();
        if (cnt >= 910) {
            cnt = 0;
            Myrandoms();
            score++;
        }
        if (randomNumber2 == 1) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(0, -100 + cnt, 400, 100);
                fill(75);
                rect(0, -200 + cnt, 400, 100);
            }
        } else if (randomNumber2 == 2) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(410, -100 + cnt, 390, 100);
                fill(75);
                rect(410, -200 + cnt, 390, 100);
            }
        } else if (randomNumber2 == 3) {
            if (cnt < 910) {
                fill(150, 75, 0);
                rect(810, -100 + cnt, 400, 100);
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
    int yellowspeed = 0;


    

    public void yellowlines() {
        if (count != 810) {
            noStroke();
            fill(225, 225, 0);
            rect(400, count + yellowspeed, 10, 20);
            rect(800, count + yellowspeed, 10, 20);
            count++;
            fill(75);
            rect(400, -20 + count + yellowspeed, 10, 20);
            rect(800, -20 + count + yellowspeed, 10, 20);
        } else if (count == 810) {
            count = 0;
        }
        if (count2 != 810) {
            fill(225, 225, 0);
            rect(400, count2 + yellowspeed, 10, 20);
            rect(800, count2 + yellowspeed, 10, 20);
            count2++;
            fill(75);
            rect(400, -20 + count2 + yellowspeed, 10, 20);
            rect(800, -20 + count2 + yellowspeed, 10, 20);
        } else if (count2 == 810) {
            count2 = 0;
        }
        if (count3 != 810) {
            fill(225, 225, 0);
            rect(400, count3 + yellowspeed, 10, 20);
            rect(800, count3 + yellowspeed, 10, 20);
            count3++;
            fill(75);
            rect(400, -20 + count3 + yellowspeed, 10, 20);
            rect(800, -20 + count3 + yellowspeed, 10, 20);
        } else if (count3 == 810) {
            count3 = 0;
        }
        if (count4 != 810) {
            fill(225, 225, 0);
            rect(400, count4 + yellowspeed, 10, 20);
            rect(800, count4 + yellowspeed, 10, 20);
            count4++;
            fill(75);
            rect(400, -20 + count4 + yellowspeed, 10, 20);
            rect(800, -20 + count4 + yellowspeed, 10, 20);
        } else if (count4 == 810) {
            count4 = 0;
        }
        if (count5 != 810) {
            fill(225, 225, 0);
            rect(400, count5 + yellowspeed, 10, 20);
            rect(800, count5 + yellowspeed, 10, 20);
            count5++;
            fill(75);
            rect(400, -20 + count5 + yellowspeed, 10, 20);
            rect(800, -20 + count5 + yellowspeed, 10, 20);
        } else if (count5 == 810) {
            count5 = 0;
        }
        if (c6 != 810) {
            fill(225, 225, 0);
            rect(400, c6 + yellowspeed, 10, 20);
            rect(800, c6 + yellowspeed, 10, 20);
            c6++;
            fill(75);
            rect(400, -20 + c6 + yellowspeed, 10, 20);
            rect(800, -20 + c6 + yellowspeed, 10, 20);
        } else if (c6 == 810) {
            c6 = 0;
        }
        if (c7 != 810) {
            fill(225, 225, 0);
            rect(400, c7 + yellowspeed, 10, 20);
            rect(800, c7 + yellowspeed, 10, 20);
            c7++;
            fill(75);
            rect(400, -20 + c7 + yellowspeed, 10, 20);
            rect(800, -20 + c7 + yellowspeed, 10, 20);
        } else if (c7 == 810) {
            c7 = 0;
        }
        if (c8 != 810) {
            fill(225, 225, 0);
            rect(400, c8 + yellowspeed, 10, 20);
            rect(800, c8 + yellowspeed, 10, 20);
            c8++;
            fill(75);
            rect(400, -20 + c8 + yellowspeed, 10, 20);
            rect(800, -20 + c8 + yellowspeed, 10, 20);
        } else if (c8 == 810) {
            c8 = 0;
        }
        if (c9 != 810) {
            fill(225, 225, 0);
            rect(400, c9 + yellowspeed, 10, 20);
            rect(800, c9 + yellowspeed, 10, 20);
            c9++;
            fill(75);
            rect(400, -20 + c9 + yellowspeed, 10, 20);
            rect(800, -20 + c9 + yellowspeed, 10, 20);
        } else if (c9 == 810) {
            c9 = 0;
        }
        if (c10 != 810) {
            fill(225, 225, 0);
            rect(400, c10 + yellowspeed, 10, 20);
            rect(800, c10 + yellowspeed, 10, 20);
            c10++;
            fill(75);
            rect(400, -20 + c10 + yellowspeed, 10, 20);
            rect(800, -20 + c10 + yellowspeed, 10, 20);
        } else if (c10 == 810) {
            c10 = 0;
        }
        if (c11 != 810) {
            fill(225, 225, 0);
            rect(400, c11 + yellowspeed, 10, 20);
            rect(800, c11 + yellowspeed, 10, 20);
            c11++;
            fill(75);
            rect(400, -20 + c11 + yellowspeed, 10, 20);
            rect(800, -20 + c11 + yellowspeed, 10, 20);
        } else if (c11 == 810) {
            c11 = 0;
        }
        if (c12 != 810) {
            fill(225, 225, 0);
            rect(400, c12 + yellowspeed, 10, 20);
            rect(800, c12 + yellowspeed, 10, 20);
            c12++;
            fill(75);
            rect(400, -20 + c12 + yellowspeed, 10, 20);
            rect(800, -20 + c12 + yellowspeed, 10, 20);
        } else if (c12 == 810) {
            c12 = 0;
        }
        if (c13 != 810) {
            fill(225, 225, 0);
            rect(400, c13 + yellowspeed, 10, 20);
            rect(800, c13 + yellowspeed, 10, 20);
            c13++;
            fill(75);
            rect(400, -20 + c13 + yellowspeed, 10, 20);
            rect(800, -20 + c13 + yellowspeed, 10, 20);
        } else if (c13 == 810) {
            c13 = 0;
        }
        if (c14 != 810) {
            fill(225, 225, 0);
            rect(400, c14 + yellowspeed, 10, 20);
            rect(800, c14 + yellowspeed, 10, 20);
            c14++;
            fill(75);
            rect(400, -20 + c14 + yellowspeed, 10, 20);
            rect(800, -20 + c14 + yellowspeed, 10, 20);
        } else if (c14 == 810) {
            c14 = 0;
        }
        if (c15 != 810) {
            fill(225, 225, 0);
            rect(400, c15 + yellowspeed, 10, 20);
            rect(800, c15 + yellowspeed, 10, 20);
            c15++;
            fill(75);
            rect(400, -20 + c15 + yellowspeed, 10, 20);
            rect(800, -20 + c15 + yellowspeed, 10, 20);
        } else if (c15 == 810) {
            c15 = 0;
        }
        if (c16 != 810) {
            fill(225, 225, 0);
            rect(400, c16 + yellowspeed, 10, 20);
            rect(800, c16 + yellowspeed, 10, 20);
            c16++;
            fill(75);
            rect(400, -20 + c16 + yellowspeed, 10, 20);
            rect(800, -20 + c16 + yellowspeed, 10, 20);
        } else if (c16 == 810) {
            c16 = 0;
        }
        if (c17 != 810) {
            fill(225, 225, 0);
            rect(400, c17 + yellowspeed, 10, 20);
            rect(800, c17 + yellowspeed, 10, 20);
            c17++;
            fill(75);
            rect(400, -20 + c17 + yellowspeed, 10, 20);
            rect(800, -20 + c17 + yellowspeed, 10, 20);
        } else if (c17 == 810) {
            c17 = 0;
        }
        if (c18 != 810) {
            fill(225, 225, 0);
            rect(400, c18 + yellowspeed, 10, 20);
            rect(800, c18 + yellowspeed, 10, 20);
            c18++;
            fill(75);
            rect(400, -20 + c18 + yellowspeed, 10, 20);
            rect(800, -20 + c18 + yellowspeed, 10, 20);
        } else if (c18 == 810) {
            c18 = 0;
        }
        if (c19 != 810) {
            fill(225, 225, 0);
            rect(400, c19 + yellowspeed, 10, 20);
            rect(800, c19 + yellowspeed, 10, 20);
            c19++;
            fill(75);
            rect(400, -20 + c19 + yellowspeed, 10, 20);
            rect(800, -20 + c19 + yellowspeed, 10, 20);
        } else if (c19 == 810) {
            c19 = 0;
        }
        if (c20 != 810) {
            fill(225, 225, 0);
            rect(400, c20 + yellowspeed, 10, 20);
            rect(800, c20 + yellowspeed, 10, 20);
            c20++;
            fill(75);
            rect(400, -20 + c20 + yellowspeed, 10, 20);
            rect(800, -20 + c20 + yellowspeed, 10, 20);
        } else if (c20 == 810) {
            c20 = 0;
        }
    }
    // #endregion

}
