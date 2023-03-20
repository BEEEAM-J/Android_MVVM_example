package com.example.androidmvvmexample.repository

import com.example.androidmvvmexample.model.Data

class DataSourceImp() : DataSource {

    override val data: Data
        get() = Data()

    override fun login(usrId: String?, usrPasswd: String?): String {
        return data.login(usrId, usrPasswd)
    }
}