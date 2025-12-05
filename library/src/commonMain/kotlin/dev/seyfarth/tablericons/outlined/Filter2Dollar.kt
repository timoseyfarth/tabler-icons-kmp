package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Filter2Dollar: ImageVector
    get() {
        if (_Filter2Dollar != null) {
            return _Filter2Dollar!!
        }
        _Filter2Dollar = ImageVector.Builder(
            name = "Filled.Filter2Dollar",
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
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                horizontalLineToRelative(-2f)
                moveToRelative(-2f, 6f)
                horizontalLineToRelative(2f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(1f)
                moveToRelative(0f, -1f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.398f, 0f, 0.779f, -0.158f, 1.061f, -0.439f)
                curveToRelative(0.281f, -0.281f, 0.439f, -0.663f, 0.439f, -1.061f)
                curveToRelative(0f, -0.398f, -0.158f, -0.779f, -0.439f, -1.061f)
                curveToRelative(-0.281f, -0.281f, -0.663f, -0.439f, -1.061f, -0.439f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.398f, 0f, -0.779f, -0.158f, -1.061f, -0.439f)
                curveToRelative(-0.281f, -0.281f, -0.439f, -0.663f, -0.439f, -1.061f)
                curveToRelative(0f, -0.398f, 0.158f, -0.779f, 0.439f, -1.061f)
                curveToRelative(0.281f, -0.281f, 0.663f, -0.439f, 1.061f, -0.439f)
                horizontalLineToRelative(0.5f)
                moveToRelative(0f, -1f)
                verticalLineToRelative(1f)
            }
        }.build()

        return _Filter2Dollar!!
    }

@Suppress("ObjectPropertyName")
private var _Filter2Dollar: ImageVector? = null
