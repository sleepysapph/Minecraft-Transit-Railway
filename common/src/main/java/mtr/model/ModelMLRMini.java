package mtr.model;

public class ModelMLRMini extends ModelMLR {

	@Override
	protected int[] getWindowPositions() {
		return new int[]{0};
	}

	@Override
	protected int[] getDoorPositions() {
		return new int[]{-32, 32};
	}

	@Override
	protected int[] getEndPositions() {
		return new int[]{-64, 64};
	}

	@Override
	protected int[] getBogiePositions() {
		return new int[]{0};
	}
}