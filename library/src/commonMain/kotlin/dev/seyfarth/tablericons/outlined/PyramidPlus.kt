package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PyramidPlus: ImageVector
    get() {
        if (_PyramidPlus != null) {
            return _PyramidPlus!!
        }
        _PyramidPlus = ImageVector.Builder(
            name = "Filled.PyramidPlus",
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
                moveTo(18.719f, 11.985f)
                lineToRelative(-5.889f, -9.539f)
                arcToRelative(0.999f, 0.999f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.664f, 0f)
                lineToRelative(-8.54f, 13.836f)
                arcToRelative(1.005f, 1.005f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.386f, 1.452f)
                lineToRelative(8.092f, 4.054f)
                arcToRelative(1.994f, 1.994f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.789f, 0f)
                lineToRelative(0.149f, -0.074f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _PyramidPlus!!
    }

@Suppress("ObjectPropertyName")
private var _PyramidPlus: ImageVector? = null
