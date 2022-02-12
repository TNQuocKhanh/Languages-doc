/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.awt.Color;

/**
 *
 * @author daonm
 */
public class ColorData {

    public Color m_color;
    public Object m_data;
    public static Color GREEN = new Color(0, 128, 0);
    public static Color RED = Color.red;

    public ColorData(Color color, Object data) {
        m_color = color;
        m_data = data;
    }

    public ColorData(Double data) {
        m_color = data.doubleValue() >= 0 ? GREEN : RED;
        m_data = data;
    }

    @Override
    public String toString() {
        return m_data.toString();
    }
}
