package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import controller.Controller;

public class SwingView extends JFrame implements View {

	private static final long serialVersionUID = 1L;
	private JButton do1;
	private JButton re1;
	private JButton mi1;
	private JButton fa1;
	private JButton sol1;
	private JButton la1;
	private JButton si1;
	private JButton do2;
	private JButton re2;
	private JButton mi2;
	private JButton fa2;
	private JButton sol2;
	private JButton la2;
	private JButton si2;
	private JLabel imgLabel;
	private JPanel pane;
	private String path = "/images/default.jpg";

	public SwingView() {

		super("EL PIANITO DE FRAN");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(construirSur(), BorderLayout.CENTER);
		add(construirNorte(), BorderLayout.NORTH);
		iniciarTeclado();
	}

	public JPanel construirNorte() {
		JPanel pane = new JPanel();
		pane.setBackground(Color.BLACK);
		pane.setPreferredSize(new Dimension(800, 500));
		imgLabel = new JLabel(new ImageIcon(getClass().getResource(path)));
		pane.add(imgLabel);
		return pane;

	}

	public JPanel construirSur() {
		pane = new JPanel();
		pane.setBackground(new Color(0, 0, 0));

		do1 = new JButton("DO");
		re1 = new JButton("RE");
		mi1 = new JButton("MI");
		fa1 = new JButton("FA");
		sol1 = new JButton("SOL");
		la1 = new JButton("LA");
		si1 = new JButton("SI");
		do2 = new JButton("DO");
		re2 = new JButton("RE");
		mi2 = new JButton("MI");
		fa2 = new JButton("FA");
		sol2 = new JButton("SOL");
		la2 = new JButton("LA");
		si2 = new JButton("SI");

		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		pane.setLayout(new GridLayout(1, 14, 3, 3));
		pane.add(do1);
		pane.add(re1);
		pane.add(mi1);
		pane.add(fa1);
		pane.add(sol1);
		pane.add(la1);
		pane.add(si1);
		pane.add(do2);
		pane.add(re2);
		pane.add(mi2);
		pane.add(fa2);
		pane.add(sol2);
		pane.add(la2);
		pane.add(si2);
		return pane;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	@Override
	public void operationDo(Controller controller) {
		// TODO Auto-generated method stub

		do1.addActionListener((event) -> {
			controller.operationDo();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
		do2.addActionListener((event) -> {
			controller.operationDo();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
	}

	@Override
	public void operationRe(Controller controller) {
		// TODO Auto-generated method stub
		re1.addActionListener((event) -> {
			controller.operationRe();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
		re2.addActionListener((event) -> {
			controller.operationRe();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
	}

	@Override
	public void operationMi(Controller controller) {
		// TODO Auto-generated method stub
		mi1.addActionListener((event) -> {
			controller.operationMi();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
		mi2.addActionListener((event) -> {
			controller.operationMi();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
	}

	@Override
	public void operationFa(Controller controller) {
		// TODO Auto-generated method stub
		fa1.addActionListener((event) -> {
			controller.operationFa();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
		fa2.addActionListener((event) -> {
			controller.operationFa();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
	}

	@Override
	public void operationSol(Controller controller) {
		// TODO Auto-generated method stub
		sol1.addActionListener((event) -> {
			controller.operationSol();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
		sol2.addActionListener((event) -> {
			controller.operationSol();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
	}

	@Override
	public void operationLa(Controller controller) {
		// TODO Auto-generated method stub
		la1.addActionListener((event) -> {
			controller.operationLa();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
		la2.addActionListener((event) -> {
			controller.operationLa();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});
	}

	@Override
	public void operationSi(Controller controller) {
		// TODO Auto-generated method stub
		si1.addActionListener((event) -> {
			controller.operationSi();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));

		});
		si2.addActionListener((event) -> {
			controller.operationSi();
			imgLabel.setIcon(new ImageIcon(getClass().getResource(path)));
		});

	}

	public void iniciarTeclado() {

		InputMap imDo1 = do1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap am = do1.getActionMap();
		imDo1.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "clickMe");
		am.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});

		InputMap imDo2 = do2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amDo2 = do2.getActionMap();
		imDo2.put(KeyStroke.getKeyStroke(KeyEvent.VK_P, 0), "clickMe");
		amDo2.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 5263035788186056812L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});

		InputMap imRe1 = re1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amRe1 = re1.getActionMap();
		imRe1.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "clickMe");
		amRe1.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});

		InputMap imRe2 = re2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amRe2 = re2.getActionMap();
		imRe2.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, 0), "clickMe");
		amRe2.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imMi1 = mi1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amMi1 = mi1.getActionMap();
		imMi1.put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "clickMe");
		amMi1.put("clickMe", new AbstractAction() {
		
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imMi2 = mi2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amMi2 = mi2.getActionMap();
		imMi2.put(KeyStroke.getKeyStroke(KeyEvent.VK_G, 0), "clickMe");
		amMi2.put("clickMe", new AbstractAction() {
		
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});

		InputMap imFa1 = fa1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amFa1 = fa1.getActionMap();
		imFa1.put(KeyStroke.getKeyStroke(KeyEvent.VK_F, 0), "clickMe");
		amFa1.put("clickMe", new AbstractAction() {
		
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imFa2 = fa2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amFa2 = fa2.getActionMap();
		imFa2.put(KeyStroke.getKeyStroke(KeyEvent.VK_J, 0), "clickMe");
		amFa2.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});

		InputMap imSol1 = sol1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amSol1 = sol1.getActionMap();
		imSol1.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "clickMe");
		amSol1.put("clickMe", new AbstractAction() {
		
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imSol2 = sol2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amSol2 = sol2.getActionMap();
		imSol2.put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "clickMe");
		amSol2.put("clickMe", new AbstractAction() {
		
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});

		InputMap imLa1 = la1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amLa1 = la1.getActionMap();
		imLa1.put(KeyStroke.getKeyStroke(KeyEvent.VK_L, 0), "clickMe");
		amLa1.put("clickMe", new AbstractAction() {
		
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imLa2 = la2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amLa2 = la2.getActionMap();
		imLa2.put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "clickMe");
		amLa2.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imSi1 = si1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amSi1 = si1.getActionMap();
		imSi1.put(KeyStroke.getKeyStroke(KeyEvent.VK_I, 0), "clickMe");
		amSi1.put("clickMe", new AbstractAction() {
	
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
		InputMap imSi2 = si2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap amSi2 = si2.getActionMap();
		imSi2.put(KeyStroke.getKeyStroke(KeyEvent.VK_T, 0), "clickMe");
		amSi2.put("clickMe", new AbstractAction() {
		private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				btn.doClick();
			}
		});
	}

	@Override
	public void setPath(String path) {
		// TODO Auto-generated method stub
		this.path = path;

	}
}
