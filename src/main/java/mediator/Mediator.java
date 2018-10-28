package mediator;

import mediator.department.Department;

public interface Mediator {
	void register(String dname,Department d);
	void command(String dname);
}
