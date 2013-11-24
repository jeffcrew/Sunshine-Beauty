/*
 * File: app/view/MainViewport.js
 *
 * This file was generated by Sencha Architect version 2.2.3.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('SunshineBeauty.view.MainViewport', {
    extend: 'Ext.container.Viewport',

    requires: [
        'SunshineBeauty.view.BannerPanel',
        'SunshineBeauty.view.TreatmentsManager'
    ],

    layout: {
        type: 'fit'
    },

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'panel',
                    border: false,
                    layout: {
                        align: 'stretch',
                        type: 'hbox'
                    },
                    bodyStyle: 'background-color: #F5F4ED;',
                    frameHeader: false,
                    header: false,
                    title: 'My Panel',
                    items: [
                        {
                            xtype: 'panel',
                            flex: 1,
                            border: false,
                            bodyStyle: 'background: transparent;',
                            frameHeader: false,
                            header: false
                        },
                        {
                            xtype: 'panel',
                            border: false,
                            cls: 'shell3',
                            width: 825,
                            layout: {
                                type: 'fit'
                            },
                            bodyCls: [
                                'x-panel-body-default',
                                'x-layout-fit'
                            ],
                            frameHeader: false,
                            header: false,
                            items: [
                                {
                                    xtype: 'panel',
                                    border: false,
                                    cls: 'shell2',
                                    layout: {
                                        type: 'fit'
                                    },
                                    bodyCls: [
                                        'shell2',
                                        'x-panel-body-default',
                                        'x-layout-fit'
                                    ],
                                    frameHeader: false,
                                    header: false,
                                    items: [
                                        {
                                            xtype: 'panel',
                                            border: false,
                                            cls: 'shell1',
                                            layout: {
                                                type: 'border'
                                            },
                                            bodyCls: [
                                                'shell1',
                                                'x-panel-body-default',
                                                'x-border-layout-ct'
                                            ],
                                            bodyStyle: 'background-color: white;',
                                            //frameHeader: false,
                                            //header: false,
                                            items: [
                                                {
                                                    xtype: 'bannerpanel',
                                                    region: 'north'
                                                },
                                                {
                                                    xtype: 'treatmentsmanager',
                                                    region: 'center',
                                                    border: false,
                                                    itemId: 'treatmentsManager',
                                                    margin: 8,
                                                }
                                            ]
                                        }
                                    ]
                                }
                            ]
                        },
                        {
                            xtype: 'panel',
                            flex: 1,
                            border: false,
                            bodyStyle: 'background: transparent;',
                            frameHeader: false,
                            header: false,
                            title: 'Spacer'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});