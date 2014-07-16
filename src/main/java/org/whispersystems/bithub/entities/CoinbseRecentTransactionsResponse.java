/**
 * Copyright (C) 2013 Open WhisperSystems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.whispersystems.bithub.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.LinkedList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinbseRecentTransactionsResponse {

  @JsonProperty
  @NotNull
  private List<CoinbaseTransactionWrapper> transactions;

  public List<CoinbaseTransaction> getTransactions() {
    List<CoinbaseTransaction> rawTransactions = new LinkedList<CoinbaseTransaction>();

    for (CoinbaseTransactionWrapper transactionWrapper : transactions) {
      rawTransactions.add(transactionWrapper.getTransaction());
    }

    return rawTransactions;
  }
}