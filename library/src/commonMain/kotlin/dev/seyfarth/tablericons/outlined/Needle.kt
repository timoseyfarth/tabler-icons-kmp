package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Needle: ImageVector
    get() {
        if (_Needle != null) {
            return _Needle!!
        }
        _Needle = ImageVector.Builder(
            name = "Filled.Needle",
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
                moveTo(3f, 21f)
                curveToRelative(-0.667f, -0.667f, 3.262f, -6.236f, 11.785f, -16.709f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.078f, 4.791f)
                curveToRelative(-10.575f, 8.612f, -16.196f, 12.585f, -16.863f, 11.918f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 6.5f)
                lineToRelative(-1f, 1f)
            }
        }.build()

        return _Needle!!
    }

@Suppress("ObjectPropertyName")
private var _Needle: ImageVector? = null
