/*
1. Suppose, there is an interface Movable which contains four functions MoveUp(),
MoveDown(), MoveLeft(), MoveRight(). Two classes named MovablePoint and
MovableCircle must inherit the interface. MovablePoint class have 4 variables
(x,y,x_speed,y_speed) and one parameterized constructor, one display_info()
function. MovableCircle class have radius variable, one parameterized constructor
and one display_info() function. You must remember that, a moving circle must
have moving points. Complete the above scenario.
*/
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
     int x, y, xSpeed, ySpeed;

     MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public void displayInfo() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class MovableCircle implements Movable {
    int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public void displayInfo() {
        System.out.println("Circle: Center at (" + center.x + ", " + center.y + "), Radius: " + radius);
    }
}


class HelloWorld {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 1, 1);
        MovableCircle circle = new MovableCircle(3, 4, 1, 1, 5);

        point.displayInfo();
        circle.displayInfo();

        point.moveRight();
        circle.moveLeft();

        point.displayInfo();
        circle.displayInfo();
    }
}
