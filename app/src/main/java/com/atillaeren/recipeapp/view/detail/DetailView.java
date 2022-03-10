package com.atillaeren.recipeapp.view.detail;

import com.atillaeren.recipeapp.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}