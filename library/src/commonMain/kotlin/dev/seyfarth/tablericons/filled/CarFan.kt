package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CarFan: ImageVector
    get() {
        if (_CarFan != null) {
            return _CarFan!!
        }
        _CarFan = ImageVector.Builder(
            name = "Filled.CarFan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.363f, 2.068f)
                lineToRelative(4.912f, 1.914f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 4.646f)
                lineToRelative(-3.045f, 2.371f)
                lineToRelative(6.09f, 0.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.932f, 1.363f)
                lineToRelative(-1.914f, 4.912f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.646f, 0.68f)
                lineToRelative(-2.372f, -3.047f)
                verticalLineToRelative(6.092f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.363f, 0.932f)
                lineToRelative(-4.912f, -1.914f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, -4.646f)
                lineToRelative(3.045f, -2.372f)
                horizontalLineToRelative(-6.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.932f, -1.363f)
                lineToRelative(1.914f, -4.912f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.646f, -0.68f)
                lineToRelative(2.371f, 3.044f)
                lineToRelative(0.001f, -6.089f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.363f, -0.932f)
            }
        }.build()

        return _CarFan!!
    }

@Suppress("ObjectPropertyName")
private var _CarFan: ImageVector? = null
