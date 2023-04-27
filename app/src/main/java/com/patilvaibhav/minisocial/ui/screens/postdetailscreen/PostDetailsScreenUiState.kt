package com.patilvaibhav.minisocial.ui.screens.postdetailscreen


import com.patilvaibhav.minisocial.network.Post

sealed interface PostDetailsScreenUiState {
    data class Success(val post: Post): PostDetailsScreenUiState
    object Loading: PostDetailsScreenUiState
    object Error: PostDetailsScreenUiState
}
