package brut.androlib.err;

import brut.androlib.AndrolibException;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class InFileNotFoundException extends AndrolibException {

	public InFileNotFoundException(Throwable cause) {
		super(cause);
	}

	public InFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public InFileNotFoundException(String message) {
		super(message);
	}

	public InFileNotFoundException() {
	}
}