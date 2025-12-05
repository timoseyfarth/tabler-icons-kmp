package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Omega: ImageVector
    get() {
        if (_Omega != null) {
            return _Omega!!
        }
        _Omega = ImageVector.Builder(
            name = "Filled.Omega",
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
                moveTo(4f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                arcToRelative(7.35f, 7.35f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _Omega!!
    }

@Suppress("ObjectPropertyName")
private var _Omega: ImageVector? = null
