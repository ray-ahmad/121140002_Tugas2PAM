package com.example.tugas1pam.ui.skills

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SkillsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is skills Fragment"
    }
    val text: LiveData<String> = _text
}