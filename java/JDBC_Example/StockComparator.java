/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.util.Comparator;

/**
 *
 * @author daonm
 */
@SuppressWarnings("rawtypes")
public class StockComparator implements Comparator {

	protected int		 m_sortCol;
	protected boolean m_sortAsc;

	public StockComparator(int sortCol, boolean sortAsc) {
		m_sortCol = sortCol;
		m_sortAsc = sortAsc;
	}

        @Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof StockData) || !(o2 instanceof StockData))
			return 0;
		StockData s1 = (StockData)o1;
		StockData s2 = (StockData)o2;
		int result = 0;
		double d1, d2;
		switch (m_sortCol) {
			case 0:		// symbol
				String str1 = (String)s1.m_symbol.m_data;
				String str2 = (String)s2.m_symbol.m_data;
				result = str1.compareTo(str2);
				break;
			case 1:		// name
				result = s1.m_name.compareTo(s2.m_name);
				break;
			case 2:		// last
				d1 = s1.m_last.doubleValue();
				d2 = s2.m_last.doubleValue();
				result = d1<d2 ? -1 : (d1>d2 ? 1 : 0);
				break;
			case 3:		// open
				d1 = s1.m_open.doubleValue();
				d2 = s2.m_open.doubleValue();
				result = d1<d2 ? -1 : (d1>d2 ? 1 : 0);
				break;
			case 4:		// change
				d1 = ((Double)s1.m_change.m_data).doubleValue();
				d2 = ((Double)s2.m_change.m_data).doubleValue();
				result = d1<d2 ? -1 : (d1>d2 ? 1 : 0);
				break;
			case 5:		// change %
				d1 = ((Double)s1.m_changePr.m_data).doubleValue();
				d2 = ((Double)s2.m_changePr.m_data).doubleValue();
				result = d1<d2 ? -1 : (d1>d2 ? 1 : 0);
				break;
			case 6:		// volume
				long l1 = s1.m_volume.longValue();
				long l2 = s2.m_volume.longValue();
				result = l1<l2 ? -1 : (l1>l2 ? 1 : 0);
				break;
		}

		if (!m_sortAsc)
			result = -result;
		return result;
	}

        @Override
	public boolean equals(Object obj) {
		if (obj instanceof StockComparator) {
			StockComparator compObj = (StockComparator)obj;
			return (compObj.m_sortCol==m_sortCol) &&
				(compObj.m_sortAsc==m_sortAsc);
		}
		return false;
	}
}

