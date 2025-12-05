package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Marquee2: ImageVector
    get() {
        if (_Marquee2 != null) {
            return _Marquee2!!
        }
        _Marquee2 = ImageVector.Builder(
            name = "Filled.Marquee2",
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
                moveTo(4f, 6f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(1f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-1f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(-2f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-1f)
                moveToRelative(0f, -5f)
                verticalLineToRelative(-2f)
            }
        }.build()

        return _Marquee2!!
    }

@Suppress("ObjectPropertyName")
private var _Marquee2: ImageVector? = null
