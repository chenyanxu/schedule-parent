/**
 * 工作总结查询表单
 * @author
 * @version 1.0.0
 */
Ext.define('kalix.plan.worksummary.view.WorkSummarySearchForm', {
    extend: 'kalix.view.components.common.BaseSearchForm',
    requires: [
        'kalix.schedule.scheduleDict.component.ScheduleDictCombobox',
        'kalix.view.MultiComboBox'
    ],
    alias: 'widget.worksummarySearchForm',
    xtype: 'worksummarySearchForm',
    storeId: 'worksummaryStore',
    //==custom property
    isHiddenMultiComboBox: true,
    //custom property
    items: [
        {
            xtype: 'textfield',
            fieldLabel: '部门code',
            itemId: 'orgCode',
            labelAlign: 'right',
            labelWidth: 60,
            width: 200,
            name: 'code%:relation:OrganizationBean',
            hidden: true
        },
        {
            xtype: 'multiComboBox',
            valueFieldName: 'userId:in',
            displayText: '用    户',
            menuItemValue: 'id',
            menuItemText: 'name',
            storeUrl: CONFIG.restRoot + '/camel/rest/users/' + Ext.util.Cookies.get('currentUserId') + '/orgs/all/users',
            'callback': function () {
                var store = this.findParentByType('worksummarySearchForm').gridStore;
                if (store) {
                    store.currentPage = 1;
                    store.load();
                }
            },
            listeners: {
                'render': function() {
                    var isHidden = this.findParentByType('worksummarySearchForm').isHiddenMultiComboBox;
                    if (isHidden) {
                        this.hidden = true;
                    }
                }
            }
        },
        {
            fieldLabel: '总结类型',
            xtype: 'scheduleDictCombobox',
            dictType: '总结类型',
            labelAlign: 'right',
            labelWidth: 60,
            width: 200,
            name: 'workType'
        },
        {
            xtype: 'datefield',
            format: 'Y-m-d',             formatText:'格式为YYYY-mm-dd',
            fieldLabel: '开始日期:',
            labelAlign: 'right',
            labelWidth: 60,
            width: 200,
            name: 'beginDate:begin:gt'
        },
        {
            xtype: 'label',
            text: '-',
            margin: '5 5 0 5'
        },
        {
            xtype: 'datefield',
            format: 'Y-m-d',             formatText:'格式为YYYY-mm-dd',
            headLabel: true,
            labelAlign: 'right',
            width: 140,
            name: 'beginDate:end:lt'
        }
    ]
});
