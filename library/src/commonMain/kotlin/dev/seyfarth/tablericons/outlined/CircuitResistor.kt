package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CircuitResistor: ImageVector
    get() {
        if (_CircuitResistor != null) {
            return _CircuitResistor!!
        }
        _CircuitResistor = ImageVector.Builder(
            name = "Filled.CircuitResistor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, -5f)
                lineToRelative(3f, 10f)
                lineToRelative(3f, -10f)
                lineToRelative(3f, 10f)
                lineToRelative(3f, -10f)
                lineToRelative(1.5f, 5f)
                horizontalLineToRelative(2.5f)
            }
        }.build()

        return _CircuitResistor!!
    }

@Suppress("ObjectPropertyName")
private var _CircuitResistor: ImageVector? = null
