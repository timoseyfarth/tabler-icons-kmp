package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Copyleft: ImageVector
    get() {
        if (_Copyleft != null) {
            return _Copyleft!!
        }
        _Copyleft = ImageVector.Builder(
            name = "Filled.Copyleft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(14.883f, 9.229f)
                arcToRelative(4.016f, 4.016f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.543f, -0.23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.32f, 1.502f)
                arcToRelative(2.016f, 2.016f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.783f, 0.116f)
                arcToRelative(1.993f, 1.993f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.766f)
                arcToRelative(2.016f, 2.016f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.783f, 0.116f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 1.501f)
                arcToRelative(4.016f, 4.016f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.543f, -0.23f)
                arcToRelative(3.993f, 3.993f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.542f)
                close()
            }
        }.build()

        return _Copyleft!!
    }

@Suppress("ObjectPropertyName")
private var _Copyleft: ImageVector? = null
