package controller;

import model.Model;
import view.SwingView;
import view.View;

public class MainController implements Controller{
	private View view;
	private Model model;
	public MainController(SwingView view,Model model) {
	    this.model=model;
		this.view=view;
		this.view.operationDo(this);
		this.view.operationRe(this);
		this.view.operationMi(this);
		this.view.operationFa(this);
		this.view.operationSol(this);
		this.view.operationLa(this);
		this.view.operationSi(this);
		
	}
	@Override
	public void openView() {
		// TODO Auto-generated method stub
		view.start();
	}
	
	@Override
	public void operationDo() {
		// TODO Auto-generated method stub
		model.playDo();
		view.setPath(model.getpathDo());
		
	}
	@Override
	public void operationRe() {
		// TODO Auto-generated method stub
		model.playRe();
		view.setPath(model.getpathRe());
	}
	@Override
	public void operationMi() {
		// TODO Auto-generated method stub
		model.playMi();
		view.setPath(model.getpathMi());
	}
	@Override
	public void operationFa() {
		// TODO Auto-generated method stub
		model.playFa();
		view.setPath(model.getpathFa());
	}
	@Override
	public void operationSol() {
		// TODO Auto-generated method stub
		model.playSol();
		view.setPath(model.getpathSol());
	}
	@Override
	public void operationLa() {
		// TODO Auto-generated method stub
		model.playLa();
		view.setPath(model.getpathLa());
	}
	@Override
	public void operationSi() {
		// TODO Auto-generated method stub
		model.playSi();
		view.setPath(model.getpathSi());
	}

}
