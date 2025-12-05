package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Clubs: ImageVector
    get() {
        if (_Clubs != null) {
            return _Clubs!!
        }
        _Clubs = ImageVector.Builder(
            name = "Filled.Clubs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.488f, 2.797f)
                lineToRelative(-0.103f, 0.225f)
                arcToRelative(4.998f, 4.998f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.334f, 2.837f)
                lineToRelative(0.027f, 0.14f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.091f, 9.009f)
                lineToRelative(0.198f, 0.14f)
                arcToRelative(4.998f, 4.998f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.42f, 0.58f)
                lineToRelative(0.174f, -0.066f)
                lineToRelative(-0.773f, 3.095f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, 1.243f)
                horizontalLineToRelative(6f)
                lineToRelative(0.113f, -0.006f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.857f, -1.237f)
                lineToRelative(-0.774f, -3.095f)
                lineToRelative(0.174f, 0.065f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.527f, -9.727f)
                lineToRelative(0.028f, -0.14f)
                arcToRelative(4.997f, 4.997f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.925f, -5.86f)
                close()
            }
        }.build()

        return _Clubs!!
    }

@Suppress("ObjectPropertyName")
private var _Clubs: ImageVector? = null
