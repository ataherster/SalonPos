/**
 * harap dibaca dengan seksama
 *
 *
 */
package com.salon.util;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Ahmad Thahir
 */
public class tJTextField extends JTextField {

    public enum CharacterCasing {
        NORMAL, UPPER, LOWER
    }

    private CharacterCasing characterCasing=CharacterCasing.NORMAL;

    public CharacterCasing getCharacterCasing() {
        return characterCasing;
    }

    public void setCharacterCasing(CharacterCasing characterCasing) {
        this.characterCasing = characterCasing;
    }

    DocumentFilter filter = new DocumentFilter() {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (getCharacterCasing()==CharacterCasing.UPPER) {
                string=string.toUpperCase();
            } else if (getCharacterCasing()==CharacterCasing.LOWER) {
                string=string.toLowerCase();
            }
            super.insertString(fb, offset, string.toUpperCase(), attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (getCharacterCasing()==CharacterCasing.UPPER) {
                text=text.toUpperCase();
            } else if (getCharacterCasing()==CharacterCasing.LOWER) {
                text=text.toLowerCase();
            }
            super.replace(fb, offset, length, text.toUpperCase(), attrs);
        }

    };

    @Override
    public Document getDocument() {
        //return super.getDocument();
        return (Document) filter;
    }



}
