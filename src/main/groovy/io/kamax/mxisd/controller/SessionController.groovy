/*
 * mxisd - Matrix Identity Server Daemon
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.mxisd.controller

import io.kamax.mxisd.exception.NotImplementedException
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.web.bind.annotation.RequestMethod.GET
import static org.springframework.web.bind.annotation.RequestMethod.POST

@RestController
class SessionController {

    @RequestMapping(value = "/_matrix/identity/api/v1/validate/email/requestToken", method = POST)
    String init() {
        throw new NotImplementedException()
    }

    @RequestMapping(value = "/_matrix/identity/api/v1/validate/email/submitToken", method = [GET, POST])
    String validate() {
        throw new NotImplementedException()
    }

    @RequestMapping(value = "/_matrix/identity/api/v1/3pid/getValidated3pid", method = POST)
    String check() {
        throw new NotImplementedException()
    }

    @RequestMapping(value = "/_matrix/identity/api/v1/3pid/bind", method = POST)
    String bind() {
        throw new NotImplementedException()
    }

}
