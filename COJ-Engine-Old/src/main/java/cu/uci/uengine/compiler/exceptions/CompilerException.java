/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cu.uci.uengine.compiler.exceptions;

/**
 *
 * @author lan
 */
public class CompilerException extends Exception {

    /**
     * Creates a new instance of <code>ServerInternalException</code> without
     * detail message.
     */
    public CompilerException() {
    }

    /**
     * Constructs an instance of <code>ServerInternalException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CompilerException(String msg) {
        super(msg);
    }
}
