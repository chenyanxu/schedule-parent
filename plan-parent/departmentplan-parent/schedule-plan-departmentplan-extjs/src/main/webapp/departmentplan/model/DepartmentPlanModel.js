/**
 * 部门计划模型
 *
 * @author
 * @version 1.0.0
 */


Ext.define('kalix.plan.departmentplan.model.DepartmentPlanModel', {
    extend: 'kalix.model.BaseModel',

    //todo 在此修改模型定义
    fields: [
        {
            name: 'userId',
            type: 'int',
            defaultValue: 0
        },
        {
            name: 'userName',
            type: 'string'
        },
        {
            name: 'departmentId',
            type: 'int',
            defaultValue: 0,
            validators: [{type: 'presence'}]
        },
        {
            name: 'departmentName',
            type: 'string',
            validators: [{type: 'presence'}]
        },
        {
            name: 'title',
            type: 'string',
            validators: [{type: 'presence'}]
        },
        {
            name: 'content',
            type: 'string'
            ,
            validators: [{type: 'presence'}]
        },
        {
            name: 'planType',
            type: 'string',
            validators: [{type: 'presence'}]
        },
        {
            name: 'beginDate',
            type: 'date',
            dateFormat: 'Y-m-d H:i:s',
            validators: [{type: 'presence'}]
        },
        {
            name: 'endDate',
            type: 'date',
            dateFormat: 'Y-m-d H:i:s',
            validators: [{type: 'presence'}]
        },
        {
            name: 'state',
            type: 'string',
            defaultValue: '0'
        }
    ]
});
