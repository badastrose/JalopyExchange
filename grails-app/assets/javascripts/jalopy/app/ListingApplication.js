Ext.define('Jalopy.app.ListingApplication', {
    extend : 'Ext.app.Application',

    appProperty : 'listing',
    paths : {
        'Ext' : '.'
    },
    views : [ 'Jalopy.common.view.JalopyCombo' ],
    stores : [ 'Listing', 'filters.Seller' ],

    launch : function() {
        console.log('listing app launched');
    }
});