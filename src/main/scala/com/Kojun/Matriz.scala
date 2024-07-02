package com.Kojun

type Linha[Valor] = Array[Valor]
type Matriz[Valor] = Array[Linha[Valor]]
type Tabuleiro = Matriz[Int]
type Posicao = (Int, Int)

def obterValor(tabuleiro: Tabuleiro, posicao: Posicao) = {
  tabuleiro(posicao._1)(posicao._2)
}

def mostrarMatriz(tabuleiro: Tabuleiro) = {
  tabuleiro.foreach(x => println(x.mkString(",")));
}
