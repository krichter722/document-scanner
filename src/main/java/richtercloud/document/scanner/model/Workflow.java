/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package richtercloud.document.scanner.model;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import richtercloud.reflection.form.builder.ClassInfo;

/**
 *
 * @author richter
 */
@Entity
@Inheritance
@ClassInfo(name="Workflow")
public class Workflow extends Identifiable {
    private static final long serialVersionUID = 1L;
    @OneToMany
    private List<WorkflowItem> items = new LinkedList<>();

    protected Workflow() {
    }

    /**
     * @return the items
     */
    public List<WorkflowItem> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<WorkflowItem> items) {
        this.items = items;
    }
}