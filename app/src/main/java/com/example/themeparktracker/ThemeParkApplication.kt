package com.example.themeparktracker

import com.example.themeparktracker.data.themeParks
import com.example.themeparktracker.repositories.ThemeParkRepository

class ThemeParkApplication {
    val themeParkRepository : ThemeParkRepository by lazy {
        ThemeParkRepository(themeParks)
    }
}