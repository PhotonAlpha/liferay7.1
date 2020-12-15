import { NgModule } from '@angular/core';
import { LazyLoadedModule } from 'src/app/lazy-loaded.module';
import { NgZorroModule } from 'src/app/ngZorro.module';

import { WelcomeRoutingModule } from './welcome-routing.module';

import { WelcomeComponent } from './welcome.component';


@NgModule({
  imports: [
    WelcomeRoutingModule,
    NgZorroModule,
    LazyLoadedModule
  ],
  declarations: [WelcomeComponent],
  exports: [WelcomeComponent]
})
export class WelcomeModule { }
