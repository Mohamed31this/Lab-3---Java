package Exercise8;

public class Wall {

    private double width ;
    private double height;

    public Wall(){

    }

    public Wall(double width,double height){
        if  (width < 0 ){
            this.width = 0;
        } else if (width >= 0) {
            this.width = width;

        }

        if (height < 0){
            this.height = 0;
        } else if (height >= 0) {
            this.height =height;
        }

    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double value){
        if (value < 0){
            this.width =0;
        } else if (value >= 0) {
            this.width = value;

        }
    }

    public void setHeight(double value){
        if (value < 0){
            this.height =0;
        } else if (value >= 0) {
            this.height = value;

        }
    }

    public double getArea(){
        return this.width * this.height;
    }

    public static void main(){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}


