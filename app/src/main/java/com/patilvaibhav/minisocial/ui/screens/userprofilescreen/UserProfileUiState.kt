package com.patilvaibhav.minisocial.ui.screens.userprofilescreen

import com.patilvaibhav.minisocial.network.User

sealed interface UserProfileUiState {
    data class Success(val user: User) : UserProfileUiState

    object Error : UserProfileUiState

    object Loading : UserProfileUiState
}
