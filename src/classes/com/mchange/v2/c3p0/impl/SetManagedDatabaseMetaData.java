/*
 * Distributed as part of c3p0 v.0.8.4-test2
 *
 * Copyright (C) 2003 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v2.c3p0.impl;

import java.sql.*;
import java.util.Set;

final class SetManagedDatabaseMetaData extends C3P0DatabaseMetaData
{
    Set activeResultSets;

    SetManagedDatabaseMetaData( DatabaseMetaData inner, Set activeResultSets )
    {
	super( inner );
	this.activeResultSets = activeResultSets;
    }

    public ResultSet getProcedures(String a, String b, String c) throws SQLException
    {
        return new SetManagedResultSet( inner.getProcedures(a, b, c), activeResultSets );
    }

    public ResultSet getProcedureColumns(String a, String b, String c, String d) throws SQLException
    {
        return new SetManagedResultSet( inner.getProcedureColumns(a, b, c, d), activeResultSets );
    }

    public ResultSet getTables(String a, String b, String c, String[] d) throws SQLException
    {
        return new SetManagedResultSet( inner.getTables(a, b, c, d), activeResultSets );
    }

    public ResultSet getSchemas() throws SQLException
    {
        return new SetManagedResultSet( inner.getSchemas(), activeResultSets );
    }

    public ResultSet getCatalogs() throws SQLException
    {
        return new SetManagedResultSet( inner.getCatalogs(), activeResultSets );
    }

    public ResultSet getTableTypes() throws SQLException
    {
        return new SetManagedResultSet( inner.getTableTypes(), activeResultSets );
    }

    public ResultSet getColumns(String a, String b, String c, String d) throws SQLException
    {
        return new SetManagedResultSet( inner.getColumns(a, b, c, d), activeResultSets );
    }

    public ResultSet getColumnPrivileges(String a, String b, String c, String d) throws SQLException
    {
        return new SetManagedResultSet( inner.getColumnPrivileges(a, b, c, d), activeResultSets );
    }

    public ResultSet getTablePrivileges(String a, String b, String c) throws SQLException
    {
        return new SetManagedResultSet( inner.getTablePrivileges(a, b, c), activeResultSets );
    }

    public ResultSet getBestRowIdentifier(String a, String b, String c, int d, boolean e) throws SQLException
    {
        return new SetManagedResultSet( inner.getBestRowIdentifier(a, b, c, d, e), activeResultSets );
    }

    public ResultSet getVersionColumns(String a, String b, String c) throws SQLException
    {
        return new SetManagedResultSet( inner.getVersionColumns(a, b, c), activeResultSets );
    }

    public ResultSet getPrimaryKeys(String a, String b, String c) throws SQLException
    {
        return new SetManagedResultSet( inner.getPrimaryKeys(a, b, c), activeResultSets );
    }

    public ResultSet getImportedKeys(String a, String b, String c) throws SQLException
    {
        return new SetManagedResultSet( inner.getImportedKeys(a, b, c), activeResultSets );
    }

    public ResultSet getExportedKeys(String a, String b, String c) throws SQLException
    {
        return new SetManagedResultSet( inner.getExportedKeys(a, b, c), activeResultSets );
    }

    public ResultSet getCrossReference(String a, String b, String c, String d, String e, String f) throws SQLException
    {
        return new SetManagedResultSet( inner.getCrossReference(a, b, c, d, e, f), activeResultSets );
    }

    public ResultSet getTypeInfo() throws SQLException
    {
        return new SetManagedResultSet( inner.getTypeInfo(), activeResultSets );
    }

    public ResultSet getIndexInfo(String a, String b, String c, boolean d, boolean e) throws SQLException
    {
        return new SetManagedResultSet( inner.getIndexInfo(a, b, c, d, e), activeResultSets );
    }

    public ResultSet getUDTs(String a, String b, String c, int[] d) throws SQLException
    {
        return new SetManagedResultSet( inner.getUDTs(a, b, c, d), activeResultSets );
    }
}


