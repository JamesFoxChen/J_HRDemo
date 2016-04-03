package com.fly.base.bean;



/**
 * 
 * 
 * <p>
 * Title: Page.java
 * </p>
 * 
 * <p>
 * Description: 分页信息
 * </p>
 * 
 * @author wangx
 * 
 * @date 2016-02-01 21:03:03 +0800
 * 
 */
public class Page {
    // 默认的每页记录数
    public static final long DEFAULT_PAGE_SIZE = 5;

    // 每页的记录数
    private long pageSize = DEFAULT_PAGE_SIZE;

    // 当前页
    private long pageNo = 1;

    // 总行数
    private long rowCount;

    // 总页数
    private long pageCount;
    
    // 起始数
    private long pageStart;

    // 结束数
    private long pageEnd;
    
    public Page() {

    }

    public Page(long pageNo) {

        this.pageNo = pageNo;

    }

    public Page(long pageSize, long pageNo) {

        this.pageSize = pageSize;

        this.pageNo = pageNo;

    }

    public long getPageSize() {

        return pageSize;

    }

    public void setPageSize(long pageSize) {

        this.pageSize = pageSize;

    }

    public long getPageNo() {

        return pageNo;

    }

    public void setPageNo(long pageNo) {

        this.pageNo = pageNo;

    }

    public long getRowCount() {

        return rowCount;

    }

    public void setRowCount(long rowCount) {

        this.rowCount = rowCount;

        if (rowCount % pageSize == 0) {

            this.pageCount = rowCount / pageSize;

        } else {

            this.pageCount = rowCount / pageSize + 1;

        }
        
        this.pageStart = (pageNo - 1) * pageSize;
        this.pageEnd = pageNo * pageSize;
    }

    public long getPageCount() {

        return pageCount;

    }

    public void setPageCount(long pageCount) {

        this.pageCount = pageCount;

    }

    public long getPageStart() {
        return pageStart;
    }

    public void setPageStart(long pageStart) {
        this.pageStart = (pageNo - 1) * pageSize;
    }

    public long getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(long pageEnd) {
        this.pageEnd = pageNo * pageSize;
    }
    
    

}
