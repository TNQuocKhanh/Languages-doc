/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 *
 * @author daonm
 */

@SuppressWarnings("serial")
public class StocksTable extends JFrame {

    protected JTable m_table;	//bảng JTable hiển thị dữ liệu
    protected StockTableData m_data;//các kiểu dữ liệu trong bảng, quản lí kiểu dữ liệu
    protected JLabel m_title;

    public StocksTable() {	//constructor - khởi tạo tất cả các đối tượng sử dụng
        super("Stocks Table");	//khởi tạo 1 frame có tiêu đề Stocks Table
        setSize(600, 300);	//kích cỡ frame

        //chỉnh sửa cho chọn toàn bộ dòng
        UIManager.put("Table.focusCellHighlightBorder",
                new LineBorder(Color.black, 0));

        m_data = new StockTableData();	
        
        //đặt tiêu đề và đưa hình ảnh
        m_title = new JLabel(m_data.getTitle(),
                new ImageIcon("money.gif"), SwingConstants.CENTER);
        //font cho tiêu đề
        m_title.setFont(new Font("Helvetica", Font.PLAIN, 24));
        //đặt tiêu đề lên trên cùng
        getContentPane().add(m_title, BorderLayout.NORTH);
        
        //khởi tạo đối tượng JTable mới
        m_table = new JTable();
        m_table.setAutoCreateColumnsFromModel(false);	//ko cho tự động tạo Model
        m_table.setModel(m_data);	//áp dụng Model của do mình tạo
        
        //vòng lặp có giới hạn là số cột của Model ta vừa tạo
        //khởi tạo và set up với từng cột trong bảng
        for (int k = 0; k < m_data.getColumnCount(); k++) {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(
                    StockTableData.m_columns[k].m_alignment);
            //khởi tạo kiểu mẫu cho từng cột và căn thẳng hàng qa từng cell
            
            TableColumn column = new TableColumn(k,
                    StockTableData.m_columns[k].m_width, renderer, null);
            //phần null là TableCellEditor, thể hiện cho việc
            //ko cho người dùng sửa lại dữ liệu trực tiếp trên từng cell
            
            //thêm từng cột vào bảng
            m_table.addColumn(column);
        }
        
        
        //only a column’s table header is displayed during a drag
        JTableHeader header = m_table.getTableHeader(); 	//lấy các tiêu đề - field
        header.setUpdateTableInRealTime(true);	//phương thức bị lỗi thời
        //thực hiện kéo thả vô điều kiện, có hay ko ko quan trọng
        //ko quan trọng giá trị boolean

        //khởi tạo JScrollPane để cho bảng dữ liệu vào
        //Lastly a JScrollPane instance is used to provide scrolling capabilities, 
        //and our table is added to its JViewport. 
        //This JScrollPane is then added to the center of our frame’s content pane.
        JScrollPane ps = new JScrollPane();
        ps.getViewport().setBackground(m_table.getBackground());
        ps.getViewport().add(m_table);
        getContentPane().add(ps, BorderLayout.CENTER);	
    }

    public static void main(String argv[]) {
        StocksTable frame = new StocksTable();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
