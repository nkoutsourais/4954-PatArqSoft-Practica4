package mastermind.views.console;

import mastermind.models.Color;
import mastermind.utils.WithConsoleModel;

class ColorConsoleView extends WithConsoleModel {

	private final Color color;

	ColorConsoleView(Color color) {
		this.color = color;
	}
	
	void write() {
		this.console.write(this.color.getInitial());
	}
}