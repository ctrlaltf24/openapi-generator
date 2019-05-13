/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FormatTest model module.
 * @module model/FormatTest
 * @version 1.0.0
 */
class FormatTest {
    /**
     * Constructs a new <code>FormatTest</code>.
     * @alias module:model/FormatTest
     * @param _number {Number} 
     * @param _byte {Blob} 
     * @param _date {Date} 
     * @param password {String} 
     */
    constructor(_number, _byte, _date, password) { 
        
        FormatTest.initialize(this, _number, _byte, _date, password);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, _number, _byte, _date, password) { 
        obj['number'] = _number;
        obj['byte'] = _byte;
        obj['date'] = _date;
        obj['password'] = password;
    }

    /**
     * Constructs a <code>FormatTest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FormatTest} obj Optional instance to populate.
     * @return {module:model/FormatTest} The populated <code>FormatTest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FormatTest();

            if (data.hasOwnProperty('integer')) {
                obj['integer'] = ApiClient.convertToType(data['integer'], 'Number');
            }
            if (data.hasOwnProperty('int32')) {
                obj['int32'] = ApiClient.convertToType(data['int32'], 'Number');
            }
            if (data.hasOwnProperty('int64')) {
                obj['int64'] = ApiClient.convertToType(data['int64'], 'Number');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
            if (data.hasOwnProperty('float')) {
                obj['float'] = ApiClient.convertToType(data['float'], 'Number');
            }
            if (data.hasOwnProperty('double')) {
                obj['double'] = ApiClient.convertToType(data['double'], 'Number');
            }
            if (data.hasOwnProperty('string')) {
                obj['string'] = ApiClient.convertToType(data['string'], 'String');
            }
            if (data.hasOwnProperty('byte')) {
                obj['byte'] = ApiClient.convertToType(data['byte'], 'Blob');
            }
            if (data.hasOwnProperty('binary')) {
                obj['binary'] = ApiClient.convertToType(data['binary'], File);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('dateTime')) {
                obj['dateTime'] = ApiClient.convertToType(data['dateTime'], 'Date');
            }
            if (data.hasOwnProperty('uuid')) {
                obj['uuid'] = ApiClient.convertToType(data['uuid'], 'String');
            }
            if (data.hasOwnProperty('password')) {
                obj['password'] = ApiClient.convertToType(data['password'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} integer
 */
FormatTest.prototype['integer'] = undefined;

/**
 * @member {Number} int32
 */
FormatTest.prototype['int32'] = undefined;

/**
 * @member {Number} int64
 */
FormatTest.prototype['int64'] = undefined;

/**
 * @member {Number} number
 */
FormatTest.prototype['number'] = undefined;

/**
 * @member {Number} float
 */
FormatTest.prototype['float'] = undefined;

/**
 * @member {Number} double
 */
FormatTest.prototype['double'] = undefined;

/**
 * @member {String} string
 */
FormatTest.prototype['string'] = undefined;

/**
 * @member {Blob} byte
 */
FormatTest.prototype['byte'] = undefined;

/**
 * @member {File} binary
 */
FormatTest.prototype['binary'] = undefined;

/**
 * @member {Date} date
 */
FormatTest.prototype['date'] = undefined;

/**
 * @member {Date} dateTime
 */
FormatTest.prototype['dateTime'] = undefined;

/**
 * @member {String} uuid
 */
FormatTest.prototype['uuid'] = undefined;

/**
 * @member {String} password
 */
FormatTest.prototype['password'] = undefined;






export default FormatTest;

