package com.example.cookbook

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.cookbook.model.Recipe
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier){
    Surface(shape = RoundedCornerShape(8.dp), elevation = 10.dp, modifier = Modifier){
        val image = painterResource(id = recipe.imageResource)
        //layout to hold image and text for recipe
        Column(modifier = Modifier.fillMaxWidth().padding(14.dp)) {
            // image and text
            Image(painter = image, contentDescription = "A delecious cake", modifier = Modifier
                .fillMaxWidth()
                .height(144.dp),
                contentScale = ContentScale.Crop)
            Text(recipe.title, modifier = Modifier.padding(5.dp))
            //looping ingredients to show the list
            Text(text = "Ingredients... ",
            modifier = Modifier.padding(5.dp))
            for (ingredient in recipe.ingredients){
                Text(". $ingredient", modifier = Modifier.padding(5.dp))
            }
        }
    }
}


//Dummy preview
@Composable
@Preview
fun DefaultRecipeCard(){
    RecipeCard(defaultrecipes[0], modifier = Modifier.padding(16.dp))
}