class Apple {
    private String color;
    private String size;

    public Apple(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apple||" +
                "color='" + color + '\'' +
                ", size='" + size + '\''
                ;
    }
}
