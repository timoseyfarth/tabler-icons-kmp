package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.XboxX: ImageVector
    get() {
        if (_XboxX != null) {
            return _XboxX!!
        }
        _XboxX = ImageVector.Builder(
            name = "Filled.XboxX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                moveToRelative(3.6f, 5.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 0.2f)
                lineToRelative(-2.2f, 2.933f)
                lineToRelative(-2.2f, -2.933f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.6f, 1.2f)
                lineToRelative(2.55f, 3.4f)
                lineToRelative(-2.55f, 3.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.6f, 1.2f)
                lineToRelative(2.2f, -2.933f)
                lineToRelative(2.2f, 2.933f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -1.2f)
                lineToRelative(-2.55f, -3.4f)
                lineToRelative(2.55f, -3.4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.2f, -1.4f)
            }
        }.build()

        return _XboxX!!
    }

@Suppress("ObjectPropertyName")
private var _XboxX: ImageVector? = null
