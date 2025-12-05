package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandFiverr: ImageVector
    get() {
        if (_BrandFiverr != null) {
            return _BrandFiverr!!
        }
        _BrandFiverr = ImageVector.Builder(
            name = "Filled.BrandFiverr",
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
                moveTo(15f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.033f)
                arcToRelative(1.967f, 1.967f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -1.967f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()

        return _BrandFiverr!!
    }

@Suppress("ObjectPropertyName")
private var _BrandFiverr: ImageVector? = null
