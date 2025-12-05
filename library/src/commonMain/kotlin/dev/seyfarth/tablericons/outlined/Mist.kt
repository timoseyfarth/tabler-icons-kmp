package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Mist: ImageVector
    get() {
        if (_Mist != null) {
            return _Mist!!
        }
        _Mist = ImageVector.Builder(
            name = "Filled.Mist",
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
                moveTo(5f, 5f)
                horizontalLineToRelative(3f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 10f)
                horizontalLineToRelative(11f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 15f)
                horizontalLineToRelative(5f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                horizontalLineToRelative(9f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Mist!!
    }

@Suppress("ObjectPropertyName")
private var _Mist: ImageVector? = null
