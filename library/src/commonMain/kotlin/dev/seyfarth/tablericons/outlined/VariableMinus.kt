package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.VariableMinus: ImageVector
    get() {
        if (_VariableMinus != null) {
            return _VariableMinus!!
        }
        _VariableMinus = ImageVector.Builder(
            name = "Filled.VariableMinus",
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
                moveTo(8f, 16f)
                curveToRelative(1.5f, 0f, 3f, -2f, 4f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4f, -3.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 4f)
                curveToRelative(-2.5f, 5f, -2.5f, 10f, 0f, 16f)
                moveToRelative(14f, -16f)
                curveToRelative(1.775f, 3.55f, 2.29f, 7.102f, 1.544f, 11.01f)
                moveToRelative(-11.544f, -6.01f)
                horizontalLineToRelative(1f)
                curveToRelative(1f, 0f, 1f, 1f, 2.016f, 3.527f)
                curveToRelative(0.782f, 1.966f, 0.943f, 3f, 1.478f, 3.343f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                curveToRelative(1.5f, 0f, 3f, -2f, 4f, -3.5f)
                reflectiveCurveToRelative(2.5f, -3.5f, 4f, -3.5f)
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
        }.build()

        return _VariableMinus!!
    }

@Suppress("ObjectPropertyName")
private var _VariableMinus: ImageVector? = null
