package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.SeedlingOff: ImageVector
    get() {
        if (_SeedlingOff != null) {
            return _SeedlingOff!!
        }
        _SeedlingOff = ImageVector.Builder(
            name = "Filled.SeedlingOff",
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
                moveTo(11.412f, 7.407f)
                arcToRelative(6.025f, 6.025f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.82f, -2.82f)
                moveToRelative(-4.592f, -0.587f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                horizontalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.255f, -1.736f)
                moveToRelative(1.51f, -2.514f)
                arcToRelative(5.981f, 5.981f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.235f, -1.75f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.158f, -1.14f, 4.05f, -2.85f, 5.107f)
                moveToRelative(-3.15f, 0.893f)
                horizontalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineToRelative(-8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _SeedlingOff!!
    }

@Suppress("ObjectPropertyName")
private var _SeedlingOff: ImageVector? = null
