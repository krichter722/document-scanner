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
package richtercloud.document.scanner.ocr;

import richtercloud.document.scanner.ifaces.OCREngineConf;
import richtercloud.document.scanner.ifaces.OCREngine;

/**
 *
 * @author richter
 * @param <E> the type of {@link OCREngine} to create
 * @param <C> the type of {@link OCREngineConf} to use for creation
 */
public interface OCREngineFactory<E extends OCREngine, C extends OCREngineConf> {

    /**
     * Creates a new {@link OCREngine}.
     * @return the created {@link OCREngine}
     */
    /*
    internal implementation notes:
    - don't provide a OCREngineConf argument in order to force implementations
    to deal with references which should facilitate updating configuration
    instantly
    */
    E create(C oCREngineConf);
}
