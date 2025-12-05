package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Nurse: ImageVector
    get() {
        if (_Nurse != null) {
            return _Nurse!!
        }
        _Nurse = ImageVector.Builder(
            name = "Filled.Nurse",
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
                moveTo(12f, 5f)
                curveToRelative(2.941f, 0f, 6.685f, 1.537f, 9f, 3f)
                lineToRelative(-2f, 11f)
                horizontalLineToRelative(-14f)
                lineToRelative(-2f, -11f)
                curveToRelative(2.394f, -1.513f, 6.168f, -3.005f, 9f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _Nurse!!
    }

@Suppress("ObjectPropertyName")
private var _Nurse: ImageVector? = null
