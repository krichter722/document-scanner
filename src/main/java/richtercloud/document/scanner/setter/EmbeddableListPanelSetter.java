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
package richtercloud.document.scanner.setter;

import richtercloud.document.scanner.gui.ocrresult.OCRResult;
import richtercloud.reflection.form.builder.ResetException;
import richtercloud.reflection.form.builder.TransformationException;
import richtercloud.reflection.form.builder.jpa.panels.EmbeddableListPanel;

/**
 *
 * @author richter
 */
public class EmbeddableListPanelSetter implements ValueSetter<Object, EmbeddableListPanel> {
    private final static EmbeddableListPanelSetter INSTANCE = new EmbeddableListPanelSetter();

    public static EmbeddableListPanelSetter getInstance() {
        return INSTANCE;
    }

    @Override
    public void setValue(Object value,
            EmbeddableListPanel comp) throws TransformationException,
            NoSuchFieldException,
            ResetException {
        comp.addValue(value);
    }

    @Override
    public void setOCRResult(OCRResult oCRResult, EmbeddableListPanel comp) {
        //There's no easy way to set multiple values in form of a list
        //-> better to be handled in auto OCR value detection
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSupportsOCRResultSetting() {
        return false;
    }
}
