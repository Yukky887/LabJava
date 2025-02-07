package org.example;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "customer_id",nullable = false)
    private int c_id;
    @Column(name = "name",nullable = false)
    private String name;
    @OneToMany(mappedBy = "customer")
    public List<Customer_Product> customer_product;
    public Customer(){}
    public Customer(String name) {
        this.name = name;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.getName();
    }
}
