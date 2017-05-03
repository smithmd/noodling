import { AngularCliLearningPage } from './app.po';

describe('angular-cli-learning App', () => {
  let page: AngularCliLearningPage;

  beforeEach(() => {
    page = new AngularCliLearningPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
