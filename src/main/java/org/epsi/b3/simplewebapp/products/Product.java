package org.epsi.b3.simplewebapp.products;

import java.util.Objects;
import java.util.zip.DataFormatException;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * An entity to model the view of a product.
 */
@Entity
@Table(name = "Product")
public class Product {

    private String code;
    private String name;
    private Float price;

    public Product() {

    }

    public Product(String code, String name, Float price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Id
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic(optional = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic(optional = false)
    public float getPrice() {
        return (price == null) ? 0 : price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void validate() throws DataFormatException {;

        // The product ID is the literal [a-zA-Z_0-9]
        // with at least one letter
        String regex = "\\w+";

        if (code == null || !code.matches(regex)) {
            throw new DataFormatException("Invalid product code : " + code);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 &&
                code.equals(product.code) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
