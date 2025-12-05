package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CircleLetterR: ImageVector
    get() {
        if (_CircleLetterR != null) {
            return _CircleLetterR!!
        }
        _CircleLetterR = ImageVector.Builder(
            name = "Filled.CircleLetterR",
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
                moveToRelative(0f, 5f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.883f, -0.993f)
                verticalLineToRelative(-2.332f)
                lineToRelative(2.2f, 2.932f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 0.2f)
                lineToRelative(0.096f, -0.081f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.104f, -1.319f)
                lineToRelative(-1.903f, -2.538f)
                lineToRelative(0.115f, -0.037f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.012f, -5.825f)
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()

        return _CircleLetterR!!
    }

@Suppress("ObjectPropertyName")
private var _CircleLetterR: ImageVector? = null
