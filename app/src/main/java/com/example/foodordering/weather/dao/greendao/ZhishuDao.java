package com.example.foodordering.weather.dao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "ZHISHU".
*/
public class ZhishuDao extends AbstractDao<Zhishu, Void> {

    public static final String TABLENAME = "ZHISHU";

    /**
     * Properties of entity Zhishu.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Areaid = new Property(0, String.class, "areaid", false, "AREAID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Level = new Property(2, String.class, "level", false, "LEVEL");
        public final static Property Text = new Property(3, String.class, "text", false, "TEXT");
        public final static Property Detail = new Property(4, String.class, "detail", false, "DETAIL");
    };


    public ZhishuDao(DaoConfig config) {
        super(config);
    }
    
    public ZhishuDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ZHISHU\" (" + //
                "\"AREAID\" TEXT," + // 0: areaid
                "\"NAME\" TEXT," + // 1: name
                "\"LEVEL\" TEXT," + // 2: level
                "\"TEXT\" TEXT," + // 3: text
                "\"DETAIL\" TEXT);"); // 4: detail
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ZHISHU\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Zhishu entity) {
        stmt.clearBindings();
 
        String areaid = entity.getAreaid();
        if (areaid != null) {
            stmt.bindString(1, areaid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String level = entity.getLevel();
        if (level != null) {
            stmt.bindString(3, level);
        }
 
        String text = entity.getText();
        if (text != null) {
            stmt.bindString(4, text);
        }
 
        String detail = entity.getDetail();
        if (detail != null) {
            stmt.bindString(5, detail);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public Zhishu readEntity(Cursor cursor, int offset) {
        Zhishu entity = new Zhishu( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // areaid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // level
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // text
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // detail
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Zhishu entity, int offset) {
        entity.setAreaid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLevel(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setText(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDetail(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(Zhishu entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(Zhishu entity) {
        return null;
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
