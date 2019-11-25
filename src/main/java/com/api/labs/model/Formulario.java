package com.api.labs.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "form")
public class Formulario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6189723066214492318L;
	@Id
    private String id;
	
	@CreatedDate
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date fechaSolicitud;
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date fechaProgramada;
    private String laboratorio;
    private String asignatura;
    private String docente;
    private String nombrePractica;
    private String facultad;
    private String bloque;
    private Boolean guia;
    private Boolean usoLaboratorio;
    private Boolean asisAuxiliar;
    private Boolean maquinas;
    private Boolean material;
    private Integer cantEstudiantes;
    private String docEntrega;
    private String recibe;
    private String observaciones;
    private Boolean matPendiente;
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date horaEntrada;
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date horaSalida;
    
    
    
    
    
	public Formulario(String id, Date fechaSolicitud, Date fechaProgramada, String laboratorio, String asignatura,
			String docente, String nombrePractica, String facultad, String bloque, Boolean guia, Boolean usoLaboratorio,
			Boolean asisAuxiliar, Boolean maquinas, Boolean material, Integer cantEstudiantes, String docEntrega,
			String recibe, String observaciones, Boolean matPendiente, Date horaEntrada, Date horaSalida) {
		super();
		this.id = id;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaProgramada = fechaProgramada;
		this.laboratorio = laboratorio;
		this.asignatura = asignatura;
		this.docente = docente;
		this.nombrePractica = nombrePractica;
		this.facultad = facultad;
		this.bloque = bloque;
		this.guia = guia;
		this.usoLaboratorio = usoLaboratorio;
		this.asisAuxiliar = asisAuxiliar;
		this.maquinas = maquinas;
		this.material = material;
		this.cantEstudiantes = cantEstudiantes;
		this.docEntrega = docEntrega;
		this.recibe = recibe;
		this.observaciones = observaciones;
		this.matPendiente = matPendiente;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public Date getFechaProgramada() {
		return fechaProgramada;
	}
	public void setFechaProgramada(Date fechaProgramada) {
		this.fechaProgramada = fechaProgramada;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getNombrePractica() {
		return nombrePractica;
	}
	public void setNombrePractica(String nombrePractica) {
		this.nombrePractica = nombrePractica;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getBloque() {
		return bloque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	public Boolean getGuia() {
		return guia;
	}
	public void setGuia(Boolean guia) {
		this.guia = guia;
	}
	public Boolean getUsoLaboratorio() {
		return usoLaboratorio;
	}
	public void setUsoLaboratorio(Boolean usoLaboratorio) {
		this.usoLaboratorio = usoLaboratorio;
	}
	public Boolean getAsisAuxiliar() {
		return asisAuxiliar;
	}
	public void setAsisAuxiliar(Boolean asisAuxiliar) {
		this.asisAuxiliar = asisAuxiliar;
	}
	public Boolean getMaquinas() {
		return maquinas;
	}
	public void setMaquinas(Boolean maquinas) {
		this.maquinas = maquinas;
	}
	public Boolean getMaterial() {
		return material;
	}
	public void setMaterial(Boolean material) {
		this.material = material;
	}
	public Integer getCantEstudiantes() {
		return cantEstudiantes;
	}
	public void setCantEstudiantes(Integer cantEstudiantes) {
		this.cantEstudiantes = cantEstudiantes;
	}
	public String getDocEntrega() {
		return docEntrega;
	}
	public void setDocEntrega(String docEntrega) {
		this.docEntrega = docEntrega;
	}
	public String getRecibe() {
		return recibe;
	}
	public void setRecibe(String recibe) {
		this.recibe = recibe;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Boolean getMatPendiente() {
		return matPendiente;
	}
	public void setMatPendiente(Boolean matPendiente) {
		this.matPendiente = matPendiente;
	}
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}


}
