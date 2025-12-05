package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PencilPause: ImageVector
    get() {
        if (_PencilPause != null) {
            return _PencilPause!!
        }
        _PencilPause = ImageVector.Builder(
            name = "Filled.PencilPause",
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
                moveTo(4f, 20f)
                horizontalLineToRelative(4f)
                lineToRelative(10.5f, -10.5f)
                arcToRelative(2.828f, 2.828f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, -4f)
                lineToRelative(-10.5f, 10.5f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 6.5f)
                lineToRelative(4f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 17f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _PencilPause!!
    }

@Suppress("ObjectPropertyName")
private var _PencilPause: ImageVector? = null
