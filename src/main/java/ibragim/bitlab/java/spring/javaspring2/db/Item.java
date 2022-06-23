package ibragim.bitlab.java.spring.javaspring2.db;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Long id;
    private String name;
    private int amount;
    private double price;
}
