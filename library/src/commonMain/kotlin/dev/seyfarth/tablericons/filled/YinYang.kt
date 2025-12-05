package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.YinYang: ImageVector
    get() {
        if (_YinYang != null) {
            return _YinYang!!
        }
        _YinYang = ImageVector.Builder(
            name = "Filled.YinYang",
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
                moveTo(8f, 5.072f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14.928f)
                lineToRelative(0.2f, -0.005f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.99f)
                lineToRelative(-0.2f, -0.005f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.2f, -7.995f)
                lineToRelative(0.2f, -0.005f)
                arcToRelative(7.995f, 7.995f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 1.072f)
                close()
                moveTo(12f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                close()
            }
        }.build()

        return _YinYang!!
    }

@Suppress("ObjectPropertyName")
private var _YinYang: ImageVector? = null
