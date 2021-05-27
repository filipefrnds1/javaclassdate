package date_java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateAula {

	public static void main(String[] args) throws ParseException {

		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();// cria data com o horário atual !
		Date x2 = new Date(System.currentTimeMillis());// també,m cria data com horário atual. pega os milisegundos e transforma no horario atual
		Date x3 = new Date(0L);//cria a data em 31/12/1969 as 21:00:00 horas, o java armazena uma data em milisegundos a partir do 1 de janeiro de 1970, como a maquina aqui 
		//está no horario de sao paulo brasil, ele atrasa 3 horas por causa do fuso horários
		Date x4 = new Date(1000L * 60L * 60L * 5L);// passando o equivalente em 5 horas em milisegundos. 1000 milisegudnso x 60 milisegundos para dar 1 minutos x 60 milisegundos para dar 1 hora 
		// vezes 5 milisegundos para dar 5 horas
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:02");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));// padrão horário UTC - imprimi com 3 horas de atraso.
		
		System.out.println("--------------------------");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("--------------------------");
		System.out.println("x1: " + sdf1.format(x1));
		System.out.println("x2: " + sdf1.format(x2));
		System.out.println("x3: " + sdf1.format(x3));
		System.out.println("x4: " + sdf1.format(x4));
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf1.format(y2));
		System.out.println("y3: " + sdf1.format(y3));
		System.out.println("--------------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("---------------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date sdf2.format(x1) = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("13/05/2021");
		Date y2 = sdf2.parse("13/05/2021 16:31:30");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("----------------------------");
		System.out.println("x1 : " + sdf2.format(x1));
		System.out.println("x2 : " + sdf2.format(x2));
		System.out.println("x3 : " + sdf2.format(x3));
		System.out.println("x4 : " + sdf2.format(x4));
		
		System.out.println("y1 : " + sdf2.format(y1));
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);*/
	}

}
