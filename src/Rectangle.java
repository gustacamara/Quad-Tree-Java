public class Rectangle {
    private int positionX;
    private int positionY;
    private int width;
    private int height;

    public Rectangle(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    public boolean contains (Point point) {

        // x,y point is the middle of the rectangle
        // its calc equals cartesian plane
        if(!(point.getPositionX() >= positionX - width)){
            return false;
        }
        if(!(point.getPositionX() <= positionX + width)) {
            return false;
        }
        if(!(point.getPositionY() >= positionY + height)) {
            return false;
        }
        if(!(point.getPositionY() <= positionY - height)) {
            return false;
        }

        return true;
    }

    public void drawRectangle() {
        /*todo draw rectangle:
        *  - xChart -> generate images!
        **/
    }


    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
