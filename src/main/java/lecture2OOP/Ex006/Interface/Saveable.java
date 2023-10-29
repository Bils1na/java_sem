package lecture2OOP.Ex006.Interface;

import lecture2OOP.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
