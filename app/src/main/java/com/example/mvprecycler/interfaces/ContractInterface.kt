package com.example.mvprecycler.interfaces

interface ContractInterface {

    interface MainModel {
        fun getCountryNameByCapital(city:String, presenter: MainPresenter)

    }

    interface MainPresenter{
        fun networkCall(city: String)
        fun showCountry():String
        fun UIAutoUpdate()
    }

    interface MainView{
        fun updateViewData()
    }


}