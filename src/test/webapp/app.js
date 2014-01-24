Ext.Loader.setConfig ({enabled: true});

// Loading different components like controller, model, view..
Ext.application ({
    controllers:[ 'MainController' ],
    models: [
        'Category',
        'Treatment'
    ],
    stores: [
        'Category',
        'Treatment'
    ],
    views: [
        'BannerPanel',
        'CategoryDetail',
        'CategoryGrid',
        'MainViewport',
        'TreatmentsManager',
        'Viewport.js'
    ],
    autoCreateViewport: true,
    name: 'SunshineBeauty',

    // using the Launch method of Application object to execute the Jasmine
    //Test Cases
    launch: function () {
        var jasmineEnv = jasmine.getEnv ();
        jasmineEnv.updateInterval = 1000;
        var htmlReporter = new jasmine.HtmlReporter ();
        jasmineEnv.addReporter (htmlReporter);
        jasmineEnv.execute ();
    }

});
