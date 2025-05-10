public class QuadTree {
    private Rectangle area;
    private int capacity;
    private QuadTree northwest;
    private QuadTree northeast;
    private QuadTree southwest;
    private QuadTree southeast;
    private boolean divided;

    public QuadTree(Rectangle area, int capacity) {
        this.area = area;
        this.capacity = capacity;
        this.northeast = null;
        this.northwest = null;
        this.southeast = null;
        this.southwest = null;
        divided = false;
    }

    public void subDivide() {
        int x = area.getPositionX();
        int y = area.getPositionY();
        int w = area.getWidth();
        int h = area.getHeight();

        int newHeight = h/2;
        int newWith = w/2;

        Rectangle ne = new Rectangle(x+w/2, y+h/2, newWith, newHeight);
        northeast = new QuadTree(ne, capacity);

        Rectangle nw = new Rectangle( x-w/2, y-h/2, newWith, newHeight);
        northwest = new QuadTree(nw, capacity);

        Rectangle se = new Rectangle(x+w/2, y-h/2, newWith, newHeight);
        southeast = new QuadTree(se, capacity);

        Rectangle sw = new Rectangle(x+w/2, y+h/2, newWith, newHeight);
        southwest = new QuadTree(sw, capacity);

        divided = true;
    }


}