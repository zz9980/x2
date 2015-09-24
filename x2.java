//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "Teng Lin";
String title=  " Chasing Dog ";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX=200, dogY=450, heroX=250, heroY=250;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 600,600);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  1;
  dy=  .5;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  background(104,186,240);
  fill (0,240,0);
  stroke(0,240,0);
  rect(0,300,600,300);
  
  stroke(162,167,165);
  fill(162,167,165);
  rect(350,150, 200,150);    
  triangle(320,150, 580,150, 450,80); //roof
  rect(370,90,30,50);
  fill(255);
  stroke(255);
  ellipse(360,70, 50,30);
  ellipse(340,50, 60,35);
 
 //window
 fill(255);
 stroke(0);
 rect(450,150, 60,60);
 stroke(0);
 line(480,150, 480,210);
 line(450,180, 510,180);
 
 //door
 fill(188, 110, 82);
 stroke(188, 110, 82);
 rect(380,220, 50,80);
 fill(255,255,0);
 stroke(255,255,0);
 ellipse(390,260, 15,15);
 
 //tree
 fill(188, 110, 82);
 stroke(188,110,82);
 rect( 150, horizon, 50, 150);  
 stroke(50,247,127);
 fill(50,247,127);
 ellipse( 175,150, 160,160);

  fill(0);
  text( "scene", 100, 50 );
}

void messages() {
  fill(0);
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}


//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  fill(56,182,242);
  stroke(255);
  rect(heroX,heroY, 30,30);                     //head
  rect(heroX-9,heroY+30, 50,65);                //body
  rect(heroX-9, heroY+95, 15,40);               //Left leg
  rect(heroX+26, heroY+95, 15,40);              //Right leg
  rect(heroX-19,heroY+30, 10,40);               //Left arm
  rect(heroX+41,heroY+30, 10,40);               //Right arm
  fill(0);
  ellipse( heroX+10, heroY+10, 5,5);            //Left eye
  ellipse( heroX+25, heroY+10, 5,5);            //Right eye
  stroke(0);
  line(heroX+10,heroY+20, heroX+20, heroY+20);  //mouth
  
  heroX= heroX + .5*dx;
  heroY= heroY + .5*dy; 
 
}
void dog() {
  //dogX=  dogX + (dogX-x)/30;
  //dogY=  dogY + (dogY-x)/40;
  rect(dogX,dogY, 50,50);
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!!!", 150, 150 );
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   
