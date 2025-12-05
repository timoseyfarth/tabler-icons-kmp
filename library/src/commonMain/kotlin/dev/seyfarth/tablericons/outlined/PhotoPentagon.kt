package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PhotoPentagon: ImageVector
    get() {
        if (_PhotoPentagon != null) {
            return _PhotoPentagon!!
        }
        _PhotoPentagon = ImageVector.Builder(
            name = "Filled.PhotoPentagon",
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
                moveTo(13.163f, 2.168f)
                lineToRelative(8.021f, 5.828f)
                curveToRelative(0.694f, 0.504f, 0.984f, 1.397f, 0.719f, 2.212f)
                lineToRelative(-3.064f, 9.43f)
                arcToRelative(1.978f, 1.978f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.881f, 1.367f)
                horizontalLineToRelative(-9.916f)
                arcToRelative(1.978f, 1.978f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.881f, -1.367f)
                lineToRelative(-3.064f, -9.43f)
                arcToRelative(1.978f, 1.978f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.719f, -2.212f)
                lineToRelative(8.021f, -5.828f)
                arcToRelative(1.978f, 1.978f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.326f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                lineToRelative(4f, -4f)
                curveToRelative(0.928f, -0.893f, 2.072f, -0.893f, 3f, 0f)
                lineToRelative(5f, 5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14f)
                lineToRelative(1f, -1f)
                curveToRelative(0.928f, -0.893f, 2.072f, -0.893f, 3f, 0f)
                lineToRelative(2f, 2f)
            }
        }.build()

        return _PhotoPentagon!!
    }

@Suppress("ObjectPropertyName")
private var _PhotoPentagon: ImageVector? = null
