package src.java.com.recipe;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Graeme Rocher
 * @since 20-Feb-2006
 */

public class Recipe {
    private Long id;
    private String title;
    private String description;
    private Date date;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}