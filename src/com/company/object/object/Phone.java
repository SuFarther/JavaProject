package com.company.object.object;


import java.util.Objects;

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
     * @param
     * @return
     */
//    @Override
//    public boolean equals(Object obj) {
//        /**
//         * instanceof前面的对象是否是后面一个类的实例
//         *
//         * a instanceof b
//         * 判断a对象是否是b这个类的实例,如果是 返回true 如果不是返回false
//         *
//         * 属于Phone类的对象
//         */
//        if(obj instanceof Phone){
//            Phone other = (Phone) obj;
//            if (this.getBrand() == other.getBrand() && this.getPrice() == other.getPrice()
//                    && this.getYear() == other.getYear()) {
//                return  true;
//            }
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;};
        if (o == null || getClass() != o.getClass()){ return false;};
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 && year == phone.year && brand.equals(phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
