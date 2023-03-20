package com.example.androidmvvmexample.repository

class MainRepository(
    private val dataSource: DataSource
) {
    fun loadResult(usrName: String?, usrPasswd: String?): String {
        return dataSource.login(usrName, usrPasswd)
    }
}