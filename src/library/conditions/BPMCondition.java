package library.conditions;

import library.Library;
import library.exceptions.InvalidQueryException;

public class BPMCondition extends AbstractNumberCondition {

	public BPMCondition(int query, int mode) throws InvalidQueryException {
		super(query, mode);
	}

	@Override
	public String getSQLCondition() {
		return getSQLCondition(Library.BPM);
	}

}
