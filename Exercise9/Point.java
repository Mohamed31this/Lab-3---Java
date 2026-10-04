package Exercise9;

public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x , int y){
        this.x = x ;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y-this.y),2));
    }

    public double distance(int x,int y){
        Point p1 = new Point(x,y);
        return distance(p1);

    }
}
