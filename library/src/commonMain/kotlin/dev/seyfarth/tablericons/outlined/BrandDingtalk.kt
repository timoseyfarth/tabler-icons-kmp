package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandDingtalk: ImageVector
    get() {
        if (_BrandDingtalk != null) {
            return _BrandDingtalk!!
        }
        _BrandDingtalk = ImageVector.Builder(
            name = "Filled.BrandDingtalk",
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
                moveTo(8f, 7.5f)
                lineToRelative(7.02f, 2.632f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.567f, 1.33f)
                lineToRelative(-1.087f, 2.538f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-5f, 4f)
                lineToRelative(1f, -4f)
                curveToRelative(-3.1f, 0.03f, -3.114f, -3.139f, -4f, -6.5f)
                close()
            }
        }.build()

        return _BrandDingtalk!!
    }

@Suppress("ObjectPropertyName")
private var _BrandDingtalk: ImageVector? = null
