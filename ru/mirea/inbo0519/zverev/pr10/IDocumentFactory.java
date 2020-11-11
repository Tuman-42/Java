package ru.mirea.inbo0519.zverev.pr10;

public interface IDocumentFactory {
    IDocument createNew(String name);
    IDocument createOpen(String name);
}
