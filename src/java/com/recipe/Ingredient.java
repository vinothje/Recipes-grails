package src.java.com.recipe;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Graeme Rocher
 * @since 20-Feb-2006
 */
public class Ingredient {
    private Long id;
    private String name;
    private Integer quantity;
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
    	return this.name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public Integer getQuantity() {
    	return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
    	this.quantity = quantity;
    }
    
    
    public Recipe getRecipe() {
    	return this.recipe;
    }
    
    public void setRecipe(Recipe recipe) {
    	this.recipe = recipe;
    }
}

    