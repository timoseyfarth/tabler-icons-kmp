package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandSteam: ImageVector
    get() {
        if (_BrandSteam != null) {
            return _BrandSteam!!
        }
        _BrandSteam = ImageVector.Builder(
            name = "Filled.BrandSteam",
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
                moveTo(16.5f, 5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.653f, 8.953f)
                lineToRelative(-4.347f, 3.009f)
                lineToRelative(0f, 0.038f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.824f, 3f)
                lineToRelative(-0.176f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.94f, -2.402f)
                lineToRelative(-2.56f, -1.098f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.51f, 1.755f)
                arcToRelative(2.989f, 2.989f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.834f, -0.635f)
                lineToRelative(2.727f, -3.818f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.429f, -5.302f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 9.5f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _BrandSteam!!
    }

@Suppress("ObjectPropertyName")
private var _BrandSteam: ImageVector? = null
