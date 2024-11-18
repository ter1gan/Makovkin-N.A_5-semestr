public class Builder {
    public String type; // Теперь публичное поле
    public int floors;  // Теперь публичное поле
    public double area; // Теперь публичное поле
    public String color;

    public Builder(String type) {
        this.type = type; // Тип здания обязательно указывается
    }

    public Builder setFloors(int floors) {
        this.floors = floors;
        return this; // Возвращаем текущий объект Builder для цепочки вызовов
    }

    public Builder setArea(double area) {
        this.area = area;
        return this; // Возвращаем текущий объект Builder для цепочки вызовов
    }

    public Builder setColor(String color) {
        this.color = color;
        return this; // Возвращаем текущий объект Builder для цепочки вызовов
    }

    // Метод для создания экземпляра Building
    public Building build() {
        return new Building(this);
    }


}


