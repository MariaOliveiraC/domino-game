package controle;

import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Som {
	
	public static boolean somAtivo = true;
	
	public static void somJogaPeca(){
		if (somAtivo){
			Random r = new Random();
			int random = r.nextInt(5);
			URL drop = Som.class.getResource("/sound/drop" + random + ".wav");	
	        Clip clip;
			try {
				clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(drop);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somPegaUma(){
		if (somAtivo){
			URL take = Som.class.getResource("/sound/take.wav");
	        Clip clip;
			try {
				clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(take);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somEmbaralha(){
		if (somAtivo){
			URL shake = Som.class.getResource("/sound/shake.wav");
			Clip clip;
			try {
		        clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(shake);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somClick(){
		if (somAtivo){
			URL click = Som.class.getResource("/sound/click.wav");
			Clip clip;
			try {
		        clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(click);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somPassouVez(){
		if (somAtivo){
			URL passouVez = Som.class.getResource("/sound/passouVez.wav");
			Clip clip;
			try {
		        clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(passouVez);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somVenceuPartida(){
		if (somAtivo){
			URL venceuPartida = Som.class.getResource("/sound/venceuPartida.wav");
			Clip clip;
			try {
		        clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(venceuPartida);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somPerdeuPartida(){
		if (somAtivo){
			URL perdeuPartida = Som.class.getResource("/sound/perdeuPartida.wav");
			Clip clip;
			try {
		        clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(perdeuPartida);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
	
	public static void somVenceuRodada(){
		if (somAtivo){
			URL venceuRodada = Som.class.getResource("/sound/venceuRodada.wav");
			Clip clip;
			try {
		        clip = AudioSystem.getClip();
		        AudioInputStream ais = AudioSystem.getAudioInputStream(venceuRodada);
		        clip.open(ais);
		        clip.loop(0); //roda o áudio só uma vez
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return;
		}
	}
}