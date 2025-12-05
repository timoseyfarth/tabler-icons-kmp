package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Filter2Cancel: ImageVector
    get() {
        if (_Filter2Cancel != null) {
            return _Filter2Cancel!!
        }
        _Filter2Cancel = ImageVector.Builder(
            name = "Filled.Filter2Cancel",
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
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 21f)
                lineToRelative(4f, -4f)
                moveToRelative(-5f, 2f)
                curveToRelative(0f, 0.796f, 0.316f, 1.559f, 0.879f, 2.121f)
                curveToRelative(0.563f, 0.563f, 1.326f, 0.879f, 2.121f, 0.879f)
                curveToRelative(0.796f, 0f, 1.559f, -0.316f, 2.121f, -0.879f)
                curveToRelative(0.563f, -0.563f, 0.879f, -1.326f, 0.879f, -2.121f)
                curveToRelative(0f, -0.796f, -0.316f, -1.559f, -0.879f, -2.121f)
                curveToRelative(-0.563f, -0.563f, -1.326f, -0.879f, -2.121f, -0.879f)
                curveToRelative(-0.796f, 0f, -1.559f, 0.316f, -2.121f, 0.879f)
                curveToRelative(-0.563f, 0.563f, -0.879f, 1.326f, -0.879f, 2.121f)
                close()
            }
        }.build()

        return _Filter2Cancel!!
    }

@Suppress("ObjectPropertyName")
private var _Filter2Cancel: ImageVector? = null
