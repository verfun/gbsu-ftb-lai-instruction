import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  
  @Output() submitNumberOutput:EventEmitter<number> = new EventEmitter<number>();

  gbsuFtbLaiFormGroup = new FormGroup ({
    inputNumber: new FormControl('',[Validators.required, Validators.max(2147483647)])
  });
  constructor() {
  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.gbsuFtbLaiFormGroup.get('inputNumber').value);
    this.gbsuFtbLaiFormGroup.reset();
  }

}
