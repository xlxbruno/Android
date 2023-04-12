package com.example.cookbook

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.cookbook.model.Recipe
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecipeList(recipe:List<Recipe>){
   LazyColumn{
       items(recipe){item ->
       RecipeCard(recipe = item, modifier = Modifier.padding(12.dp))
   } }
}