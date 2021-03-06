/*
rebuild - Building your business-systems freely.
Copyright (C) 2019 devezhao <zhaofang123@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package com.rebuild.server.service.bizz;

import com.rebuild.server.TestSupport;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author devezhao-mbp zhaofang123@gmail.com
 * @since 2019/10/29
 */
public class ChangeOwningDeptTaskTest extends TestSupport {

    @Test
    public void exec() throws Exception {
        new ChangeOwningDeptTask(SIMPLE_USER, DepartmentService.ROOT_DEPT).exec();
    }
}