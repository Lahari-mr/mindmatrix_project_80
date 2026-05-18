package com.example.myapplication.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserViewModel(
    private val auth: FirebaseAuth = FirebaseAuth.getInstance(),
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
) : ViewModel() {

    private val _userData = MutableStateFlow<User?>(null)
    val userData: StateFlow<User?> = _userData

    init {
        fetchUserData()
    }

    private fun fetchUserData() {
        val uid = auth.currentUser?.uid ?: return
        try {
            firestore.collection("users").document(uid)
                .addSnapshotListener { snapshot, error ->
                    if (error != null) {
                        Log.e("UserViewModel", "Error fetching user data: ${error.message}")
                        return@addSnapshotListener
                    }
                    if (snapshot != null && snapshot.exists()) {
                        _userData.value = snapshot.toObject(User::class.java)
                    }
                }
        } catch (e: Exception) {
            Log.e("UserViewModel", "Failed to setup listener: ${e.message}")
        }
    }
}
