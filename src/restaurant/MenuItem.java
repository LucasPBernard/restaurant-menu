package restaurant;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;


    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = category;
        this.isNew = isNew;
    }


    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }


    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }


    public Double getPrice() { return this.price; }

    public void setPrice(Double price) { this.price = price; }


    public String getCategory() { return this.category; }

    public void setCategory(String category) { this.category = category; }


    public Boolean isNew() { return this.isNew; }

    public void setIsNew(Boolean isNew) { this.isNew = isNew; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(price, menuItem.price) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, category);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}