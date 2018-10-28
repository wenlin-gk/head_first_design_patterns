package iterator.diner_merger_cafe.menu;

import java.util.Iterator;

import iterator.diner_merger_cafe.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
