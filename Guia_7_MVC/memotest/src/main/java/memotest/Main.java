package memotest;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;

import javax.swing.UIManager;

import memotest.controller.MemoController;
import memotest.vista.Ventana;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {

					Ventana frame = new Ventana();
					ActionListener al = new MemoController(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}