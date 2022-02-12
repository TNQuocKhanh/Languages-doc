/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author daonm
 */
public class StockData {

    public String m_symbol;
    public String m_name;
    public Double m_last;
    public Double m_open;
    public Double m_change;
    public Double m_changePr;
    public Long m_volume;

    public StockData(String symbol, String name, double last,
            double open, double change, double changePr, long volume) {
        m_symbol = symbol;
        m_name = name;
        m_last = new Double(last);
        m_open = new Double(open);
        m_change = new Double(change);
        m_changePr = new Double(changePr);
        m_volume = new Long(volume);
    }
}

class ColumnData {

    public String m_title;
    public int m_width;
    public int m_alignment;

    public ColumnData(String title, int width, int alignment) {
        m_title = title;
        m_width = width;
        m_alignment = alignment;
    }
}
