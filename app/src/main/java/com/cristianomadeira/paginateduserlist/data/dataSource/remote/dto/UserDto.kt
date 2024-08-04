package com.cristianomadeira.paginateduserlist.data.dataSource.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val login: LoginDto,
    val name: UserNameDto,
    val email: String,
    val picture: UserPictureDto
)