package br.com.matheus.pooencapsulamentokotlin

class Book (

    private var _title: String,
    private var _author: String,
    private var _pages: Int,
    private var _yearPub: Int,
    private var _editor: String,
    private var _location: String

){
    var title: String
        get() = _title
        set(valor){
            _title = valor
        }
    var author: String
        get() = _author
        set(valor){
            _author = valor
        }
    var pages: Int
        get() = _pages
        set(valor){
            _pages = valor
        }
    var yearPub: Int
        get() = _yearPub
        set(valor){
            _yearPub = valor
        }
    var editor: String
        get() = _editor
        set(valor){
            _editor = valor
        }

    var location: String
        get() = _location
        set(valor){
            _location = valor
        }
}
