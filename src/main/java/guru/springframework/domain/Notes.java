package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
public class Notes {

    @Id
    String id;

    String recipeNotes;
}
