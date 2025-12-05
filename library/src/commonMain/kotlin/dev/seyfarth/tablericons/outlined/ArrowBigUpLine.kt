package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowBigUpLine: ImageVector
    get() {
        if (_ArrowBigUpLine != null) {
            return _ArrowBigUpLine!!
        }
        _ArrowBigUpLine = ImageVector.Builder(
            name = "Filled.ArrowBigUpLine",
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
                moveTo(9f, 12f)
                horizontalLineToRelative(-3.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.707f, -1.707f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(6.586f, 6.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.707f, 1.707f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _ArrowBigUpLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUpLine: ImageVector? = null
