describe('template spec', () => {
  it('passes', () => {
    cy.visit('https://www.amazon.com')
    /* ==== Generated with Cypress Studio ==== */
    cy.get('#twotabsearchtextbox').clear('l');
    cy.get('#twotabsearchtextbox').type('laptop{enter}');
    cy.get('#nav-search-submit-button').click();
    cy.get('#p_89\\/HP > .a-list-item > .a-link-normal > .a-checkbox > label > .a-icon').click();
    cy.get('#n\\/2811119011 > .a-list-item > .a-link-normal > .a-size-base').click();
    cy.get('#p_89\\/Microsoft > .a-list-item > .a-link-normal > .a-checkbox > label > .a-icon').click();
    cy.get('[data-asin="B08TQPTPCK"] > .sg-col-inner > .s-widget-container > [data-action="puis-card-container-declarative"] > .puis-card-container > :nth-child(1) > :nth-child(1) > .puisg-col-8-of-16 > :nth-child(1) > .a-spacing-small > [data-cy="title-recipe"] > .a-size-mini > .a-link-normal > .a-size-medium').click();
    /* ==== End Cypress Studio ==== */
  })
})