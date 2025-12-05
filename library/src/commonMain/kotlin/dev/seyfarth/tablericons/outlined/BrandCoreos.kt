package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandCoreos: ImageVector
    get() {
        if (_BrandCoreos != null) {
            return _BrandCoreos!!
        }
        _BrandCoreos = ImageVector.Builder(
            name = "Filled.BrandCoreos",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(-3.263f, 3.212f, -3f, 7.654f, -3f, 12f)
                curveToRelative(4.59f, 0.244f, 8.814f, -0.282f, 12f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 9f)
                arcToRelative(4.494f, 4.494f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 5.5f)
            }
        }.build()

        return _BrandCoreos!!
    }

@Suppress("ObjectPropertyName")
private var _BrandCoreos: ImageVector? = null
