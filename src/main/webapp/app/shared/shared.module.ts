import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ECommerceSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [ECommerceSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [ECommerceSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ECommerceSharedModule {
  static forRoot() {
    return {
      ngModule: ECommerceSharedModule
    };
  }
}
