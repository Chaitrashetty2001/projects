package many_to_many_bi.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	@CreationTimestamp
	private LocalDateTime dateTime; 
	private String CarName;
	private double carPrice;
	@ManyToMany(mappedBy ="car")
		List<Features> features;
		public int getCarId() {
			return carId;
		}
		public void setCarId(int carId) {
			this.carId = carId;
		}
		public LocalDateTime getDateTime() {
			return dateTime;
		}
		public void setDateTime(LocalDateTime dateTime) {
			this.dateTime = dateTime;
		}
		public String getCarName() {
			return CarName;
		}
		public void setCarName(String carName) {
			CarName = carName;
		}
		public double getCarPrice() {
			return carPrice;
		}
		public void setCarPrice(double carPrice) {
			this.carPrice = carPrice;
		}
		public List<Features> getFeatures() {
			return features;
		}
		public void setFeatures(List<Features> features) {
			this.features = features;
		}
		

}
