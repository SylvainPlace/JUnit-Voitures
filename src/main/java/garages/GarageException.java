/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package garages;

/**
 *
 * @author SylvainPlc
 */
public class GarageException extends Exception{

    /**
     * Creates a new instance of <code>GarageException</code> without detail
     * message.
     */
    public GarageException() {
    }

    /**
     * Constructs an instance of <code>GarageException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public GarageException(String msg) {
        super(msg);
    }
}
