package com.example.contacts.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {
    // ViewModel 내부 함수에서만 값을 수정할 수 있도록 private State 정의
    private val _keywordState = MutableStateFlow("")
    // 외부에서는 state를 읽어갈 수만 있도록 StateFlow로 변수 선언
    val keywordState: StateFlow<String> = _keywordState

    fun updateKeyword(value:String){
        _keywordState.value = value
    }
}