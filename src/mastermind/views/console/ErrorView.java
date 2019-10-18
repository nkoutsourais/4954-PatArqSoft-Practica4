package mastermind.views.console;

import mastermind.utils.WithConsoleModel;
import mastermind.models.Error;

public class ErrorView extends WithConsoleModel  {

	private final Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	public void writeln() {
		this.console.writeln(error.getMessage());
	}	
}