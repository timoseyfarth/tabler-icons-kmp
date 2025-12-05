package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandTwitch: ImageVector
    get() {
        if (_BrandTwitch != null) {
            return _BrandTwitch!!
        }
        _BrandTwitch = ImageVector.Builder(
            name = "Filled.BrandTwitch",
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
                moveTo(4f, 5f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(5.584f)
                curveToRelative(0.266f, 0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineToRelative(2.415f, -2.414f)
                curveToRelative(0.187f, -0.188f, 0.293f, -0.442f, 0.293f, -0.708f)
                verticalLineToRelative(-8.585f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                lineToRelative(0f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineToRelative(0f, 4f)
            }
        }.build()

        return _BrandTwitch!!
    }

@Suppress("ObjectPropertyName")
private var _BrandTwitch: ImageVector? = null
