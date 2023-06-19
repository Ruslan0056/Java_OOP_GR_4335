package LSP;

public class Square extends Rectangle {
    
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }

    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }

    @Override
    public int area() {
        return super.width * super.height;
    }

    

}