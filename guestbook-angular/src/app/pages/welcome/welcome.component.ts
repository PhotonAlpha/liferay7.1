import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.less']
})
export class WelcomeComponent implements OnInit {
  defaultLang = 'en';
  isSpinning = true;
  validateForm!: FormGroup;

  constructor(private translate: TranslateService, private fb: FormBuilder) {
    translate.setDefaultLang(this.defaultLang);
  }

  ngOnInit(): void {
    this.translate.use(this.defaultLang).subscribe(data => {
      console.log('data', data);
    },
    (error) => {
      this.isSpinning = false;
      console.log('error', error);
    },
    () => {
      this.isSpinning = false;
      console.log('finally');
    });

    this.validateForm = this.fb.group({
      FormSection: this.fb.array([
        this.fb.group({
          name: 'create',
          checked: false
        }),
        this.fb.group({
          name: 'delete',
          checked: false
        }),
        this.fb.group({
          name: 'register',
          checked: true
        }),
        this.fb.group({
          name: 'update',
          checked: false
        })
      ]),
      fruit: this.fb.array([
        this.fb.group({
          name: 'apple',
          checked: true
        }),
        this.fb.group({
          name: 'pear',
          checked: false
        }),
        this.fb.group({
          name: 'orange',
          checked: false
        })
      ]),
      email: [null, [Validators.email, Validators.required]],
      nickname: [null, [Validators.required]],
      gender: []
      // password: [null, [Validators.required]],
      // checkPassword: [null, [Validators.required, this.confirmationValidator]],
      // phoneNumberPrefix: ['+86'],
      // phoneNumber: [null, [Validators.required]],
      // website: [null, [Validators.required]],
      // captcha: [null, [Validators.required]],
      // agree: [false]
    });
  }

  get fruitFormArray(): FormArray {
    return this.validateForm.get('fruit') as FormArray;
  }
  get formSectionArray(): FormArray {
    return this.validateForm.get('FormSection') as FormArray;
  }
  get genderArray(): FormArray {
    return this.validateForm.get('gender') as FormArray;
  }

  log(value: string[]): void {
    console.log(value);
    console.log(this.validateForm.value);
  }

  submitForm(): void {
    for (const i in this.validateForm.controls) {
      this.validateForm.controls[i].markAsDirty();
      this.validateForm.controls[i].updateValueAndValidity();
    }
  }

  updateConfirmValidator(): void {
    /** wait for refresh value */
    Promise.resolve().then(() => this.validateForm.controls.checkPassword.updateValueAndValidity());
  }

  confirmationValidator = (control: FormControl): { [s: string]: boolean } => {
    if (!control.value) {
      return { required: true };
    } else if (control.value !== this.validateForm.controls.password.value) {
      return { confirm: true, error: true };
    }
    return {};
  }

  getCaptcha(e: MouseEvent): void {
    e.preventDefault();
  }


  useLanguage(language: string) {
    this.translate.use(language);
  }



}
