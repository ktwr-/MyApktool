package brut.androlib.err;

import brut.androlib.AndrolibException;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class CantFindFrameworkResException extends AndrolibException {

	public CantFindFrameworkResException(Throwable cause, int id) {
		super(cause);
		mPkgId = id;
	}

	public CantFindFrameworkResException(int id) {
		mPkgId = id;
	}

	public int getPkgId() {
		return mPkgId;
	}

	private final int mPkgId;
}


