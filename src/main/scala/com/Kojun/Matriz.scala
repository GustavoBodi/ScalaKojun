package com.Kojun

type Linha[Valor] = Array[Valor]
type Matriz[Valor] = Array[Linha[Valor]]
type Tabuleiro = Matriz[Int]
type Posicao = (Int, Int)

def obterValor(tabuleiro: Tabuleiro, posicao: Posicao) = {
  tabuleiro.lift(posicao._1).flatMap(_.lift(posicao._2)).getOrElse(0)
}

def mostrarMatriz(tabuleiro: Tabuleiro) = {
  tabuleiro.foreach(x => println(x.mkString(",")));
}
