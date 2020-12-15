import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { ModuleWithProviders, NgModule } from '@angular/core';
import { MissingTranslationHandler, TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { IdealMissingTranslationHandler } from './service/ideal-missing-translation-handler.service';
import { IdealTranslationLoaderService } from './service/idealTranslationLoader.service';

export function HttpLoaderFactory(http: HttpClient) {
  // return new TranslateHttpLoader(http, './assets/i18n/', '.json');
  return new IdealTranslationLoaderService(http);
}

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    TranslateModule.forChild({
        loader: {
          provide: TranslateLoader, 
          useFactory: HttpLoaderFactory,
          deps: [HttpClient]
        },
        // compiler: {provide: TranslateCompiler, useClass: CustomCompiler},
        // parser: {provide: TranslateParser, useClass: CustomParser},
        missingTranslationHandler: {provide: MissingTranslationHandler, useClass: IdealMissingTranslationHandler},
        isolate: true
    })
  ],
  exports: [TranslateModule]
})
export class LazyLoadedModule {
  static forRoot(): ModuleWithProviders {
    return {
      ngModule: LazyLoadedModule,
      providers: [
        // ShoppingCartService, AccountService
      ]
    }
  }
}