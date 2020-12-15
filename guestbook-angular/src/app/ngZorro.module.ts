import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzFormModule } from 'ng-zorro-antd/form';
import { NzInputModule } from 'ng-zorro-antd/input';
import { NzSelectModule } from 'ng-zorro-antd/select';
import { NzTypographyModule } from 'ng-zorro-antd/typography';
import { NzDividerModule } from 'ng-zorro-antd/divider';
import { NzGridModule } from 'ng-zorro-antd/grid';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzCheckboxModule } from 'ng-zorro-antd/checkbox';
import { NzSpinModule } from 'ng-zorro-antd/spin';
import { NzRadioModule } from 'ng-zorro-antd/radio';

const ngModules = [
  CommonModule,
  ReactiveFormsModule,

  NzButtonModule,
  NzFormModule,
  NzInputModule,
  NzSelectModule,
  NzTypographyModule,
  NzDividerModule,
  NzGridModule,
  NzLayoutModule,
  NzCheckboxModule,
  NzSpinModule,
  NzRadioModule
];

@NgModule({
  imports: [],
  exports: [ngModules],
})
export class NgZorroModule { }
