package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandGravatar: ImageVector
    get() {
        if (_BrandGravatar != null) {
            return _BrandGravatar!!
        }
        _BrandGravatar = ImageVector.Builder(
            name = "Filled.BrandGravatar",
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
                moveTo(5.64f, 5.632f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.36f, -2.632f)
                verticalLineToRelative(7.714f)
            }
        }.build()

        return _BrandGravatar!!
    }

@Suppress("ObjectPropertyName")
private var _BrandGravatar: ImageVector? = null
