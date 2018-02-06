package com.dp.observer;

public interface Subject {

	void register(Observer o);

	void unregister(Observer o);

	void notifyObserversss();

}
