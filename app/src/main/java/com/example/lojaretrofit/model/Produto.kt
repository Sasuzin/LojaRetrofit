package com.example.lojaretrofit.model

data class Produto(
    var precProduto:Float,
    var ativoProduto:Boolean,
    var qntMinEstoque:Int,
    var nomeProduto:String,
    var idProduto:Int,
    var idCategoria:Int,
    var descProduto:String,
    var descontoPromocao:Double,
)
