package mastermind.views.console;

import java.util.ArrayList;
import java.util.List;
import mastermind.models.*;
import mastermind.models.Error;
import mastermind.utils.WithConsoleModel;
import mastermind.views.Message;

class ProposedCombinationConsoleView extends WithConsoleModel {

	void write(ProposedCombination proposedCombination) {
		for (Color color : proposedCombination.getColors()) {
			new ColorConsoleView(color).write();
		}
	}

	ProposedCombination read() {
		Error error;
		List<Color> colors = new ArrayList<Color>();
		do {
			error = null;
			this.console.write(Message.PROPOSED_COMBINATION.getMessage());
			String characters = this.console.readString();
			if (characters.length() != ProposedCombination.getWidth()) {
				error = Error.WRONG_LENGTH;
			} else {
				for (int i = 0; i < characters.length(); i++) {
					Color color = Color.getInstance(characters.charAt(i));
					if (color == null) {
						error = Error.WRONG_CHARACTERS;
					} else {
						for (int j = 0; j < colors.size(); j++) {
							if (color == colors.get(j)) {
								error = Error.DUPLICATED;
							}
						}
						colors.add(color);
					}
				}
			}
			if (error != null) {
				new ErrorConsoleView(error).writeln();
				while (!colors.isEmpty()) {
					colors.remove(0);
				}
			}
		} while (error != null);
		return new ProposedCombination(colors);
	}
}