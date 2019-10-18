package mastermind.views.console;

import mastermind.models.Color;
import mastermind.utils.WithConsoleModel;

public class ColorView extends WithConsoleModel {

	private final Color color;

	public ColorView(Color color) {
		this.color = color;
	}
	
	public void write() {
		this.console.write(this.color.getInitial());
	}
}