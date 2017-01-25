package brut.androlib.err;

import brut.androlib.AndrolibException;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class OutDirExistsException extends AndrolibException {

	public OutDirExistsException(Throwable cause) {
		super(cause);
	}

	public OutDirExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public OutDirExistsException(String message) {
		super(message);
	}

	public OutDirExistsException() {
	}
}