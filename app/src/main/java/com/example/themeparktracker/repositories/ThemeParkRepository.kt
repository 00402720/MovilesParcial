package com.example.themeparktracker.repositories

import com.example.themeparktracker.data.ThemeParkModel

//Repository for the Theme Park data
class ThemeParkRepository(private val themeParks : MutableList<ThemeParkModel>){
    fun getThemeParks() = themeParks
    fun addThemeParks(themePark : ThemeParkModel) = themeParks.add(themePark)
}