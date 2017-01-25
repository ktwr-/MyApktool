package brut.androlib.err;

import brut.androlib.AndrolibException;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class UndefinedResObject extends AndrolibException {
	public UndefinedResObject(Throwable cause) {
		super(cause);
	}

	public UndefinedResObject(String message, Throwable cause) {
		super(message, cause);
	}

	public UndefinedResObject(String message) {
		super(message);
	}

	public UndefinedResObject() {
	}
}