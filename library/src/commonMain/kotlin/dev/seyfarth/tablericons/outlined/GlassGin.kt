package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.GlassGin: ImageVector
    get() {
        if (_GlassGin != null) {
            return _GlassGin!!
        }
        _GlassGin = ImageVector.Builder(
            name = "Filled.GlassGin",
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
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                moveToRelative(-6.5f, 0f)
                arcToRelative(6.5f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 0f)
                arcToRelative(6.5f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.75f, 4.5f)
                curveToRelative(-0.612f, 0.75f, -0.75f, 2f, -0.75f, 3.5f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
                curveToRelative(0f, -1.5f, -0.094f, -2.75f, -0.75f, -3.5f)
            }
        }.build()

        return _GlassGin!!
    }

@Suppress("ObjectPropertyName")
private var _GlassGin: ImageVector? = null
