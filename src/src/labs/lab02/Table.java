package src.labs.lab02;

public class Table {
    private String material;
    private int length;
    private int width;
    private int height;
    private String color;

    // Конструктор без параметров
    public Table() {
    }

    // Конструктор со всеми параметрами
    public Table(String material, int length, int width, int height, String color) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "материал = " + material +
                ", длина = " + length +
                ", ширина = " + width +
                ", высота = " + height +
                ", цвет = " + color ;
    }
}
