import { Angular2InSpringAppPage } from './app.po';

describe('angular2-in-spring-app App', function() {
  let page: Angular2InSpringAppPage;

  beforeEach(() => {
    page = new Angular2InSpringAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
