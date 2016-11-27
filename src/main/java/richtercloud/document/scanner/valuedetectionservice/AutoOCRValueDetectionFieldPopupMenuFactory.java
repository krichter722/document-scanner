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
package richtercloud.document.scanner.valuedetectionservice;

import java.lang.reflect.Field;
import java.util.Map;
import javax.swing.JComponent;
import richtercloud.document.scanner.gui.AbstractFieldActionListener;
import richtercloud.document.scanner.gui.AbstractFieldPopupMenuFactory;
import richtercloud.document.scanner.setter.ValueSetter;
import richtercloud.message.handler.MessageHandler;
import richtercloud.reflection.form.builder.ReflectionFormPanel;

/**
 *
 * @author richter
 */
public class AutoOCRValueDetectionFieldPopupMenuFactory extends AbstractFieldPopupMenuFactory {
    private final Object value;
    private final MessageHandler messageHandler;
    private final Map<Class<? extends JComponent>, ValueSetter<?,?>> valueSetterMapping;

    public AutoOCRValueDetectionFieldPopupMenuFactory(Object value,
            MessageHandler messageHandler,
            Map<Class<? extends JComponent>, ValueSetter<?, ?>> valueSetterMapping) {
        this.value = value;
        this.messageHandler = messageHandler;
        this.valueSetterMapping = valueSetterMapping;
    }

    @Override
    protected AbstractFieldActionListener createFieldActionListener(Field field,
            ReflectionFormPanel reflectionFormPanel) {
        return new AutoOCRValueDetectionFieldActionListener(value,
                field,
                reflectionFormPanel,
                valueSetterMapping,
                messageHandler);
    }
}