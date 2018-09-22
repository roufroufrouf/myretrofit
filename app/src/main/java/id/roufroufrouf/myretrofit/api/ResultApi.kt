package id.roufroufrouf.myretrofit.api

import id.roufroufrouf.myretrofit.model.Tenant

data class ResultApi(var status: String, var code: Int, var data: Data) {
    data class Data(var tenant: Tenant)
}