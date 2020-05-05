public class MovablePoint extends Point2D{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float x, float y){
        this.xSpeed = x;
        this.ySpeed = y;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()+",speed ="+"("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
//        super.setXY(super.getX()+xSpeed,super.getY()+ySpeed);
        return this;
    }
}
