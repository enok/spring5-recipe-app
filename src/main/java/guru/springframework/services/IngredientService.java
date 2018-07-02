package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by enok on 02/07/2018
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
