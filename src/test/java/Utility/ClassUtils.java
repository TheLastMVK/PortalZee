package Utility;

public class ClassUtils {
    /////////////////////////////////////////RUTAS/////////////////////////////////////////
    public static String URL_PRINCIPAL_ZONAS_ECONOMICAS = "https://landing-test.vuce.gob.pe/vuce-zee-api-autorizacion/login/?urlReturn=https://landing-test.vuce.gob.pe/vuce-zee-mf/";
    public static String URL_INGRESO_BANDEJA_REGISTRO_DRAFT = "https://landing-test.vuce.gob.pe/vuce-zee-mf/#/ingreso/Registro/";
    public static String URL_INGRESO_BANDEJA_EVALUACION ="https://landing-test.vuce.gob.pe/vuce-zee-mf/#/aforo/evaluacion-documentaria/bandeja/";
    public static String URL_INGRESO_BANDEJA_CONTROL_INICIAL ="https://landing-test.vuce.gob.pe/vuce-zee-mf/#/ingreso/garita/Registro/";


    /////////////////////////////////////////USUARIOS/////////////////////////////////////////
    public static String ZeeUsrUsr = "info";
    public static String ZeePasUsr = "netconsultores";
    public static String ZeeUsrAdm = "abelchingo";
    public static String ZeePasAdm = "admin";
    public static String ZeeUsrTra = "nlinares";
    public static String ZeePasTra = "nlinares";
    public static String ZeeUsrAfo = "PAOLA";
    public static String ZeePasAfo = "PAOLA";
    public static String ZeeUsrTes = "ALONDRA";
    public static String ZeePasTes = "ALONDRA";

    /////////////////////////////////////////PARAMETROS DRAFT/////////////////////////////////////////
    public static String DrfMesAno = "DIC 2024"; //meses: ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEPT, OCT, NOV, DIC. seguido con un espacio y año completo
    public static String DrfNumDia = "18";
    public static String DrfTipPrd = "Del Resto del Territorio Nacional"; //Del Exterior, De las Zonas Especiales de Desarrollo, Del Resto del Territorio Nacional
    public static String DrfLugIng = "PUERTO DE ILO"; //PUERTO Y AEROPUERTO NACIONAL, PUERTO DE ILO,
    public static String DrfTipTra1 = "TRAMITE DRAFT SOLES"; //es variado de acuerdo al analista,
    public static String DrfTipTra2 = "TRAMITE DRAFT DOLARES"; //es variado de acuerdo al analista,
    public static String DrfTipTra3 = "MERCANCIA DE ANTONIO EN DRAFT"; //es variado de acuerdo al analista,
    public static String DrfTipTra4 = "EXPEDIENTE 56"; //es variado de acuerdo al analista,
    public static String DrfTipVia = "TERRESTRE"; //TERRESTRE, MARÍTIMO
    public static String DrfTipDoc = "SOLICITUD DE TRASLADO"; //MANIFIESTO INT DE CARGA, SOLICITUD DE TRASLADO, DOCUMENTO COMERCIAL
    public static String DrfAnoDoc = "2024"; //2021, 2022, 2023, 2024
    public static String DrfCatDoc = "20"; //20, 30, 36
    public static String DrfCorDoc = "12355"; //es variado de acuerdo al analista
    public static String DrfTipMer = "BULTOS"; //BULTOS, GRANEL
    public static String DrfBulDcl = "150"; //es variado de acuerdo al analista
    public static String DrfPesDcl = "300"; //es variado de acuerdo al analista
    public static String DrfUndMed = "KILOGRAMOS"; //KILOGRAMOS, TONELADAS
    public static String DrfDesMer = "Madera de alta calidad, para distintos tipo muebles"; //es variado de acuerdo al analista
    public static String DrfNroTar = "123"; //el numero de tarjeta debe estar configurada con la razon social previamente.

   //public static String DrfRazSoc = "ANTHONY S.A.C"; //es variado de acuerdo al analista (10 caracteres alfanumero)
    public static String DrfNroPlc = "MVK-123"; //Tiene que existir en registro
    public static String DrfNomChf = "GIANCARLOCISNEROSCABELLO"; //De alguna manera el sistema está aceptando nombre junto (sale error con espacio)
    public static String DrfTipCon = "20"; //es variado de acuerdo al analista
    public static String DrfNroCon = "1"; //es variado de acuerdo al analista
    public static String DrfNroBul = "30"; //es variado de acuerdo al analista
    public static String DrfTarKgs = "90"; //es variado de acuerdo al analista
    public static String DrfNroPre = "1"; //es variado de acuerdo al analista
    public static String DrfPlcCon = DrfNroPlc + "-1" ; //El numero de Placa + "-1"
    public static String DrfDcpDct = "9922295260"; //es variado de acuerdo al analista
    public static String DrfDetSec = "1"; //es variado de acuerdo al analista (error: está permitiendo 4 digitos)
    public static String DrfDepDes = "Almacén 04"; //Almacén 02, Almacén 04
    public static String DrfDetCsg = "AGROINDUSTRIAL DEL PERU SOCIEDAD ANONIMA CERRADA"; //es variado de acuerdo al analista (POR EL MOMENTO NO ACEPTA PUNTOS)
    public static String DrfDetBul = "150"; //es variado de acuerdo al analista
    public static String DrfDetPes = "300"; //es variado de acuerdo al analista
    public static String DrfDetMed = "KILOGRAMOS"; //KILOGRAMOS, TONELADAS
    public static String DrfDetFob = "1"; //es variado de acuerdo al analista
    public static String DrfDetMer = "MADERA DE BUENA CALIDAD DESTINADO PARA MUEBLES"; //50 caracteres máximo
    public static String DrfDoc011 = "Documento 011";
    public static String DrfRut011="C:\\Documentacion\\DOCUMENTO 011.pdf";
    public static String DrfDoc012 = "Documento 012";
    public static String DrfRut012="C:\\Documentacion\\DOCUMENTO 012.pdf";
    public static String DrfRutOtr="C:\\Documentacion\\Otro Documento.xlsx";
    public static String DrfRegNum="RD/ZEE-2023-333";

    //public static String DrfRegNum;
    public static String DrfOrdPag;

    /////////////////////////////////////////PARAMETROS ASIGNACION/////////////////////////////////////////
    public static String EvaDisMnn = "ON"; // OFF, ON (Disponibilidad de turno Manana - Al menos debe de haber un check activo)
    public static String EvaDisTrd = "OFF"; // OFF, ON (Disponibilidad de turno Tarde - Al menos debe de haber un check activo)
    public static String EvaDisNch = "ON"; // OFF, ON (Disponibilidad de turno Noche - Al menos debe de haber un check activo)
    public static String EvaDisAfo = "PAOLA ELIZABETH PRINCIPE DURAN"; //Se coloca el nombre del Aforador tal como se muestra en el sistema
    public static String EvaResDoc = "APROBADO"; // APROBADO, OBSERVADO (asignación del estado a los documentos)

    /////////////////////////////////////////PARAMETROS CONTROL INICIAL/////////////////////////////////////////
    public static String ConAutIng;











    public static  String CHROME_DRIVER_LOCATION = "src\\test\\resources\\Driver\\chromedriver.exe";

}
