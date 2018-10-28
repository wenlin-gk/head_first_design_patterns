package headfirst.designpatterns.iterator.diner_merger_cafe.menu;

import java.util.Iterator;

import headfirst.designpatterns.iterator.diner_merger_cafe.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
