package mastermind.views.console;

import mastermind.utils.WithConsoleModel;
import mastermind.models.Error;

class ErrorConsoleView extends WithConsoleModel  {

	private final Error error;

	ErrorConsoleView(Error error) {
		this.error = error;
	}
	
	void writeln() {
		this.console.writeln(error.getMessage());
	}	
}