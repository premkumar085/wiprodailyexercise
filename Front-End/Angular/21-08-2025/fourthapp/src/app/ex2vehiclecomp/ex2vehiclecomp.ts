import { ChangeDetectorRef, Component } from '@angular/core';
import { IVehicle } from '../ivehicle';
import { VehicleService } from '../vehicle-service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex2vehiclecomp',
  imports: [FormsModule],
  templateUrl: './ex2vehiclecomp.html',
  styleUrl: './ex2vehiclecomp.css'
})
export class Ex2vehiclecomp {
  constructor(private vehicleService: VehicleService, private cdr: ChangeDetectorRef) {}

  vehicles: IVehicle[] = [];
  vehicleEdit: IVehicle = {
    id: '',
    make: '',
    fuelType: '',
    model: '',
    price: 0
  };
  vehicleAdd: IVehicle = {
    id: '',
    make: '',
    fuelType: '',
    model: '',
    price: 0
  };

  ngOnInit() {
    this.vehicleService.getVehicles().subscribe((data: IVehicle[]) => {
      this.vehicles = data;
      this.cdr.detectChanges();
      console.log('Vehicles fetched successfully:', this.vehicles);
    }, (error) => {
      console.error('Error fetching vehicles:', error);
    });
  }

  edit(vehicleId: string) {
    this.vehicleService.getVehicleById(vehicleId).subscribe((vehicle: IVehicle) => {
      this.vehicleEdit = vehicle;
      this.cdr.detectChanges();
    }, (error) => {
      console.error('Error fetching vehicle by ID:', error);
    });
  }

  update() {
    this.vehicleService.updateVehicle(this.vehicleEdit).subscribe((updatedVehicle: IVehicle) => {
      const index = this.vehicles.findIndex(v => v.id === updatedVehicle.id);
      if (index !== -1) {
        this.vehicles[index] = updatedVehicle;
      }
      this.vehicleEdit = { id: '', make: '', fuelType: '', model: '', price: 0 };
      this.cdr.detectChanges();
      this.ngOnInit();
    }, (error) => {
      console.error('Error updating vehicle:', error);
    });
  }

  delete(vehicleId: string) {
    this.vehicleService.deleteVehicle(vehicleId).subscribe(() => {
      this.vehicles = this.vehicles.filter(v => v.id !== vehicleId);
      this.cdr.detectChanges();
      this.ngOnInit();
    }, (error) => {
      console.error('Error deleting vehicle:', error);
    });
  }

  save() {
    this.vehicleService.saveVehicle(this.vehicleAdd).subscribe((newVehicle: IVehicle) => {
      this.vehicles.push(newVehicle);
      this.vehicleAdd = { id: '', make: '', fuelType: '', model: '', price: 0 };
      this.cdr.detectChanges();
    }, (error) => {
      console.error('Error saving vehicle:', error);
    });
  }

}
