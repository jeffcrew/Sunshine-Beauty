describe("The Treatments Manager", function() {

    var mainController, treatmentsManager, categoryStore;

	beforeEach(function() {

		//get an instance of the Treatments Manager panel
		Ext.create('SunshineBeauty.store.Category', {
                storeId: 'Category'
            }
        );

        categoryStore = Ext.getStore('Category');

        //categoryStore.on('load', function(store) {
            //expect(store.getCount()).toBe(5);
        //});

        //Ext.getStore('Category').load();


		//get an instance of the Main Controller
		treatmentsManager = Ext.create('SunshineBeauty.view.TreatmentsManager');

        expect(treatmentsManager).toBeDefined();
		
		
	});
	
	it("should display a list of categories", function() {
	
		
	});
	
	
	it("should display category details when a category is selected", function() {
		
		
	});
	
	
	
	
	
});
