/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author daonm
 */
@SuppressWarnings("serial")
public class ColoredTableCellRenderer extends DefaultTableCellRenderer {

  @Override
  public void setValue(Object value) {
    if (value instanceof ColorData) {
      ColorData cvalue = (ColorData)value;
      setForeground(cvalue.m_color);
      setText(cvalue.m_data.toString());
    }
    else if (value instanceof IconData) {
      IconData ivalue = (IconData)value;
      setIcon(ivalue.m_icon);
      setText(ivalue.m_data.toString());
    }
    else
      super.setValue(value);
  }
}

