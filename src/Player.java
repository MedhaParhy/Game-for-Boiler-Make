import java.awt.Color;


public class Player {

    //attributes
    Color color;
    String name;
    double money; //each player starts out with $20,000 and cannot have less than 0 dollars
    int hearts; //each player starts out with 5 hearts and cannot have less than 0 hearts
    int position; //each player needs to have a position between 1-20 (hash-map values)

    //constructor
    public Player(Color color, String name) {
        this.color = color;
        this.name = name;
        this.money = 20000;
        this.hearts = 5;
        this.position = 0;
    }

    //getters, setters, increasing and decreasing methods
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money < 0) {
            this.money = 0;
        } else {
            this.money = money;
        }
    }

    public void increaseMoney(double m) {
        this.money+= m;
    }

    public void decreaseMoney(double m) {
        if (this.money - m < 0) {
            this.money = 0;
        } else {
            this.money-= m;
        }
    }

    public int getHearts() {
        return hearts;
    }

    public void setHearts(int hearts) {
        if (hearts < 0) {
            this.hearts = 0;
        } else {
            this.hearts = hearts;
        }
    }

    public void increaseHearts(int h) {
        this.hearts += h;
    }

    public void decreaseHearts(int h) {
        if (this.hearts - h < 0) {
            this.hearts = 0;
        } else {
            this.hearts -= h;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void increasePosition(int i) {
        this.position += i;
    }

    public void decreasePosition(int i) {
        if (this.position - i < 1) {
            this.position = 1;
        } else {
            this.position -= i;
        }
    }
}
