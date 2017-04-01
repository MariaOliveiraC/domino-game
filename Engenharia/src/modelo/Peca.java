package modelo;

import java.awt.Cursor;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controle.RotatedIcon;

public class Peca {
	private int valor1;
	private int valor2;
	public ImageIcon imagem;
	public int largura = 40;
	public int altura = 85;
	public int posicaoX;
	public int posicaoY;
	public boolean virada;
	
	public int rotacao;
	
	public Peca(int valor1, int valor2, boolean virada){
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.virada = virada;
		imagem = new ImageIcon(".\\image\\peca\\peca" + valor1 + valor2 + ".png");
	}
	
	public void drawPeca(JPanel painel, int posicaoX, int posicaoY, int rotacao){
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		// rotacao
		// 0 = posicao original		-	 O
		//								 X
		//
		// 1 = 90� para a direita	-	 XO
		//
		// 2 = 180� para a direita	-	 X
		//								 O
		//
		// 3 = 270� para a direita	-	OX
		//
		
		JLabel l = new JLabel();
		l.setName("" + valor1 + valor2);
		if (this.virada){
			if (rotacao == 0){
				l.setIcon(imagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 1){
				RotatedIcon rimagem = new RotatedIcon(imagem, RotatedIcon.Rotate.DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			} else if (rotacao == 2){
				RotatedIcon rimagem = new RotatedIcon(imagem, RotatedIcon.Rotate.UPSIDE_DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 3){
				RotatedIcon rimagem = new RotatedIcon(imagem, RotatedIcon.Rotate.UP);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			}
		} else {
			ImageIcon desvirada = new ImageIcon(".\\image\\peca\\pecaOff.png");
			if (rotacao == 0){
				l.setIcon(desvirada);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 1){
				RotatedIcon rimagem = new RotatedIcon(desvirada, RotatedIcon.Rotate.DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			} else if (rotacao == 2){
				RotatedIcon rimagem = new RotatedIcon(desvirada, RotatedIcon.Rotate.UPSIDE_DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 3){
				RotatedIcon rimagem = new RotatedIcon(desvirada, RotatedIcon.Rotate.UP);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			}
		}
		
		this.rotacao = rotacao;
		
		l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		painel.add(l);
	}
	
	public void drawPecaScaled(JPanel painel, int posicaoX, int posicaoY, int rotacao){
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		// rotacao
		// 0 = posicao original		-	 O
		//								 X
		//
		// 1 = 90� para a direita	-	 XO
		//
		// 2 = 180� para a direita	-	 X
		//								 O
		//
		// 3 = 270� para a direita	-	OX
		//
		
		Image img = imagem.getImage();
		Image scaledImg = img.getScaledInstance(largura/2 + (largura/2)/2, altura/2 + (altura/2)/2,  java.awt.Image.SCALE_SMOOTH);
		imagem = new ImageIcon(scaledImg);
		
		JLabel l = new JLabel();
		l.setName("" + valor1 + valor2);
		if (this.virada){
			if (rotacao == 0){
				l.setIcon(imagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 1){
				RotatedIcon rimagem = new RotatedIcon(imagem, RotatedIcon.Rotate.DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			} else if (rotacao == 2){
				RotatedIcon rimagem = new RotatedIcon(imagem, RotatedIcon.Rotate.UPSIDE_DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 3){
				RotatedIcon rimagem = new RotatedIcon(imagem, RotatedIcon.Rotate.UP);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			}
		} else {
			ImageIcon desvirada = new ImageIcon(".\\image\\peca\\pecaOff.png");
			if (rotacao == 0){
				l.setIcon(desvirada);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 1){
				RotatedIcon rimagem = new RotatedIcon(desvirada, RotatedIcon.Rotate.DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			} else if (rotacao == 2){
				RotatedIcon rimagem = new RotatedIcon(desvirada, RotatedIcon.Rotate.UPSIDE_DOWN);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.largura, this.altura);
			} else if (rotacao == 3){
				RotatedIcon rimagem = new RotatedIcon(desvirada, RotatedIcon.Rotate.UP);
				l.setIcon(rimagem);
				l.setBounds(this.posicaoX, this.posicaoY, this.altura, this.largura);
			}
		}
		
		this.rotacao = rotacao;
		
		l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		painel.add(l);
	}
	
	/**
	 * calcularPosicaoPeca() eh o metodo reponsavel pelos c�lculos que desenhar�o a pe�a
	 * no painel em determinada posicao X e Y.
	 * Dire��o 0 = baixo.. dire��o 1 = esquerda. Dire��o 2 = Cima.. dire��o 3 = direita.
	 * ser� visto a dire��o que a pe�a ser� desenhada, e se cabe no painel
	 * @return [X,Y]
	 */
	
	public void calcularPosicaoPeca(JPanel painel, Peca ext1, Peca ext2, Peca first, int direcao, int rotacao){
		int[] posicoes;
		
		// extremidade � esquerda
		if (direcao == 1){
			if ((ext1.posicaoX - 60) < 0){ //era - 80
				posicoes = new int[]{ext1.posicaoX, ext1.posicaoY + 22}; //era + 37
				if (rotacao == 0){
					if (ext1.rotacao == 1 || ext1.rotacao == 3){
						drawPecaScaled(painel, posicoes[0] - 22, posicoes[1], 3); //era posicoes[0] - 37
						return;
					} else {
						drawPecaScaled(painel, posicoes[0], posicoes[1] + 60, 3); //era posicoes[1] + 80
						return;
					}
				} else {
					if (ext1.rotacao == 1 || ext1.rotacao == 3){
						drawPecaScaled(painel, posicoes[0], posicoes[1], rotacao-1);
						return;
					} else {
						drawPecaScaled(painel, posicoes[0], posicoes[1] + 38, rotacao-1); //era posicoes[1] + 43
						return;
					}
				}
			} else {
				if (ext1.equals(first)){
					posicoes = new int[]{ext1.posicaoX - 60, ext1.posicaoY + 20}; //era - 80
					drawPecaScaled(painel, posicoes[0], posicoes[1], rotacao);
					return;
				} else {
					posicoes = new int[]{ext1.posicaoX - 60, ext1.posicaoY}; //era - 80
					drawPecaScaled(painel, posicoes[0], posicoes[1], rotacao);
					return;
				}
			}
			
		// extremidade � direita
		} else if (direcao == 3){
			if (ext2.equals(first)){
				posicoes = new int[]{ext2.posicaoX + 27, ext2.posicaoY + 20}; //era + 37, y n�o tinha soma nem subtra��o
				drawPecaScaled(painel, posicoes[0], posicoes[1], rotacao);
				return;
			} else {
				if ((ext2.posicaoX + 90) > painel.getWidth()){ //era + 160
					posicoes = new int[]{ext2.posicaoX, ext2.posicaoY - 38}; //era - 37
					if (rotacao == 0){
						if (ext2.rotacao == 1 || ext2.rotacao == 3){
							drawPecaScaled(painel, posicoes[0] + 31, posicoes[1], 3); //era posicoes[0] + 43
							return;
						} else {
							drawPecaScaled(painel, posicoes[0], posicoes[1] - 22, 3); //era posicoes[1] - 43
							return;
						}
					} else {
						if (ext2.rotacao == 1 || ext2.rotacao == 3){
							drawPecaScaled(painel, posicoes[0] + 31, posicoes[1] - 27, rotacao-1); //era posicoes[0] + 43, posicoes[1] - 43
							return;
						} else {
							drawPecaScaled(painel, posicoes[0], posicoes[1] - 22, rotacao-1); //era posicoes[1] - 43
							return;
						}
					}
				} else {
					posicoes = new int[]{ext2.posicaoX + 60, ext2.posicaoY}; //era + 80
					drawPecaScaled(painel, posicoes[0], posicoes[1], rotacao);
					return;
				}
			}
		}
	}

	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
}
