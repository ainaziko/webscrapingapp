package sample;

import java.util.Objects;

public class Pokemon {
    private int id;
    private String name;
    private String total;
    private String hp;
    private String attack;
    private String defence;
    private String spAtk;
    private String spDef;
    private String speed;
    private String type;

    public Pokemon(int id, String name, String total, String hp, String attack, String defence, String spAtk, String spDef, String speed, String type) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(String spAtk) {
        this.spAtk = spAtk;
    }

    public String getSpDef() {
        return spDef;
    }

    public void setSpDef(String spDef) {
        this.spDef = spDef;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id == pokemon.id && Objects.equals(name, pokemon.name) && Objects.equals(total, pokemon.total) && Objects.equals(hp, pokemon.hp) && Objects.equals(attack, pokemon.attack) && Objects.equals(defence, pokemon.defence) && Objects.equals(spAtk, pokemon.spAtk) && Objects.equals(spDef, pokemon.spDef) && Objects.equals(speed, pokemon.speed) && Objects.equals(type, pokemon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, total, hp, attack, defence, spAtk, spDef, speed, type);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total='" + total + '\'' +
                ", hp='" + hp + '\'' +
                ", attack='" + attack + '\'' +
                ", defence='" + defence + '\'' +
                ", spAtk='" + spAtk + '\'' +
                ", spDef='" + spDef + '\'' +
                ", speed='" + speed + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
