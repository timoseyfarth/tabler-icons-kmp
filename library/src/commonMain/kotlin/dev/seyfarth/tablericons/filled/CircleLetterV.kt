package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleLetterV: ImageVector
    get() {
        if (_CircleLetterV != null) {
            return _CircleLetterV!!
        }
        _CircleLetterV = ImageVector.Builder(
            name = "Filled.CircleLetterV",
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
                moveToRelative(2.243f, 5.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.213f, 0.727f)
                lineToRelative(-1.03f, 4.118f)
                lineToRelative(-1.03f, -4.118f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.94f, 0.486f)
                lineToRelative(2f, 8f)
                curveToRelative(0.252f, 1.01f, 1.688f, 1.01f, 1.94f, 0f)
                lineToRelative(2f, -8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.727f, -1.213f)
            }
        }.build()

        return _CircleLetterV!!
    }

@Suppress("ObjectPropertyName")
private var _CircleLetterV: ImageVector? = null
