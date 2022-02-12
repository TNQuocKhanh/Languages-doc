/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import javax.swing.ImageIcon;

/**
 *
 * @author daonm
 */
public class IconData {

    public ImageIcon m_icon;
    public Object m_data;

    public IconData(ImageIcon icon, Object data) {
        m_icon = icon;
        m_data = data;
    }

    @Override
    public String toString() {
        return m_data.toString();
    }
}
