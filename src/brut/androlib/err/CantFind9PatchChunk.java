package brut.androlib.err;

import brut.androlib.AndrolibException;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class CantFind9PatchChunk extends AndrolibException {

	public CantFind9PatchChunk(Throwable cause) {
		super(cause);
	}

	public CantFind9PatchChunk(String message, Throwable cause) {
		super(message, cause);
	}

	public CantFind9PatchChunk(String message) {
		super(message);
	}

	public CantFind9PatchChunk() {
	}
}