package in.nit.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.ShipmentType;

public class ShipmentTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(
			Map<String, Object> model,
			Document document,
			PdfWriter writer,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//download file
		response.addHeader("Content-Disposition","attachment;filename=shipments.pdf");
		
		//create element
		Paragraph p =new Paragraph("Welcome to Shipment Type");
		//add element to document 
		document.add(p);
		//read data from model
		@SuppressWarnings("unchecked")
		List<ShipmentType> list=((List<ShipmentType>) model.get("list"));
		
		//creating table with no of coloumns
		PdfPTable t = new PdfPTable(6);
		t.addCell("ID");
		t.addCell("Mode");
		t.addCell("Code");
		t.addCell("Enable");
		t.addCell("Grade");
		t.addCell("Note");
		
		//adding data to table
		for(ShipmentType st:list) {
			t.addCell(st.getShipId().toString());
			t.addCell(st.getShipMode().toString());
			t.addCell(st.getShipCode().toString());
			t.addCell(st.getShipEnb().toString());
			t.addCell(st.getShipGrade().toString());
			t.addCell(st.getShipDesc().toString());
		}
		//add table to document
		document.add(t);
		
		//print Date and Time
		document.add(new Paragraph(new Date().toString()));
	}

}
