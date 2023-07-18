package Inheritance.SingleLevelInheritance;

public class Science extends Faculty {
    private float bonus;

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Science{" +
                "name='" + name + '\'' +
                ", id=" + id + ", bonus=" + bonus +
                '}';
    }
}
