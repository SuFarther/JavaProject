package com.company.object.object;

import java.util.Date;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName phone
 * @company 公司
 * @Description Object类的equals
 * @createTime 2021年08月02日 20:59:59
 */
public class Phone {
    private String brand;
    private double price;
    private int year;

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    /**
     * 对equals进行重写
     * 子类对父类Object类不满意,方法进行重写
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Phone other = (Phone) obj;
        if (this.getBrand() == other.getBrand() && this.getPrice() == other.getPrice()
                && this.getYear() == other.getYear()) {
            return  true;
        }
        return false;
    }
}
