package com.digitalsingular.rxdb.enclosure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SIGPAC19D_RECINTOS")
public class Enclosure {

	@Id
	@Column(name="ID_RECINTO")
	private int id;
	
	@Column(name="CD_PROVINCIA")
	private int province;
	
	@Column(name="CD_MUNICIPIO")
	private int town;
	
	@Column(name="CD_PARCELA")
	private int plot;
	
	@Column(name="CD_RECINTO")
	private int code;
	
	@Column(name="CD_USO")
	private String use;
	
	@Column(name="CD_AGREGADO")
	private Integer aggregate;
	
	@Column(name="CD_ZONA")
	private Integer zone;
	
	@Column(name="NU_AREA")
	private Float area;
	
	@Column(name="NU_PERIMETRO")
	private Float perimeter;
	
	@Column(name="NU_AREA_SIGPAC")
	private Float sigpacArea;
	
	@Column(name="NU_COEF_REGADIO")
	private Float irrigationCoefficient;
	
	@Column(name="NU_COEF_PASTOREO")
	private Float grazingCoefficient;
	
	@Column(name="NU_PDTE_MEDIA")
	private Float averageSlope;
	
	@Column(name="NU_PDTE_MAX")
	private Float maxSlope;
	
	@Column(name="NU_PDTE_MIN")
	private Float minSlope;
	
	@Column(name="NU_PORCENTAJE_CAT1")
	private Float firstCategoryPercentage;
	
	@Column(name="NU_PORCENTAJE_CAT2")
	private Float secondCategoryPercentage;
	
	@Column(name="NU_PORCENTAJE_CAT3")
	private Float thirdCategoryPercentage;
	
	@Column(name="NU_PORCENTAJE_CAT4")
	private Float fourthCategoryPercentage;
	
	@Column(name="NU_PORCENTAJE_CAT5")
	private Float fifthCategoryPercentage;
	
	@Column(name="NU_PORCENTAJE_CAT6")
	private Float sixthCategoryPercentage;
	
	@Column(name="LG_F_DEHESA")
	private boolean dehesado;
	
	@Column(name="NU_SUPERF_DEHESA")
	private Float dehesadaAreaPercentage;
	
	@Column(name="PC_DEHESA")
	private Float dehesaPercentage;
	
	@Column(name="NU_COEF_PASTOS")
	private Float pasturesCoefficient;
	
	@Column(name="PC_PASTOS")
	private Float pasturesPercentage;
	
	@Column(name="NU_COORDENADA_X")
	private Float xCoordinate;
	
	@Column(name="NU_COORDENADA_Y")
	private Float yCoordinate;
	
	@Column(name="LG_NO_DECLARA_5")
	private boolean fifthUndeclared;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public int getTown() {
		return town;
	}

	public void setTown(int town) {
		this.town = town;
	}

	public int getPlot() {
		return plot;
	}

	public void setPlot(int plot) {
		this.plot = plot;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public Integer getAggregate() {
		return aggregate;
	}

	public void setAggregate(Integer aggregate) {
		this.aggregate = aggregate;
	}

	public Integer getZone() {
		return zone;
	}

	public void setZone(Integer zone) {
		this.zone = zone;
	}

	public Float getArea() {
		return area;
	}

	public void setArea(Float area) {
		this.area = area;
	}

	public Float getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(Float perimeter) {
		this.perimeter = perimeter;
	}

	public Float getSigpacArea() {
		return sigpacArea;
	}

	public void setSigpacArea(Float sigpacArea) {
		this.sigpacArea = sigpacArea;
	}

	public Float getIrrigationCoefficient() {
		return irrigationCoefficient;
	}

	public void setIrrigationCoefficient(Float irrigationCoefficient) {
		this.irrigationCoefficient = irrigationCoefficient;
	}

	public Float getGrazingCoefficient() {
		return grazingCoefficient;
	}

	public void setGrazingCoefficient(Float grazingCoefficient) {
		this.grazingCoefficient = grazingCoefficient;
	}

	public Float getAverageSlope() {
		return averageSlope;
	}

	public void setAverageSlope(Float averageSlope) {
		this.averageSlope = averageSlope;
	}

	public Float getMaxSlope() {
		return maxSlope;
	}

	public void setMaxSlope(Float maxSlope) {
		this.maxSlope = maxSlope;
	}

	public Float getMinSlope() {
		return minSlope;
	}

	public void setMinSlope(Float minSlope) {
		this.minSlope = minSlope;
	}

	public Float getFirstCategoryPercentage() {
		return firstCategoryPercentage;
	}

	public void setFirstCategoryPercentage(Float firstCategoryPercentage) {
		this.firstCategoryPercentage = firstCategoryPercentage;
	}

	public Float getSecondCategoryPercentage() {
		return secondCategoryPercentage;
	}

	public void setSecondCategoryPercentage(Float secondCategoryPercentage) {
		this.secondCategoryPercentage = secondCategoryPercentage;
	}

	public Float getThirdCategoryPercentage() {
		return thirdCategoryPercentage;
	}

	public void setThirdCategoryPercentage(Float thirdCategoryPercentage) {
		this.thirdCategoryPercentage = thirdCategoryPercentage;
	}

	public Float getFourthCategoryPercentage() {
		return fourthCategoryPercentage;
	}

	public void setFourthCategoryPercentage(Float fourthCategoryPercentage) {
		this.fourthCategoryPercentage = fourthCategoryPercentage;
	}

	public Float getFifthCategoryPercentage() {
		return fifthCategoryPercentage;
	}

	public void setFifthCategoryPercentage(Float fifthCategoryPercentage) {
		this.fifthCategoryPercentage = fifthCategoryPercentage;
	}

	public Float getSixthCategoryPercentage() {
		return sixthCategoryPercentage;
	}

	public void setSixthCategoryPercentage(Float sixthCategoryPercentage) {
		this.sixthCategoryPercentage = sixthCategoryPercentage;
	}

	public boolean isDehesado() {
		return dehesado;
	}

	public void setDehesado(boolean dehesado) {
		this.dehesado = dehesado;
	}

	public Float getDehesadaAreaPercentage() {
		return dehesadaAreaPercentage;
	}

	public void setDehesadaAreaPercentage(Float dehesadaAreaPercentage) {
		this.dehesadaAreaPercentage = dehesadaAreaPercentage;
	}

	public Float getDehesaPercentage() {
		return dehesaPercentage;
	}

	public void setDehesaPercentage(Float dehesaPercentage) {
		this.dehesaPercentage = dehesaPercentage;
	}

	public Float getPasturesCoefficient() {
		return pasturesCoefficient;
	}

	public void setPasturesCoefficient(Float pasturesCoefficient) {
		this.pasturesCoefficient = pasturesCoefficient;
	}

	public Float getPasturesPercentage() {
		return pasturesPercentage;
	}

	public void setPasturesPercentage(Float pasturesPercentage) {
		this.pasturesPercentage = pasturesPercentage;
	}

	public Float getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(Float xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public Float getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(Float yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public boolean isFifthUndeclared() {
		return fifthUndeclared;
	}

	public void setFifthUndeclared(boolean fifthUndeclared) {
		this.fifthUndeclared = fifthUndeclared;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enclosure other = (Enclosure) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
