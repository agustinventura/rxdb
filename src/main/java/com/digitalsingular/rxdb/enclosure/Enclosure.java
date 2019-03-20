package com.digitalsingular.rxdb.enclosure;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

@Table("SIGPAC19D_RECINTOS")
public class Enclosure {

	@Id
	@Column("id_recinto")
	private int id;
	
	@Column("cd_provincia")
	private int province;
	
	@Column("cd_municipio")
	private int town;
	
	@Column("cd_parcela")
	private int plot;
	
	@Column("cd_recinto")
	private int code;
	
	@Column("cd_uso")
	private String use;
	
	@Column("cd_agregado")
	private Integer aggregate;
	
	@Column("cd_zona")
	private Integer zone;
	
	@Column("nu_area")
	private Float area;
	
	@Column("nu_perimetro")
	private Float perimeter;
	
	@Column("nu_area_sigpac")
	private Float sigpacArea;
	
	@Column("nu_coef_regadio")
	private Float irrigationCoefficient;
	
	@Column("nu_coef_pastoreo")
	private Float grazingCoefficient;
	
	@Column("nu_pdte_media")
	private Float averageSlope;
	
	@Column("nu_pdte_max")
	private Float maxSlope;
	
	@Column("nu_pdte_min")
	private Float minSlope;
	
	@Column("nu_porcentaje_cat1")
	private Float firstCategoryPercentage;
	
	@Column("nu_porcentaje_cat2")
	private Float secondCategoryPercentage;
	
	@Column("nu_porcentaje_cat3")
	private Float thirdCategoryPercentage;
	
	@Column("nu_porcentaje_cat4")
	private Float fourthCategoryPercentage;
	
	@Column("nu_porcentaje_cat5")
	private Float fifthCategoryPercentage;
	
	@Column("nu_porcentaje_cat6")
	private Float sixthCategoryPercentage;
	
	@Column("lg_f_dehesa")
	private boolean dehesado;
	
	@Column("nu_superf_dehesa")
	private Float dehesadaAreaPercentage;
	
	@Column("pc_dehesa")
	private Float dehesaPercentage;
	
	@Column("nu_coef_pastos")
	private Float pasturesCoefficient;
	
	@Column("pc_pastos")
	private Float pasturesPercentage;
	
	@Column("nu_coordenada_x")
	private Float xCoordinate;
	
	@Column("nu_coordenada_y")
	private Float yCoordinate;
	
	@Column("lg_no_declara_5")
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
