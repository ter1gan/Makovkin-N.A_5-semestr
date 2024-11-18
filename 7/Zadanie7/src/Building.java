public class Building {
    public String type; // Теперь публичное поле
    public int floors;  // Теперь публичное поле
    public double area; // Теперь публичное поле
    public String color;

    // Конструктор принимает объект Builder
    public Building(Builder builder) {
        this.type = builder.type;
        this.floors = builder.floors;
        this.area = builder.area;
        this.color = builder.color;
    }

    
    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                ", floors=" + floors +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}

