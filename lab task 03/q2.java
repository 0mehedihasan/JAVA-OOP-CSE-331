/*
2. Write an interface called Movaable, which contains 4 abstract methods moveUp(),
moveDown(), moveLeft() and moveRight(). This interface must be overridden by two classes
named MovaablePoint and MovaableCircle. Create necessary variables in the classes and
implement the methods.
*/

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x;
    int y;
    
    MovablePoint(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }
    
    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
    
}

class MovableCircle implements Movable {
    int r;
    int center;
    
    MovableCircle(int r, int center) 
    {
        this.r=r;
        this.center=center;
    }
    
}
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
