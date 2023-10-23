package seminar6;

//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, котороя является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачева
//Можно записать в текстовом виде, не обязательно реализовывать в Java.


import java.util.Objects;

public class Cat {
    private int age;
    private String color;
    private String sex;

    public Cat() {

    }

    public Cat(int age, String color, String sex) {
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat " + "age - " + age + ", sex - " + sex + ", color - " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(color, cat.color) && Objects.equals(sex, cat.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, sex);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        } else if (this == obj) {
//            return true;
//        } else if (obj instanceof Cat) {
//            Cat cat = (Cat) obj;
//            if (cat.getAge() != this.age && !cat.getColor().equals(this.color) && !cat.getSex().equals(this.sex)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, color);
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
