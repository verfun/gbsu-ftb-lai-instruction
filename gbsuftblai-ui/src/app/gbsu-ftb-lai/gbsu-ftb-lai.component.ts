import { GbsuFtbLaiFormComponent } from './../gbsu-ftb-lai-form/gbsu-ftb-lai-form.component';
import { Component, OnInit, OnDestroy} from '@angular/core';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  listOfNumber:NumberConverted[];
  
  ngOnInit(): void {
    this.listOfNumber =  [];
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.gbsuFtbLaiService.convertNumberToString(inputNumber)
        .subscribe(data => {
          //TODO check data
          let numberConverted:NumberConverted = new NumberConverted(inputNumber, data.result);
          this.listOfNumber.push(numberConverted);
        });
  }

}

class NumberConverted {
  constructor(public numberToConvert:number,public result:string) {}
}
