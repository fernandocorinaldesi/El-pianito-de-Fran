package view;

import controller.Controller;

public interface View {
	public void start();
	
	public void operationDo(Controller controller);
	public void operationRe(Controller controller);
	public void operationMi(Controller controller);
	public void operationFa(Controller controller);
	public void operationSol(Controller controller);
	public void operationLa(Controller controller);
	public void operationSi(Controller controller);
	public void setPath(String path);

}
