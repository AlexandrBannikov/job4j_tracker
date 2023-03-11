package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder tmp = new StringBuilder();
        int size = evenElements.size() / 2;
        for (int i = 0; i < size; i++) {
            tmp.append(evenElements.poll());
            evenElements.poll();
        }
        return tmp.toString();
    }

    private String getDescendingElements() {
        StringBuilder tmp = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            tmp.append(descendingElements.pollLast());
        }
        return tmp.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
