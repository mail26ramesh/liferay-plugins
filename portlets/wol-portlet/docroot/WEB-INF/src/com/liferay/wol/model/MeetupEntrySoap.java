/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.wol.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="MeetupEntrySoap.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class MeetupEntrySoap implements Serializable {
	public static MeetupEntrySoap toSoapModel(MeetupEntry model) {
		MeetupEntrySoap soapModel = new MeetupEntrySoap();

		soapModel.setMeetupEntryId(model.getMeetupEntryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setAddressId(model.getAddressId());
		soapModel.setTotalAttendees(model.getTotalAttendees());
		soapModel.setMaxAttendees(model.getMaxAttendees());
		soapModel.setPrice(model.getPrice());

		return soapModel;
	}

	public static MeetupEntrySoap[] toSoapModels(List<MeetupEntry> models) {
		List<MeetupEntrySoap> soapModels = new ArrayList<MeetupEntrySoap>(models.size());

		for (MeetupEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MeetupEntrySoap[soapModels.size()]);
	}

	public MeetupEntrySoap() {
	}

	public long getPrimaryKey() {
		return _meetupEntryId;
	}

	public void setPrimaryKey(long pk) {
		setMeetupEntryId(pk);
	}

	public long getMeetupEntryId() {
		return _meetupEntryId;
	}

	public void setMeetupEntryId(long meetupEntryId) {
		_meetupEntryId = meetupEntryId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public long getAddressId() {
		return _addressId;
	}

	public void setAddressId(long addressId) {
		_addressId = addressId;
	}

	public int getTotalAttendees() {
		return _totalAttendees;
	}

	public void setTotalAttendees(int totalAttendees) {
		_totalAttendees = totalAttendees;
	}

	public int getMaxAttendees() {
		return _maxAttendees;
	}

	public void setMaxAttendees(int maxAttendees) {
		_maxAttendees = maxAttendees;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	private long _meetupEntryId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private String _description;
	private Date _startDate;
	private Date _endDate;
	private long _addressId;
	private int _totalAttendees;
	private int _maxAttendees;
	private double _price;
}