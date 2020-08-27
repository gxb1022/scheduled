package com.example.scheduled;

public class Dog {

    private String name;
    private String color;
    private String sex;

    public Dog(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.color = builder.color;

    }

    public static class Builder {
        private String name;
        private String color;
        private String sex;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }
}
